package com.gokhantamkoc.ilkspringbootuygulamamodevi.dto;

public class ShapeDto {
	 
	 private float x;
	 private float y;
	 private int id;
	 
	 public ShapeDto() {
		 
	 }
	 
	 
	public ShapeDto(float x, float y, int id) {
	
		this.x = x;
		this.y = y;
		this.id = id;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	 
	

}
