package services;

import org.springframework.stereotype.Service;

@Service("bestService")
public class MyService {

	public MyService() {
		// TODO Auto-generated constructor stub
	}
	
	public String doService(){
		return "Service Done";
	}

}
