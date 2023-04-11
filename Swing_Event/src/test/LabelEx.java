package test;

import java.awt.*;

import javax.swing.*;

public class LabelEx extends JFrame{
	LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("라벨테스트");
		
		ImageIcon img = new ImageIcon("images/gosling.gif");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("스윙 라벨 테스트 중입니다", icon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
	
		
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();

	}

}
