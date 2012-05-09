package com.visionarysoftwaresolutions.boids.space;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visionarysoftwaresolutions.boids.space.Point2D;

public class Point2DTests {

	@Test
	public void testPoint2DEqualityWhenEqual() {
		Point pos = new Point2D(50,50);
		Point pos2 = new Point2D(50,50);
		assertEquals(pos, pos2);
	}
	
	@Test
	public void testPoint2DEqualityWhenNotEqual() {
		Point pos = new Point2D(55,50);
		Point pos2 = new Point2D(50,50);
		assertFalse(pos == pos2);
	}
	
	@Test
	public void testAddPoint2Ds() {
		Point vel = new Point2D(55,50);
		Point pos = new Point2D(50,50);
		Point result = (Point) pos.add(vel);
		assertEquals(result, new Point2D(105,100));
	}
}
