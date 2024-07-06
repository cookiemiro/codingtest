package classtest.polymorphism.main;

import classtest.polymorphism.Circle;
import classtest.polymorphism.Rectangular;
import classtest.polymorphism.Shape;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle(10.0);
		shape[1] = new Rectangular(100.0, "2");

		for (Shape s : shape) {
			s.print();
		}
	}
}