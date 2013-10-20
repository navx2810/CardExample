package net.matt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester extends JFrame {
	public Tester() {
		add(new NewPanel());
	}
	
	public static void main(String[] args) {
		Tester frame = new Tester();
		frame.setTitle("Test");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

class NewPanel extends JPanel {
	
	float playerHealth = .8f;
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.pink);
		g.fillRect(10, 10, 60, 10);
		g.setColor(Color.red);
		g.fillRect(10, 10, (int)(60*playerHealth), 10);
		g.drawString("Health", 15, 32);
	}
}
