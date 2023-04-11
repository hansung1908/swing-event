package test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class ButtonImageEx extends JFrame{
	
	ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalicon = new ImageIcon("images/normalicon.gif");
		ImageIcon rollovericon = new ImageIcon("images/rollovericon.gif");
		ImageIcon pressdicon = new ImageIcon("images/pressdicon.gif");
		
		JButton btn = new JButton("call~~", normalicon);
		btn.setPressedIcon(pressdicon);
		btn.setRolloverIcon(rollovericon);
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();

	}

}
