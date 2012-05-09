package com.visionarysoftwaresolutions.boids;

import java.util.Collection;

import com.visionarysoftwaresolutions.boids.space.Point2D;

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
			aBoid.move(new Point2D(1,1));
		}
	}
}
