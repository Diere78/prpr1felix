package Swing;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
public class Main extends JFrame implements KeyListener {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Color bg = new Color(200, 10, 10);
	private JButton changeColorButton;
	private Container contentPane;

	public Main() {
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

	/**
	 * Should create an action that changes the color bg
	 */

	public void blinkB() {
		bg = new Color(10, 10, 200);
		contentPane.setBackground(bg);
		contentPane.repaint();

	}

	public void blinkR() {
		bg = new Color(200, 10, 10);
		contentPane.setBackground(bg);
		contentPane.repaint();

	}

	public void blinkT() {
		bg = new Color(10, 200, 10);
		contentPane.setBackground(bg);
		contentPane.repaint();

	}

	public static void main(String[] args) {
		Main frame = new Main();

	}

	/**
	 * Should change the background color when pressing the enter key
	 */

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_E) {
			blinkB();
		}
	}


	public void keyReleased(KeyEvent r) {
		if (r.getKeyCode() == KeyEvent.VK_R) {
			blinkR();
		}

	}

	public void keyTyped(KeyEvent t) {
		if (t.getKeyCode() == KeyEvent.VK_T) {
			blinkT();
		}

	}

}
