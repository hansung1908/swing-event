package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonEventTest extends JFrame{
	
	Container c;
	
	JButton jb1;
	JButton jb2;
	JButton jb3;
	
	public ButtonEventTest() {
		setTitle("버튼 이벤트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 100));
		
		jb1 = new JButton("red");
		jb2 = new JButton("blue");
		jb3 = new JButton("green");
		
		jb1.addActionListener(new MyActionListener());
		jb2.addActionListener(new MyActionListener());
		jb3.addActionListener(new MyActionListener());
		
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		
		setSize(500,300);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton jb = (JButton)e.getSource();
			
			if(jb.equals(jb1)) { 
				c.setBackground(Color.RED);
			} else if(jb.equals(jb2)) {
				c.setBackground(Color.BLUE);
			} else if(jb.equals(jb3)) {
				c.setBackground(Color.GREEN);
			} else {
				c.setBackground(Color.WHITE);
			}
		}
	}

	public static void main(String[] args) {
		new ButtonEventTest();
	}

}
