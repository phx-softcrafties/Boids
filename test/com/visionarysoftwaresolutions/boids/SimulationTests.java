package com.visionarysoftwaresolutions.boids;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Position;

public class SimulationTests {

	  @Test
	    public void testSimulationCanHaveMultipleFlocks(){
	        Boid toy = new Boid(new Position(0,0));
	        Boid toy2 = new Boid(new Position(0,0));
	        List<Boid> boids = new ArrayList<Boid>();
	        boids.add(toy);
	        boids.add(toy2);
	        Simulation sim = new Simulation(boids);
	        int numBoids = sim.getBoidCount();
	        assertEquals(2, numBoids);
	    }
	    
	    @Test
	    public void testSimulationCanBeUpdated(){
	    	Position original = new Position(0,0);
	    	Boid toy = new Boid(original);
	        Boid toy2 = new Boid(original);
	        List<Boid> boids = new ArrayList<Boid>();
	        boids.add(toy);
	        boids.add(toy2);
	        Simulation sim = new Simulation(boids);
	        sim.update();
	        assertFalse(toy.getPosition() == original);
	        assertFalse(toy2.getPosition() == original);
	    }

}
