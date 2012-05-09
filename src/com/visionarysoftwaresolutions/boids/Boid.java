package com.visionarysoftwaresolutions.boids;

import com.visionarysoftwaresolutions.boids.space.Position;
import com.visionarysoftwaresolutions.boids.space.Velocity;

class Boid {
    Position position;
    Velocity velocity = new Velocity();
    
    public Boid(Position myPosition) {
        place(myPosition);
    }

    void place(Position myPosition) {
        position = myPosition;
    }
    
    public Position getPosition(){
        return position;
    }
    
    public Velocity getVelocity(){
        return velocity;
    }

    public void move(Velocity vel) {
        velocity = (Velocity) velocity.add(vel);
        Position newPos = (Position) position.add(velocity);
        place(newPos);
    }
}
