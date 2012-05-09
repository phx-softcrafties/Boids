package com.visionarysoftwaresolutions.boids;

import com.visionarysoftwaresolutions.boids.space.Point;
import com.visionarysoftwaresolutions.boids.space.Point2D;

class Boid {
    Point position;
    Point velocity;
    
    public Boid(Point myPosition) {
        velocity = new Point2D(0,0);
    	place(myPosition);
    }

    void place(Point myPosition) {
        position = myPosition;
    }
    
    public Point getPosition(){
        return position;
    }
    
    public Point getVelocity(){
        return velocity;
    }

    public void move(Point vel) {
        velocity = velocity.add(vel);
        Point newPos = position.add(velocity);
        place((Point) newPos);
    }
}
