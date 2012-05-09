package com.visionarysoftwaresolutions.boids;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Flock implements Iterable<Boid> {
	private Collection<Boid> boids;
	
	public Flock(){
		boids = new ArrayList<Boid>();
	}
	
	public Flock(Collection<Boid> birds){
		boids = birds;
	}
	
	public void addBoid(Boid toAdd){
		boids.add(toAdd);
	}
	
	public int size(){
		return boids.size();
	}
	
	@Override
	public Iterator<Boid> iterator() {
		return boids.iterator();
	}
}
