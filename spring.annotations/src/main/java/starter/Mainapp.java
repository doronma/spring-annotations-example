package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import beans.FirstBean;


public class Mainapp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"Beans.xml"},false);
		ConfigurableEnvironment env = (ConfigurableEnvironment)context.getEnvironment();
		env.setActiveProfiles("dev");
		System.out.println("my Name Property is - " + env.getProperty("myName"));
		((ClassPathXmlApplicationContext)context).refresh();
		
		
		FirstBean firstBean = (FirstBean)context.getBean("firstBean");
		firstBean.sayHello();
		((ConfigurableApplicationContext)context).close();
		System.out.println("ok");
		
		
	}

}
