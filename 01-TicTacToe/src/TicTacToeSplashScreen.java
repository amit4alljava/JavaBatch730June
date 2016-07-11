import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TicTacToeSplashScreen extends JWindow {
	private JProgressBar progressBar = new JProgressBar();
	private JLabel lblTictactoegame = new JLabel("TicTacToe-Game");
	private JPanel contentPane;
	private boolean isShowOrHide = true;
	Timer timer ;
	int progressCounter = 1;
	private void flashAnimation(){
		ActionListener l = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(progressCounter>=100){
					timer.stop();
					TicTacToeSplashScreen.this.setVisible(false); // Hide
					TicTacToeSplashScreen.this.dispose(); // Memory Kill
					TicTacToe toe = new TicTacToe();
					toe.setVisible(true);
				}
				//if(progressCounter<100){
					progressBar.setValue(progressCounter);
					progressCounter++;
				//}
				
				lblTictactoegame.setVisible(isShowOrHide);
				isShowOrHide = !isShowOrHide;
				
			}
		};
		 timer = new Timer(100,l);
		timer.start();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					TicTacToeSplashScreen frame = new TicTacToeSplashScreen();
					frame.setVisible(true);
					frame.flashAnimation();
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToeSplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 373);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ToolTip.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel imglabel = new JLabel("");
		imglabel.setBounds(38, 25, 362, 248);
		contentPane.add(imglabel);
		Icon icon = new ImageIcon(TicTacToeSplashScreen.class.getResource("main.gif"));
		imglabel.setIcon(icon);
		
		
		lblTictactoegame.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblTictactoegame.setBounds(401, 117, 158, 57);
		contentPane.add(lblTictactoegame);
		
		
		progressBar.setForeground(UIManager.getColor("desktop"));
		progressBar.setBackground(new Color(238, 238, 238));
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		progressBar.setBounds(72, 285, 455, 32);
		contentPane.add(progressBar);
		
	}
}
