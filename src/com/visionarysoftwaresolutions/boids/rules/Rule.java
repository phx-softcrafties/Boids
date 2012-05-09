package com.visionarysoftwaresolutions.boids.rules;

import com.visionarysoftwaresolutions.boids.Boid;
import com.visionarysoftwaresolutions.boids.Flock;
import com.visionarysoftwaresolutions.boids.space.Point;

public interface Rule {
	public Point apply(Boid boid, Flock boids);
}
