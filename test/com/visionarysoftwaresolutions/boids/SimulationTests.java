package com.visionarysoftwaresolutions.boids;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Point;
import com.visionarysoftwaresolutions.boids.space.Point2D;

public class SimulationTests {
	Simulation sim;
	Point original = new Point2D(0, 0);
	List<Boid> boids;
	Boid toy, toy2;

	@Before
	public void setup() {
		toy = new Boid(original);
		toy2 = new Boid(original);
		boids = new ArrayList<Boid>();
		boids.add(toy);
		boids.add(toy2);
	}

	@Test
	public void testSimulationCanHaveMultipleBoids() {
		sim = new Simulation(boids);
		int numBoids = sim.getBoidCount();
		assertEquals(2, numBoids);
	}

	@Test
	public void testSimulationCanBeUpdated() {
		sim = new Simulation(boids);
		sim.update();
		assertFalse(toy.getPosition() == original);
		assertFalse(toy2.getPosition() == original);
	}

	@Test
	public void testSimulationAppliesRule1() {
		boids.get(1).place(new Point2D(2,2));
		sim = new Simulation(boids);
		sim.update();
		Point expected = new Point2D(1,1);
		for(Boid boid : sim.getFlock()){
			assertEquals(expected, boid.getPosition());
		}
	}
}
