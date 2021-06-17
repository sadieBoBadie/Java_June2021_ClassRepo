package com.java.projects.controllers;

public interface Sprite {
    
	String spriteName = "Anon";
    
    abstract void move();
    abstract void speak();
    abstract boolean incrementHealth();

}
