package com.visionarysoftwaresolutions.boids.space;

public interface PointIn2D {
	public abstract int getX();
	public abstract int getY();
	public abstract PointIn2D add(PointIn2D toAdd);
}
