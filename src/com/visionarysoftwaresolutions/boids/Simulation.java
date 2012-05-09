package com.visionarysoftwaresolutions.boids;

import java.util.Collection;

import com.visionarysoftwaresolutions.boids.space.Velocity;

public class Simulation {
    private Flock boids;
    
    public Simulation(Collection<Boid> birds){
        boids = new Flock(birds);
    }

	public int getBoidCount() {
		return boids.size();
	}

	public void update() {
		for(Boid aBoid : boids){
			aBoid.move(new Velocity(1,1));
		}
	}
}
