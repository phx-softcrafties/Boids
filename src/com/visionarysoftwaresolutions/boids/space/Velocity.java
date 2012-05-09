package com.visionarysoftwaresolutions.boids.space;

public class Velocity implements PointIn2D {
    private int x;
    private int y;
    
    public Velocity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Velocity() {
        this.x = 0;
        this.y = 0;
    }

    Velocity add(Velocity vel) {
        return new Velocity(x + vel.x, y + vel.y);
    }
    
    @Override
    public boolean equals(Object another){
        return another instanceof Velocity &&
               ( ((Velocity) another).x == this.x &&
                 ((Velocity) another).y == this.y
               );
    }
    
    @Override
    public int hashCode(){
        return 0;
    }

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public PointIn2D add(PointIn2D toAdd) {
		return new Velocity(x+toAdd.getX(), y+toAdd.getY());
	}
}
