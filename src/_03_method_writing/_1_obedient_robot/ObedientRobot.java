package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("Choose between red and blue.");
		String chose = JOptionPane.showInputDialog("Choose between square, triangle and circle.");

		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		} else {
			JOptionPane.showMessageDialog(null, "Color unavaliable.");
		}
		
		if (chose.equals("square")) {
			drawSquare();
		} else if (chose.equals("triangle")) {
			drawTriangle();
		} else if (chose.equals("circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "Shape unavaliable.");
		}

	}

	static void drawSquare() {
		rob.penDown();
		rob.setSpeed(500);
		for (int i = 0; i < 4; i++) {
			rob.turn(90);
			rob.move(100);
		}
		rob.hide();
	}

	static void drawTriangle() {
		rob.penDown();
		rob.setSpeed(500);
		for (int i = 0; i < 3; i++) {
			rob.turn(120);
			rob.move(100);
		}
		rob.hide();
	}

	static void drawCircle() {
		rob.penDown();
		rob.setSpeed(500);
		for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
		rob.hide();
	}
}
