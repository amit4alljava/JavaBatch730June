import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TicTacToe extends JFrame {
	private boolean isXorZero = true;
	private JPanel contentPane;
	JButton oneBt = new JButton(" ");
	JButton twobt = new JButton("");
	JButton threeBt = new JButton("");
	JButton fourBt = new JButton("");
	JButton fiveBt = new JButton("");
	JButton sixBt = new JButton("");
	JButton sevenBt = new JButton("");
	JButton eigthBt = new JButton("");
	JButton nineBt = new JButton("");
	private boolean isNotBlank(JButton button){
		if(button.getText().trim().length()==0){
			return false;
		}
		else
		{
			return true;
		}
	}
	private boolean isRowNotBlank(JButton b1 , JButton b2, JButton b3){
		if(isNotBlank(b1) && isNotBlank(b2) && isNotBlank(b3)){
		return true;
		}
		else
		{
			return false;
		}
	}
	private boolean isRowMatch(JButton b1 , JButton b2, JButton b3){
		if(isRowNotBlank(b1,b2,b3)){
		if(b1.getText().equals(b2.getText()) 
				&& b1.getText().equals(b3.getText())){
			return true;
		}
		else{
			return false;
		}
		}
		else{
			return false;
		}
	}
	
	private boolean isGameOver(){
		
			if(isRowMatch(oneBt,twobt,threeBt)){
				return true;
			}
			else
				if(isRowMatch(oneBt,fourBt,sevenBt)){
					return true;
				}
				else
					if(isRowMatch(oneBt,fiveBt,nineBt)){
						return true;
					}	
		return false;
	}
	private void resetGame(){
		oneBt.setText("");
		twobt.setText("");
		threeBt.setText("");
		fourBt.setText("");
		fiveBt.setText("");
		sixBt.setText("");
		sevenBt.setText("");
		eigthBt.setText("");
		nineBt.setText("");
		
	}
	private void printXorZero(JButton button){
		if(button.getText().trim().length()==0){
		if(isXorZero){
			button.setText("X");
		}
		else{
			button.setText("0");
		}
		isXorZero = !isXorZero;
		if(isGameOver()){
			JOptionPane.showMessageDialog(this
					, "Game Over "+button.getText()+" U Win");
			isXorZero=true;
			resetGame();
		}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setTitle("TicTacToe-Game2016");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		oneBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(oneBt);
			}
		});
		oneBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		oneBt.setBounds(17, 51, 117, 29);
		contentPane.add(oneBt);
		
		
		twobt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(twobt);
			}
		});
		twobt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		twobt.setBounds(156, 51, 117, 29);
		contentPane.add(twobt);
		
		
		threeBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(threeBt);
			}
		});
		threeBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		threeBt.setBounds(302, 51, 117, 29);
		contentPane.add(threeBt);
		
		
		fourBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(fourBt);
			}
		});
		fourBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		fourBt.setBounds(6, 112, 117, 29);
		contentPane.add(fourBt);
		
		
		fiveBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(fiveBt);
			}
		});
		fiveBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		fiveBt.setBounds(156, 112, 117, 29);
		contentPane.add(fiveBt);
		
		
		sixBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(sixBt);
			}
		});
		sixBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		sixBt.setBounds(302, 112, 117, 29);
		contentPane.add(sixBt);
		
		
		sevenBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(sevenBt);
			}
		});
		sevenBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		sevenBt.setBounds(6, 190, 117, 29);
		contentPane.add(sevenBt);
		
		
		eigthBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(eigthBt);
			}
		});
		eigthBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		eigthBt.setBounds(156, 190, 117, 29);
		contentPane.add(eigthBt);
		
		
		nineBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(nineBt);
			}
		});
		nineBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		nineBt.setBounds(302, 190, 117, 29);
		contentPane.add(nineBt);
	}
}
