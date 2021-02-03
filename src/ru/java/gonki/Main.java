package ru.java.gonki;

import javax.swing.*;

/**
 * @author User
 *
 */
public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("Java F1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 850);
		f.add(new Road());
		
		f.setVisible(true);

	}

}
