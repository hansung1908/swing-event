package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyButtonFrame extends JFrame {
	
	public MyButtonFrame() {
		setTitle("action 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton jb = new JButton("action");
		jb.addActionListener(new MyActionListener());
		add(jb);
		
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyButtonFrame();
	}

}

class MyActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb.getText().equals("action")) {
			jb.setText("액션");
		} else {
			jb.setText("action");
		}
	}
}
