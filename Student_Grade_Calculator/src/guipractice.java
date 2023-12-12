import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guipractice extends Frame
{

	public guipractice ()
	{
		
		
		Label l=new Label("Enter A Value:");
		l.setBounds(30,30,50,20);
		add(l);
		TextField t=new TextField("");
		t.setBounds(100,30,50,20);
		add(t);
		Button b=new Button("Ascii");
		b.setBounds(60,60,50,20);
		add(b);
		Label l2=new Label("Ascii value:");
		l2.setBounds(40,80,100,20);
		add(l2);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String a=t.getText();
				int b=(int)(a.charAt(0));
				String c=""+b;
				l2.setText(c);
				System.out.println(b);
			}	
		});
		
		Button eo=new Button("Even/Odd");
		eo.setBounds(160,60,50,20);
		add(eo);
		
		Label l3=new Label("Status:");
		l3.setBounds(150,120,100,20);
		add(l3);
		eo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
			    int num=Integer.parseInt(t.getText());
			    if(num%2==0)
			    {
			    	l3.setText("Even");
			    }
			    else
			    {
			    	l3.setText("Odd");
			    }
			    
			
			}
		});
		setBounds(20, 20, 400, 400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		guipractice ex=new guipractice();

	}

}
