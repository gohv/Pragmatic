package Pragmatic.UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SumatorFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JTextField firstField;
	private JTextField secondField;
	private JLabel result;

	public SumatorFrame() {
		createUI();
	}

	private void createUI() {
		setTitle("Sumator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout(null);
		// first field
		firstField = new JTextField();
		firstField.setBounds(10, 10, 50, 50);
		add(firstField);
		// second field
		secondField = new JTextField();
		secondField.setBounds(60, 10, 50, 50);
		add(secondField);
		// Button
		JButton button = new JButton("Calculate");
		button.setBounds(120, 10, 60, 30);
		button.addActionListener(this);
		add(button);
		// JLabel
		JLabel label = new JLabel("Result: ");
		label.setBounds(10, 80, 100, 30);
		add(label);
		result = new JLabel();
		result.setBounds(10, 120, 100, 30);
		add(result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calcSum();
	}

	private void calcSum() {
		String firstText = firstField.getText();
		String secondText = secondField.getText();

		try {

			int a = Integer.parseInt(firstText);
			int b = Integer.parseInt(secondText);
			int sum = a + b;

			result.setText(firstText + secondText + " = " + sum);

		} catch (NumberFormatException e) {
			System.err.println("not a number");
			
		}
	}
}
