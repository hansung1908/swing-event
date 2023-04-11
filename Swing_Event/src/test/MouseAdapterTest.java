package test;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseAdapterTest extends JFrame{
	
	JLabel lb = new JLabel("Hello");
	
	public MouseAdapterTest() {
		setTitle("MouseAdapterTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		lb.setSize(50, 20);
		lb.setLocation(30, 30);
		c.add(lb);
		
		setSize(500, 300);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			lb.setLocation(x, y);
		}
		
		
	}

	public static void main(String[] args) {
		new MouseAdapterTest();
	}

}
