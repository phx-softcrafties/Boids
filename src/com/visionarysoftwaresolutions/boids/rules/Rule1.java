package com.visionarysoftwaresolutions.boids.rules;

import java.util.ArrayList;
import java.util.List;

import com.visionarysoftwaresolutions.boids.Boid;
import com.visionarysoftwaresolutions.boids.Flock;
import com.visionarysoftwaresolutions.boids.space.Point;

public class Rule1 implements Rule {
	private int scaleFactor = 1;
	
	public Rule1() {}
	public Rule1(int factor){
		scaleFactor = factor;
	}
	
	@Override
	public Point apply(Boid boid, Flock boids) {
		List<Point> others = extractOthers(boid, boids);
		Point perceivedCenter = boid.getPosition().centroid(others);
		return perceivedCenter.subtract(boid.getPosition()).scale(scaleFactor);
	}
	
	private List<Point> extractOthers(Boid boid, Flock boids){
		List<Point> others = new ArrayList<Point>();
		for(Boid aBoid : boids){
			if(!aBoid.equals(boid)){
				others.add(aBoid.getPosition());
			}
		}
		return others;
	}

}
