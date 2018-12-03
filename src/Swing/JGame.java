package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JGame extends JFrame implements KeyListener {
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Container game;
	private Color black = new Color(0, 0, 0);
	private Color white = new Color(244, 244, 244);
	private Color red = new Color(200, 0, 0);
	private JLabel text;
	private JButton run = new JButton("<html> <style> p { font-size: 60;}</style> <body> <p>Run</p></body></html>");
	private JButton fight = new JButton("<html> <style> p { font-size: 60;}</style> <body> <p>Fight</p></body></html>");
	private JButton kick = new JButton("<html> <style> p { font-size: 60;}</style> <body> <p>Kick</p></body></html>");
	private JButton punch = new JButton("<html> <style> p { font-size: 60;}</style> <body> <p>Punch</p></body></html>");

	public JGame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		this.setUndecorated(true);
		this.setVisible(true);
		game = this.getContentPane();
		game.setLayout(null);
		game.setBackground(black);
		actions(game);

		text = new JLabel(
				"<html> <style> p { font-size: 20;}</style> <body> <p>You've encoutered Rakis</p></body></html>");
		System.out.println(text.getPreferredSize());
		text.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height - 1000, 500, 500);
		text.setForeground(white);
		game.add(text);
		game.repaint();

	}

	public void actions(Container game) {
		JButton closeButton = new JButton("<html> <style> p { font-size: 20;}</style> <body> <p>X</p></body></html>");

		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(Color.RED);
		closeButton.setForeground(white);
		closeButton.addActionListener(event -> closeButtonPressed());
		game.add(closeButton);

		run.setBounds(500, 750, 200, 100);
		run.setBackground(red);
		run.setForeground(white);
		run.addActionListener(event -> runButton());
		game.add(run);
		game.repaint();

		fight.setBounds(1000, 750, 200, 100);
		fight.setBackground(red);
		fight.setForeground(white);
		fight.addActionListener(event -> fightButton());
		game.add(fight);
		game.repaint();

		
		punch.setBounds(500, 750, punch.getPreferredSize().width, punch.getPreferredSize().height);
		punch.setBackground(red);
		punch.setForeground(white);
		
		kick.setBounds(1000, 750, 200, 100);
		kick.setBackground(red);
		kick.setForeground(white);
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public void runButton() {
		text.setText(
				"<html> <style> p { font-size: 20;}</style> <body> <p>You ran from Rakis, not unlike his friends.</p></body></html>");
		game.remove(run);
		game.remove(fight);
		game.repaint();
	}

	public void fightButton() {
		text.setText(
				"<html> <style> p { font-size: 20;}</style> <body> <p>Rakis raises his guard as you approach him</p></body></html>");
		game.remove(run);
		game.remove(fight);
		game.add(punch);
		game.add(kick);
		game.repaint();
	}

	public static void main(String[] args) {
		JGame frame = new JGame();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
