package com.visionarysoftwaresolutions.boids;

import org.junit.*;

import com.visionarysoftwaresolutions.boids.space.Position;
import com.visionarysoftwaresolutions.boids.space.Velocity;

import static org.junit.Assert.*;

public class BoidTests {
    @Test
    public void testBoidHasAPosition() {
        int x =50;
        int y = 50;
        Position myPosition = new Position(x, y);
        Boid myBoid = new Boid(myPosition);
        myBoid.place(myPosition);
        Position expectedResult = new Position(50,50);
        assertEquals(expectedResult, myBoid.getPosition());
    }
    
    @Test
    public void testBoidHasAVelocity(){
        int x =50;
        int y = 50;
        Velocity vel = new Velocity(x, y);
        Boid myBoid = new Boid(new Position(x,y));
        myBoid.move(vel);
        Velocity expectedResult = new Velocity(50,50);
        assertEquals(expectedResult, myBoid.getVelocity());
    }
}
