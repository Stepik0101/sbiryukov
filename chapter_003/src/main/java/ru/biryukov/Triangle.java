package ru.biryukov;

public class Triangle {
	public Point a;
	public Point b;
	public Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double perimeter = a + b + c;
		return Math.sqrt(perimeter *(perimeter - a) * (perimeter - b) * (perimeter - c));
	}
}