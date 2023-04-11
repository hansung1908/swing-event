package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyTest extends JFrame{
	
	public MyTest() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton btn1 = new JButton();
		btn1.setText("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
			}
		});
		add(btn1);
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyTest();

	}

}
