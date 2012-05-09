package com.visionarysoftwaresolutions.boids.space;

public class Point2D implements Point {

	protected int x;
	protected int y;

	public Point2D(int i, int j) {
		x = i;
		y = j;
	}

	@Override
	public boolean equals(Object another) {
	    return another instanceof Point2D &&
	           ( ((Point2D) another).x == this.x &&
	             ((Point2D) another).y == this.y
	           );
	}

	@Override
	public int hashCode() {
	    return 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public Point add(Point toAdd) {
		Point2D addition= (Point2D) toAdd;
		return new Point2D(x+addition.getX(), y+addition.getY());
	}
	
	@Override
	public String toString(){
		return String.format("(%d, %d)", getX(), getY());
	}

}