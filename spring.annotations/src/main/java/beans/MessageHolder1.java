package beans;

import org.springframework.stereotype.Component;

@Component

public class MessageHolder1 implements MessageHolder {

	public MessageHolder1() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Message1";
	}

}
