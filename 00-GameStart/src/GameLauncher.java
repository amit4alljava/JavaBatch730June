import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

public class GameLauncher extends JWindow {
	final int MAX_PROGRESS = 100;
	final int TIMER_DELAY = 100;
	JProgressBar progressBar = new JProgressBar();
	private boolean isVisible = false;
	private JPanel contentPane;
	JLabel lblGamerZone = new JLabel("Gamer Zone-2016");
	Timer timer ;
	int color = 1;
	int currentProgress = 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameLauncher frame = new GameLauncher();
					frame.setVisible(true);
					frame.animation();
		
	}
	private void animation(){
		// For Delay in Swing 
		// We Need Timer Class
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				progressBar.setValue(currentProgress);
				currentProgress++;
				if(currentProgress>=MAX_PROGRESS){
					timer.stop();
					GameLauncher.this.setVisible(false);
					GameLauncher.this.dispose();
					MainScreen mainScreen = new MainScreen();
					mainScreen.setVisible(true);
					mainScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				}
				 lblGamerZone.setVisible(isVisible); 
				 isVisible = !isVisible;
				 if(isVisible){
					 if(color>5){
						 color=1;
					 }
				 switch (color){
				 case 1 :
					 lblGamerZone.setForeground(Color.RED);
					 break;
				 case 2 :
					 lblGamerZone.setForeground(Color.GREEN);
					 break;
				 case 3 :
					 lblGamerZone.setForeground(Color.BLUE);
					 break;
				 case 4 :
					 lblGamerZone.setForeground(Color.CYAN);
					 break;
				 case 5 :
					 lblGamerZone.setForeground(Color.ORANGE);
					 break;
				default:
					lblGamerZone.setForeground(Color.BLACK);
				 }
				 color++;
				 }
			}
		};
		// Now this timer will call ActionListener in Every 100 ms Interval
		timer = new Timer(TIMER_DELAY,listener);
		timer.start();
	}
	/**
	 * Create the frame.
	 */
	public GameLauncher() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 459);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("TextArea.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel mainLbl = new JLabel("");
		mainLbl.setIcon(new ImageIcon(GameLauncher.class.getResource("main.gif")));
		mainLbl.setBounds(19, 19, 476, 302);
		contentPane.add(mainLbl);
		
		
		lblGamerZone.setHorizontalAlignment(SwingConstants.CENTER);
		lblGamerZone.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblGamerZone.setBounds(130, 333, 287, 38);
		contentPane.add(lblGamerZone);
		progressBar.setBackground(Color.WHITE);
		
		
		progressBar.setForeground(Color.GREEN);
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		progressBar.setStringPainted(true);
		progressBar.setBounds(19, 383, 476, 38);
		contentPane.add(progressBar);
	}
}
