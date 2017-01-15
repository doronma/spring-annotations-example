package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import beans.FirstBean;
import model.Triangle;
import services.ShapeService;

public class Mainapp {
	public static void main(String[] args) {
		System.out.println("Annotations Application");
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Beans.xml" }, false);
		ConfigurableEnvironment env = (ConfigurableEnvironment) context.getEnvironment();
		env.setActiveProfiles("dev");
		System.out.println("my Name Property is - " + env.getProperty("myName"));
		((ClassPathXmlApplicationContext) context).refresh();

		FirstBean firstBean = (FirstBean) context.getBean("firstBean");
		firstBean.sayHello();
		
		ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		System.out.println((shapeService.getTriangle().getName()));
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.run();
		triangle.setName("Doron");
		String result = triangle.runMe();
		System.out.println(result);
		triangle.checkMe();
//		triangle.throwExample();

		
		
		((ConfigurableApplicationContext) context).close();
		System.out.println("ok");

	}

}
