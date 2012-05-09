package com.visionarysoftwaresolutions.boids.space;

import java.util.List;

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
	public String toString(){
		return String.format("(%d, %d)", getX(), getY());
	}
	@Override
	public Point add(Point toAdd) {
		Point2D add = (Point2D) toAdd;
		return new Point2D(x+add.getX(), y+add.getY());
	}

	@Override
	public Point subtract(Point toSubtract) {
		Point2D sub = (Point2D) toSubtract;
		return new Point2D(x-sub.getX(), y-sub.getY());
	}

	@Override
	public Point scale(int factor) {
		int x = getX() / factor;
		int y = getY() / factor;
		return new Point2D(x,y);
	}

	@Override
	public Point centroid(List<Point> points) {
		Point result = new Point2D(0,0);
		for(Point aPoint : points){
			result = result.add(aPoint);
		}
		return result.scale(points.size());
	}
}