package ru.biryukov;

public class Point {
	public double x;
	public double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2));
	}
}