package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import resources.SomeResource;
import services.MyService;

@Component
public class FirstBean {

	private String myName;

	@Autowired
	private InnerBean innerBean;

	@Autowired
	@Qualifier("messageHolder2")
	private MessageHolder messageHolder;

	@Resource(name = "theResource")
	private SomeResource someResource;

	@Resource(name = "bestService")
	private MyService myService;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public FirstBean() {
		// TODO Auto-generated constructor stub
	}

	public void sayHello() {
		System.out.println(innerBean.getMessage());
		System.out.println(messageHolder.getMessage());
		System.out.println(someResource.getResource());
		System.out.println((myService.doService()));

	}

}
