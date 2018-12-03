package Swing;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

/**
 * Shows a Swing works
 * 
 * @author felix.ortlund
 *
 */
public class AverageAmongInput extends JFrame implements KeyListener {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Color bg = new Color(200, 10, 10);
	private JButton changeColorButton;
	private Container contentPane;

	public AverageAmongInput() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		this.setUndecorated(true);
		this.setVisible(true);
		this.addKeyListener(this);
		contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(bg);
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		JButton closeButton = new JButton("BEGONE");

		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(Color.BLACK);
		closeButton.setForeground(Color.WHITE);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("HEYAA!");
		text.setBounds(50, 100, 100, 50);
		text.setForeground(Color.BLACK);
		contentPane.add(text);

		JButton changeTextButton = new JButton("Change label");
		changeTextButton.setBounds(300, 50, 200, 50);
		changeTextButton.setBackground(bg);
		changeTextButton.setForeground(Color.WHITE);
		changeTextButton.addActionListener(event -> changeTxtButtonPressed());
		contentPane.add(changeTextButton);

	}

	public void changeTxtButtonPressed() {
		// String currentText = text.getText();
		if (text.getText().equals("HEYAA!"))
			text.setText("Goodbaye");
		else
			text.setText("HEYAA!");
		this.requestFocus();
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {
		AverageAmongInput frame = new AverageAmongInput();
		averageAmongDecided(input());

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * Function for deciding the different values.
	 * 
	 * @return
	 */
	public static double[] input() {
		Scanner scanner = new Scanner(System.in);
		int o = 0;
		/*
		 * Decides how many steps of the array you are going to use when
		 * counting the average.
		 */
		System.out.println("Number of Steps in the Array: ");
		o = scanner.nextInt();
		double[] inputs = new double[o];
		/*
		 * Here is where you enter the different values that goes in to
		 * different positions in the array.
		 */
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Enter double for " + i + ": ");
			inputs[i] = scanner.nextDouble();
		}

		return inputs;
	}
	/**
	 * Sums up the values that you previously entered into the array. i
	 * represents the steps in the array.
	 */
	public static void averageAmongDecided(double[] inputs) {
		double sum = 0;
		/*
		 * Ads up the different array steps into a sum that can be divided.
		 */
		for (int i = 0; i < inputs.length; i++) {
			sum += inputs[i];
		}
		/*
		 * Divides the sum by the length of the array and printing the
		 * average.
		 */
		System.out
				.println("Average is: " + sum + " / " + inputs.length + " = " + (double) sum / (double) inputs.length);
		/*
		 * restarts the program.
		 */
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}