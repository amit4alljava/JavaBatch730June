import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	
	private void launchTicTac(){
		TicTacToe tic = new TicTacToe();
		tic.setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainScreen.class.getResource("main2.gif")));
		lblNewLabel.setBounds(6, 57, 528, 404);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			launchTicTac();
			}
		});
		mnGame.add(mntmTictactoe);
		
		JMenuItem mntmLogoQuiz = new JMenuItem("Logo Quiz");
		mnGame.add(mntmLogoQuiz);
		
		JMenuItem mntmKbc = new JMenuItem("KBC");
		mnGame.add(mntmKbc);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnGame.add(mntmExit);
	}
}
