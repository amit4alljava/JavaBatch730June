import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AnsFrame extends JFrame {
	private JButton button;
	private String correctAns;
	private JPanel contentPane;
	private JTextField textField;
	
	private JButton orgButton ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					//AnsFrame frame = new AnsFrame();
					//frame.setVisible(true);
			
	}
	
	private void checkYourAns(){
		String yourAns = textField.getText();
		if(correctAns.equals(yourAns)){
			JOptionPane.showMessageDialog(this, "Correct Ans");
			//button.setEnabled(false);
			//button.setEnabled(b);
			orgButton.setEnabled(false);
			this.setVisible(false);
			
			//this.dispose();
		}
		else
		{
			
			JOptionPane.showMessageDialog(this, "InCorrect Ans");
		}
	}

	/**
	 * Create the frame.
	 */
	public AnsFrame(String correctAns , String imageName, JButton orgButton ) {
		this.correctAns = correctAns;
		this.button = new JButton("");
		this.orgButton =orgButton;
		this.button.setIcon(new ImageIcon(AnsFrame.class.getResource(imageName)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		this.button.setBounds(105, 20, 147, 131);
		contentPane.add(this.button);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		textField.setBounds(97, 198, 274, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeAnsHere = new JLabel("Type Ans Here");
		lblTypeAnsHere.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblTypeAnsHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeAnsHere.setBounds(97, 164, 274, 27);
		contentPane.add(lblTypeAnsHere);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkYourAns();
			}
		});
		btnSubmit.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnSubmit.setBounds(174, 269, 117, 29);
		contentPane.add(btnSubmit);
	}
}
