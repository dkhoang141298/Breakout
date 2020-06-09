package brickBracker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame("Game Phá Gạch (Breakout Ball)");//Tiêu đề
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 710, 600);//size GUI	
		obj.setResizable(false);
		obj.setLocationRelativeTo(null);// hiển thị chính giữa màn hình
		obj.setVisible(true); // hiển thị GUI
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Tắt chương trình
		obj.add(gamePlay);
	}

}
