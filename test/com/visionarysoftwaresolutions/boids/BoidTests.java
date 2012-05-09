package com.visionarysoftwaresolutions.boids;

import org.junit.*;

import com.visionarysoftwaresolutions.boids.space.Point;
import com.visionarysoftwaresolutions.boids.space.Point2D;

import static org.junit.Assert.*;

public class BoidTests {
    @Test
    public void testBoidHasAPosition() {
        int x =50;
        int y = 50;
        Point myPosition = new Point2D(x, y);
        Boid myBoid = new Boid(myPosition);
        myBoid.place(myPosition);
        Point expectedResult = new Point2D(50,50);
        assertEquals(expectedResult, myBoid.getPosition());
    }
    
    @Test
    public void testBoidHasAVelocity(){
        int x =50;
        int y = 50;
        Point vel = new Point2D(x, y);
        Boid myBoid = new Boid(new Point2D(x,y));
        myBoid.move(vel);
        Point expectedResult = new Point2D(50,50);
        assertEquals(expectedResult, myBoid.getVelocity());
    }
}
