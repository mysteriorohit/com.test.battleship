package com.test.battleship;
public class HumanLocation implements Location {

	private int x;
	private int y;
	private boolean horizontal;
	private int shipSize;

	public HumanLocation(int x, int y, boolean horizontal, int shipSize) {
		this.x = x;
		this.y = y;
		this.horizontal = horizontal;
		this.shipSize = shipSize;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isShipHorizontal() {
		return horizontal;
	}

	public int getShipSize() {
		return shipSize;
	}

}