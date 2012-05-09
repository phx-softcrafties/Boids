package com.visionarysoftwaresolutions.boids.rules;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.visionarysoftwaresolutions.boids.Boid;
import com.visionarysoftwaresolutions.boids.Flock;
import com.visionarysoftwaresolutions.boids.space.Point;
import com.visionarysoftwaresolutions.boids.space.Point2D;

public class Rule1Tests {
	Rule1 toTest = new Rule1();
	Boid one = new Boid(new Point2D(1,1));
	Boid two = new Boid(new Point2D(3,3));
	Flock flock = new Flock();
	
	@Before
	public void setup(){
		flock.addBoid(one);
		flock.addBoid(two);
	}
	
	@Test
	public void testRule1() {
		Point result = toTest.apply(one, flock);
		assertEquals(new Point2D(2,2), result);
	}
	
	@Test
	public void testRule1ForBigger() {
		one = new Boid(new Point2D(50,50));
		two = new Boid(new Point2D(133,75));
		flock = new Flock();
		flock.addBoid(one);
		flock.addBoid(two);
		Point result = toTest.apply(one, flock);
		System.out.println(result);
		assertEquals(new Point2D(91,62), result);
	}

}
