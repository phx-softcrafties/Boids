package com.visionarysoftwaresolutions.boids.space;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Velocity;

public class VelocityTests {

	@Test
	public void testVelocityEqualityWhenEqualVelocities() {
		Velocity vel = new Velocity(50,50);
		Velocity vel2 = new Velocity(50,50);
		assertEquals(vel, vel2);
	}
	
	@Test
	public void testVelocityEqualityWhenNotEqualVelocities() {
		Velocity vel = new Velocity(55,50);
		Velocity vel2 = new Velocity(50,50);
		assertFalse(vel == vel2);
	}
	
	@Test
	public void testAddVelocities() {
		Velocity vel = new Velocity(55,50);
		Velocity vel2 = new Velocity(50,50);
		Velocity result = (Velocity) vel.add(vel2);
		assertEquals(result, new Velocity(105,100));
	}

}
