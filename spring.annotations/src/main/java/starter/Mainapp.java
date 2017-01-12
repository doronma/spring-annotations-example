package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import beans.FirstBean;


public class Mainapp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"Beans.xml"},false);
		((ConfigurableEnvironment)context.getEnvironment()).setActiveProfiles("dev");
		((ClassPathXmlApplicationContext)context).refresh();
		
		
		FirstBean firstBean = (FirstBean)context.getBean("firstBean");
		firstBean.sayHello();
		((ConfigurableApplicationContext)context).close();
		System.out.println("ok");
		
		
	}

}
