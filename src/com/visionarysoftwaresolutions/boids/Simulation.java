package com.visionarysoftwaresolutions.boids;

import java.util.Collection;

import com.visionarysoftwaresolutions.boids.rules.Rule1;
import com.visionarysoftwaresolutions.boids.rules.RulesEngine;
import com.visionarysoftwaresolutions.boids.space.Point;

public class Simulation {
    private Flock boids;
    
    public Simulation(Collection<Boid> birds){
        boids = new Flock(birds);
    }

	public int getBoidCount() {
		return boids.size();
	}
	
	public Flock getFlock(){
		return boids;
	}

	public void update() {
		for(Boid aBoid : boids){
			Point first = RulesEngine.rule1(aBoid, boids);
			aBoid.move(first);
		}
	}
}
