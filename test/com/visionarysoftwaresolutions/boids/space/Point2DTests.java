package com.visionarysoftwaresolutions.boids.space;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testSubtractPoint2Ds() {
		Point vel = new Point2D(55,50);
		Point pos = new Point2D(50,50);
		Point result = (Point) vel.subtract(pos);
		assertEquals(result, new Point2D(5,0));
	}
	
	@Test
	public void testScalePoint2Ds() {
		int ten = 10;
		Point vel = new Point2D(100,100);
		Point result = (Point) vel.scale(ten);
		assertEquals(result, new Point2D(ten,ten));
	}
	
	@Test
	public void testScaleSmallPoint2DsRoundDown() {
		int two = 2;
		Point vel = new Point2D(5,5);
		Point result = (Point) vel.scale(two);
		assertEquals(result, new Point2D(two,two));
	}
	
	@Test
	public void testPointCentroids(){
		Point seed = new Point2D(3,4);
		List<Point> points = new ArrayList<Point>();
		points.add(seed);
		points.add(new Point2D(12,12));
		points.add(new Point2D(31,56));
		Point result = seed.centroid(points);
		Point expected = new Point2D(15,24);
		assertEquals(expected,result);
	}
}
