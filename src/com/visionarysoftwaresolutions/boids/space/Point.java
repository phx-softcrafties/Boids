package com.visionarysoftwaresolutions.boids.space;

import java.util.List;

public interface Point {
	public abstract Point add(Point toAdd);
	public abstract Point subtract(Point toSubtract);
	public abstract Point scale(int factor);
	public abstract Point centroid(List<Point> points);
}
