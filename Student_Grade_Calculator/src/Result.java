import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class Result extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
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
	public Result() {
		
	}

	public Result(String s1, String s2, String s3, String s4, String s5) 
	{
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 376);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(195, 10, 150, 37);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotal.setBounds(81, 94, 150, 37);
		contentPane.add(lblTotal);
		
		JLabel lblAverage = new JLabel("Average :");
		lblAverage.setForeground(Color.WHITE);
		lblAverage.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAverage.setBounds(81, 157, 150, 37);
		contentPane.add(lblAverage);
		
		JLabel lblGrade = new JLabel("Grade :");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGrade.setBounds(81, 219, 150, 37);
		contentPane.add(lblGrade);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnexit.setBounds(24, 297, 93, 32);
		contentPane.add(btnexit);
		btnexit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		setVisible(false);
        		LaunchScreen l=new LaunchScreen();
        		l.setVisible(true);
        	}
        });
		int total=Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3)+Integer.parseInt(s4)+Integer.parseInt(s5);
		lblTotal.setText("Total:"+total);
		
		float avg=total/5;
		lblAverage.setText("Average:"+avg);
		
		if(avg>90 && avg<=100)
		{
			lblGrade.setText("Grade:A");
		}
		else if(avg>80 && avg<=90)
		{
			lblGrade.setText("Grade:B");
		}
		else if(avg>60 && avg<=80)
		{
			lblGrade.setText("Grade:c");
		}
		else if(avg>40 && avg<=60)
		{
			lblGrade.setText("Grade:D");
		}
		else
		{
			lblGrade.setText("Grade:Fail");
		}
	}

}
