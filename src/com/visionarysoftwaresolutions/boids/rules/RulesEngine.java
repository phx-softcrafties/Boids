package com.visionarysoftwaresolutions.boids.rules;

import com.visionarysoftwaresolutions.boids.Boid;
import com.visionarysoftwaresolutions.boids.Flock;
import com.visionarysoftwaresolutions.boids.space.Point;

public class RulesEngine {
	public static Point rule1(Boid boid, Flock boids){
		return new Rule1().apply(boid, boids);
	}
	
	public static Point rule2(Boid boid, Flock boids){
		return new Rule1().apply(boid, boids);
	}
	
	public static Point rule3(Boid boid, Flock boids){
		return new Rule1().apply(boid, boids);
	}
}
