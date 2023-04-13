package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Bingo extends JFrame{
	
	Container c = getContentPane();
	
	public Bingo() {
		setTitle("빙고");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(null);
		
		int arr[] = new int[25];
		for(int i = 0; i < 25; i++) {
			arr[i] = i+1;
		}
		
		int tmp, index;
		for(int i = 0; i < 25; i++) {
			index = (int)(Math.random()*25);
			 tmp = arr[0];
	         arr[0] = arr[index];
	         arr[index] = tmp;
		}
		
		int j = 1;
		int y = 50;
		
		for(int i = 0; i < 25; i++,j++) {
		
			String text = Integer.toString(arr[i]);
			JButton btn = new JButton(text);
			btn.addActionListener(new MyActionListener());
			btn.setBounds(j*70, y, 50, 50);
			
			if((i+1)%5 == 0) {
				y += 70;
				j = 0;
			}
			
			c.add(btn);
		}
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Bingo();

	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.YELLOW);
		}
	}
}
