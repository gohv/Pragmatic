package Pragmatic.UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo extends JFrame {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello");
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("OK");
		// button.getModel().addActionListener(new ButtonListener()); with a sepparate class
		button.getModel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("test");
			}
		});
		button.setSize(100, 202);
		frame.getContentPane().add(button);

		frame.setVisible(true);
	}
}
