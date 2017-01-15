package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Circle;
import model.Triangle;
@Service
public class ShapeService {
	
	private Circle circle;
	private Triangle triangle ;

	public Circle getCircle() {
		return circle;
	}

	@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}
	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public ShapeService() {
		// TODO Auto-generated constructor stub
	}

}
