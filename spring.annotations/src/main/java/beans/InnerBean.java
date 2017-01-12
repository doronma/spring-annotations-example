package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Scope("singleton")
@Service("The Service")
public class InnerBean {

	public InnerBean() {
		// TODO Auto-generated constructor stub
	}
	
	String getMessage(){
		return "Hello World";
	}
	@PreDestroy
	public void  closeUp(){
		System.out.println(getClass().getName() + "In CloseUp");
	}
	@PostConstruct
	public void init(){
		System.out.println(getClass().getName() + "In Init");
	}

}
