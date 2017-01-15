package model;

import org.springframework.stereotype.Component;

import annotations.Loggable;
@Component
public class Triangle {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void run(){
		System.out.println("TriangleRun");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am a Triangle....";
	}
	
	public void throwExample(){
		throw new RuntimeException("DummtException");
	}
	
	public String runMe(){
		System.out.println("in runMe");
		return "RunMe Value";
	}
	
	@Loggable()
	public void checkMe(){
		System.out.println("in checkMe");
	}
	

}
