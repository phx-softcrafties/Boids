package com.visionarysoftwaresolutions.boids.space;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Position;
import com.visionarysoftwaresolutions.boids.space.Velocity;

public class PositionTests {

	@Test
	public void testPositionEqualityWhenEqualVelocities() {
		Position pos = new Position(50,50);
		Position pos2 = new Position(50,50);
		assertEquals(pos, pos2);
	}
	
	@Test
	public void testPositionEqualityWhenNotEqualVelocities() {
		Position pos = new Position(55,50);
		Position pos2 = new Position(50,50);
		assertFalse(pos == pos2);
	}
	
	@Test
	public void testAddVelocityToPosition() {
		Velocity vel = new Velocity(55,50);
		Position pos = new Position(50,50);
		Position result = (Position) pos.add(vel);
		assertEquals(result, new Position(105,100));
	}

}
