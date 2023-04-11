package test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class FlyingTextEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel lb = new JLabel("hello");
	
	public FlyingTextEx() {
		super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		
		lb.setLocation(100,20);
		lb.setSize(50,50);
		contentPane.add(lb);
		
		setSize(200, 200);
		setVisible(true);
		
		contentPane.requestFocus();
	}

	public static void main(String[] args) {
		new FlyingTextEx();

	}
	
	class MyKeyListener extends KeyAdapter {
		
		
		public void keyPressed(KeyEvent e) {
			
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP : lb.setLocation(lb.getX(), lb.getY() - 10); break;
			case KeyEvent.VK_DOWN : lb.setLocation(lb.getX(), lb.getY() + 10); break;
			case KeyEvent.VK_LEFT : lb.setLocation(lb.getX() - 10, lb.getY()); break;
			case KeyEvent.VK_RIGHT : lb.setLocation(lb.getX() + 10, lb.getY()); break;
			}
		}
	}

}
