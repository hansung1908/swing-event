package test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyCharTest extends JFrame{
	JLabel lb = new JLabel("<Enter> 키로 배경색이 바뀝니다.");
	
	public KeyCharTest() {
		setTitle("KeyCharTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(lb);
		c.addKeyListener(new MyKeyListener());
		
		setSize(500, 300);
		setVisible(true);
		
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			switch(e.getKeyChar()) {
			case '\n':
				lb.setText("r= " + r + "g= " + g + "b= " + b);
				getContentPane().setBackground(new Color(r, g, b));
				break;
				
			case 'q':
				System.exit(0);
			}

		}
	}

	public static void main(String[] args) {
		new KeyCharTest();

	}

}
