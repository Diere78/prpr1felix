package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * A text based fighting game.
 * 
 * @author felix.ortlund
 *
 */

public class JGame extends JFrame {
	/*
	 * Creates global variables that are used in multiple functions.
	 */
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
	private int rakis = 50;
	private int hp = 50;
	private static JLabel showHP;
	private static JLabel showRakis;
	private Font times = new Font("Times New Roman", Font.PLAIN, 40);
	private JLabel win;
	private JLabel loss;
	private JLabel draw;
	private JButton start = new JButton(
			"<html> <style> p { font-size: 60;}</style> <body> <p>Start</p></body></html>");;
	private JButton restart = new JButton(
			"<html> <style> p { font-size: 60;}</style> <body> <p>Restart</p></body></html>");

	/**
	 * A function for the main frame that is used in the game.
	 */

	public JGame() {
		/*
		 * Turns off the program when you close the application.
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		/*
		 * Creates the structure of the frame, for example, how wide it should
		 * be or how it is decorated.
		 */
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		this.setUndecorated(true);
		this.setVisible(true);
		/*
		 * Customizes the frame.
		 */
		game = this.getContentPane();
		game.setLayout(null);
		game.setBackground(black);

		/*
		 * Connects the "action" function to the game panel (the frame).
		 */
		actions(game);

		/*
		 * Creates the text label that comes up when you lose (when the HP
		 * variable is 0).
		 */
		loss = new JLabel(
				"<html> <style> p { font-size: 50;}</style> <body> <p>You've been defeated by rakis, disgraceful.</p></body></html>");
		loss.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height - 1000, 500, 500);
		loss.setForeground(white);

		/*
		 * Creates the text label that comes up when you win (when the rakis
		 * variable is 0).
		 */
		win = new JLabel(
				"<html> <style> p { font-size: 50;}</style> <body> <p>You've defeated Rakis! Great jobb!</p></body></html>");
		win.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height - 1000, 500, 500);
		win.setForeground(white);

		/*
		 * Creates the text label that comes up when you draw (When both
		 * variables are 0).
		 */
		draw = new JLabel(
				"<html> <style> p { font-size: 50;}</style> <body> <p>You sacrificed your life to deafeat Rakis, A noble death.</p></body></html>");
		draw.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height - 1000, 500, 500);
		draw.setForeground(white);

		/*
		 * Creates the text label for all the dialogue that describes what
		 * happens.
		 */
		text = new JLabel(
				"<html> <style> p { font-size: 20;}</style> <body> <p>You've encoutered Rakis</p></body></html>");
		text.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height - 1000, 500, 500);
		text.setForeground(white);
		game.repaint();

		/*
		 * Displays the HP variable for the user.
		 */
		showHP = new JLabel();
		showHP.setFont(times);
		showHP.setForeground(white);
		showHP.setText("HP " + hp);
		showHP.setBounds(50, 50, showHP.getPreferredSize().width, showHP.getPreferredSize().height);
		game.repaint();

		/*
		 * Shows the rakisHP variable.
		 */
		showRakis = new JLabel();
		showRakis.setFont(times);
		showRakis.setForeground(white);
		showRakis.setText("Rakis HP " + rakis);
		showRakis.setBounds(1500, 50, showRakis.getPreferredSize().width, showRakis.getPreferredSize().height);
		game.repaint();

	}

	/**
	 * A function for game actions to be created example buttons.
	 * 
	 * @param game
	 */
	public void actions(Container game) {

		/*
		 * Creates a button for closing the application without any outside
		 * methods.
		 */
		JButton closeButton = new JButton("<html> <style> p { font-size: 20;}</style> <body> <p>X</p></body></html>");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(Color.RED);
		closeButton.setForeground(white);
		closeButton.addActionListener(event -> closeButtonPressed());
		game.add(closeButton);
		game.repaint();

		/*
		 * Creates the structure for the button labeled "run".
		 */
		run.setBounds(500, 750, run.getPreferredSize().width, run.getPreferredSize().height);
		run.setBackground(red);
		run.setForeground(white);
		run.addActionListener(event -> runButton());
		game.repaint();

		/*
		 * Creates the structure for the button labeled "fight".
		 */
		fight.setBounds(1000, 750, fight.getPreferredSize().width, fight.getPreferredSize().height);
		fight.setBackground(red);
		fight.setForeground(white);
		fight.addActionListener(event -> fightButton());
		game.repaint();

		/*
		 * Creates the structure for the button labeled "punch".
		 */
		punch.setBounds(500, 750, punch.getPreferredSize().width, punch.getPreferredSize().height);
		punch.setBackground(red);
		punch.setForeground(white);
		punch.addActionListener(event -> punchAction());

		/*
		 * Creates the structure for the button labeled "kick".
		 */
		kick.setBounds(1000, 750, kick.getPreferredSize().width, kick.getPreferredSize().height);
		kick.setBackground(red);
		kick.setForeground(white);
		kick.addActionListener(event -> kickAction());

		/*
		 * Creates the structure for the button labeled "start".
		 */
		start.setBounds((toolkit.getScreenSize().width / 2) - 250, toolkit.getScreenSize().height / 2 - 250, 500, 500);
		start.setBackground(red);
		start.setForeground(white);
		game.add(start);
		start.addActionListener(event -> set());

		/*
		 * Creates the structure for the button labeled "restart".
		 */
		restart.setBounds(750, 750, restart.getPreferredSize().width, restart.getPreferredSize().height);
		restart.setBackground(red);
		restart.setForeground(white);
		restart.addActionListener(event -> set());

	}

	/**
	 * Creates the function connected to the closeButton. The function turns the
	 * program off and closes the application.
	 */
	public void closeButtonPressed() {
		System.exit(0);
	}

	/**
	 * Function connected to the run button. The button creates text and ends
	 * the game (you can still restart as the program doesn't end).
	 */
	public void runButton() {
		text.setText(
				"<html> <style> p { font-size: 20;}</style> <body> <p>You ran from Rakis, not unlike his friends.</p></body></html>");
		game.remove(run);
		game.remove(fight);
		game.add(restart);
		game.repaint();
	}

	/**
	 * Function for the fightbutton. It adds different actions, adds changes the
	 * text and starts the "battling".
	 */
	public void fightButton() {
		text.setText(
				"<html> <style> p { font-size: 20;}</style> <body> <p>Rakis raises his guard as you approach him</p></body></html>");
		game.remove(run);
		game.remove(fight);
		game.add(punch);
		game.add(kick);
		game.repaint();
	}

	/**
	 * Creates the action for the punch button that counts as a kind of turn,
	 * and lowers both HP variables.
	 */
	public void punchAction() {
		/*
		 * Different outcomes depending on the RakisHP variable.
		 */
		if (rakis > 20) {
			rakis -= 2;
			hp -= 5;
			text.setText(
					"<html> <style> p { font-size: 20;}</style> <body> <p>You punch rakis through his guard. He retaliates with a strong punch</p></body></html>");
		}
		if (rakis > 0 && rakis <= 20) {
			rakis -= 6;
			text.setText(
					"<html> <style> p { font-size: 20;}</style> <body> <p>Rakis stance has been weakened, he loses much of his thurst.</p></body></html>");
			hp = hp - 2;
		}
		if (hp <= 0 && rakis <= 0) {
			showDraw();
		} else if (rakis <= 0) {
			showWin();
		} else if (hp <= 0) {
			showLoss();
		}
		/*
		 * Refreshes the user interface.
		 */
		showRakis.setText("Rakis HP " + rakis);
		showHP.setText("HP " + hp);
		game.repaint();
	}

	/**
	 * Creates the action for the kick button that counts as a kind of turn, and
	 * lowers both HP variables.
	 */
	public void kickAction() {
		/*
		 * Different outcomes depending on the RakisHP variable.
		 */
		if (rakis > 20) {
			text.setText(
					"<html> <style> p { font-size: 20;}</style> <body> <p>You kick Rakis, he gets enraged and kicks back.</p></body></html>");
			hp -= 6;
			rakis -= 5;
		} else if (rakis <= 20) {
			text.setText(
					"<html> <style> p { font-size: 20;}</style> <body> <p>Due to repeated damege Rakis stance weakened. </p></body></html>");
			hp -= 6;
			rakis -= 6;
		}
		if (hp <= 0 && rakis <= 0) {
			showDraw();
		} else if (rakis <= 0) {
			showWin();
		} else if (hp <= 0) {
			showLoss();
		}
		/*
		 * Refreshes the user interface
		 */
		showRakis.setText("Rakis HP " + rakis);
		showHP.setText("HP " + hp);
		game.repaint();
	}

	/**
	 * Function that activates on a "loss", ending the game but allowing a
	 * restart.
	 */
	public void showLoss() {
		game.add(loss);
		game.remove(text);
		game.remove(punch);
		game.remove(kick);
		game.add(restart);
		game.repaint();

	}

	/**
	 * Function that activates on a "win", ending the game but allowing a
	 * restart.
	 */
	public void showWin() {
		game.add(win);
		game.remove(text);
		game.remove(punch);
		game.remove(kick);
		game.add(restart);
		game.repaint();

	}

	/**
	 * Function that activates on a "draw", ending the game but allowing a
	 * restart.
	 */
	public void showDraw() {
		game.add(draw);
		game.remove(text);
		game.remove(punch);
		game.remove(kick);
		game.add(restart);
		game.repaint();
	}

	/**
	 * Function used for starting the "game" and resetting the game when it has
	 * ended, recreating the original UI that comes up when pressing start. Also
	 * the same function used as the action listener for the "start" button.
	 */
	public void set() {
		game.remove(loss);
		game.remove(win);
		game.remove(draw);
		game.remove(restart);

		text.setText("<html> <style> p { font-size: 20;}</style> <body> <p>You've encoutered Rakis</p></body></html>");
		game.add(text);
		game.add(run);
		game.remove(start);
		hp = 50;
		rakis = 50;
		game.add(showRakis);
		game.add(showHP);
		showRakis.setText("Rakis HP " + rakis);
		showHP.setText("HP " + hp);
		game.add(run);
		game.add(fight);
		game.repaint();

	}

	/**
	 * The main function that activates the game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * creates an object of this class that activates on startup.
		 */
		new JGame();

	}

}
