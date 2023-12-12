import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LaunchScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sub1txt;
	private JTextField sub2txt;
	private JTextField sub3txt;
	private JTextField sub4txt;
	private JTextField sub5txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaunchScreen frame = new LaunchScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LaunchScreen() {
		setBackground(new Color(43, 41, 90));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setForeground(new Color(14, 192, 143));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 33));
		lblNewLabel.setBounds(53, 102, 174, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblGrade = new JLabel("GRADE");
		lblGrade.setForeground(new Color(14, 192, 143));
		lblGrade.setFont(new Font("Monotype Corsiva", Font.BOLD, 33));
		lblGrade.setBounds(53, 147, 139, 70);
		contentPane.add(lblGrade);
		
		JLabel lblCalci = new JLabel("CALCI");
		lblCalci.setForeground(new Color(14, 192, 143));
		lblCalci.setFont(new Font("Monotype Corsiva", Font.BOLD, 33));
		lblCalci.setBounds(53, 191, 139, 70);
		contentPane.add(lblCalci);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GREEN);
		separator.setForeground(Color.GREEN);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(53, 157, 0, 74);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Subject 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(367, 85, 106, 26);
		contentPane.add(lblNewLabel_1);
		
		sub1txt = new JTextField();
		sub1txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sub1txt.setBounds(483, 85, 126, 26);
		contentPane.add(sub1txt);
		sub1txt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Marks:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(367, 30, 220, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject 2:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(367, 140, 106, 26);
		contentPane.add(lblNewLabel_1_1);
		
		sub2txt = new JTextField();
		sub2txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sub2txt.setColumns(10);
		sub2txt.setBounds(483, 140, 126, 26);
		contentPane.add(sub2txt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject 3:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(367, 191, 106, 26);
		contentPane.add(lblNewLabel_1_2);
		
		sub3txt = new JTextField();
		sub3txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sub3txt.setColumns(10);
		sub3txt.setBounds(483, 191, 126, 26);
		contentPane.add(sub3txt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subject 4:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(367, 252, 106, 26);
		contentPane.add(lblNewLabel_1_3);
		
		sub4txt = new JTextField();
		sub4txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sub4txt.setColumns(10);
		sub4txt.setBounds(483, 252, 126, 26);
		contentPane.add(sub4txt);
		
		JLabel lblNewLabel_1_4 = new JLabel("Subject 5:");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(367, 303, 106, 26);
		contentPane.add(lblNewLabel_1_4);
		
		sub5txt = new JTextField();
		sub5txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sub5txt.setColumns(10);
		sub5txt.setBounds(483, 303, 126, 26);
		contentPane.add(sub5txt);
		
		JButton btnshow = new JButton("Show Grade");
		btnshow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnshow.setForeground(new Color(14, 192, 143));
		btnshow.setBounds(367, 390, 242, 41);
		contentPane.add(btnshow);
		btnshow.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		setVisible(false);
        		Result r=new Result(sub1txt.getText(),sub2txt.getText(),sub3txt.getText(),sub4txt.getText(),sub5txt.getText());
        		r.setVisible(true);
        	}
        });
	}
}
