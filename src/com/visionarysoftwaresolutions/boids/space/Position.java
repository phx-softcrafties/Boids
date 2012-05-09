package com.visionarysoftwaresolutions.boids.space;

public class Position implements PointIn2D {
    private int x;
    private int y;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object another){
        return another instanceof Position &&
               ( ((Position) another).x == this.x &&
                 ((Position) another).y == this.y
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
		return new Position(x+toAdd.getX(), y+toAdd.getY());
	}
}
