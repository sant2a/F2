package ru.java.gonki;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {

	int x;
	int y;
	int v;

	Image img = new ImageIcon("C:/Users/User/.eclipse/F1/res/klipartz.com_photo-resizer.ru.png").getImage();

	
	Road road;
	
	public Rectangle getRect() {
		
		return new Rectangle(x, y, 200, 30);
		
	}

	public Enemy(int x, int y, int v, Road road) {

		this.x = x;
		this.y = y;
		this.v = v;
		this.road = road;

	}

	public void move() {

		x = x - road.p.v + v;

	}

}
