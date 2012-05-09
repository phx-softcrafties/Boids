package com.visionarysoftwaresolutions.boids;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Point2D;

public class FlockTests {

	@Test
	public void testCreateFlockFromCollection() {
		Boid toy = new Boid(new Point2D(0,0));
        Boid toy2 = new Boid(new Point2D(0,0));
        List<Boid> birds = new ArrayList<Boid>();
        birds.add(toy);
        birds.add(toy2);
        Flock boids = new Flock(birds);
        int numBoids = boids.size();
        assertEquals(2, numBoids);
	}
	
	@Test
	public void testAddBoidToFlock() {
		Boid toy = new Boid(new Point2D(0,0));
        Flock boids = new Flock();
        boids.addBoid(toy);
        int numBoids = boids.size();
        assertEquals(1, numBoids);
	}
	
	@Test
	public void testFlockSize(){
		Flock boids = new Flock();
		assertEquals(0, boids.size());
		boids.addBoid(new Boid(new Point2D(0,0)));
		assertEquals(1, boids.size());
	}

}
