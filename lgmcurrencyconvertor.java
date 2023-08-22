package javainternship;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class lgmcurrencyconvertor {
	private JFrame f;
	private JLabel title,amountlabel,answer,from,to;
	private JTextArea amount;
	private JButton convert;
    private String languages[]={" ","INR","Dollar","EURO"};    
    private JComboBox cb,cb2;
    private String a=" ",b=" ",camount=null;
	public lgmcurrencyconvertor()
	{
		f=new JFrame("CURRENCY CONVERTOR");
		f.setLayout(null);
		f.setSize(400,400);
		
		title=new JLabel("CURRENCY CONVERTOR");
		title.setBounds(0,0,400,20);
		title.setFont(new Font("Arial",Font.BOLD,20));
		f.add(title);
		
		amountlabel=new JLabel("ENTER AMOUNT:");
		amountlabel.setBounds(0,30,400,20);
		amountlabel.setFont(new Font("Arial",Font.BOLD,15));
		f.add(amountlabel);
		
		amount=new JTextArea();
		amount.setBounds(150,30,200,20);
		amount.setFont(new Font("Arial",Font.BOLD,15));
		amount.setBackground(Color.yellow);
		amount.setForeground(Color.red);
		f.add(amount);
		 
		answer = new JLabel();          
	    answer.setBounds(0,200,400,20);
		answer.setFont(new Font("Arial",Font.BOLD,15));
	    f.add(answer);

	    convert=new JButton(new ImageIcon("C:\\Users\\hackerAryan\\Music\\DocScanner 17 Aug 2023 22-04.jpg"));
	    convert.setBounds(100,150,130,25);
		convert.setFont(new Font("Arial",Font.BOLD,15));
		f.add(convert);          
	    
		from= new JLabel();          
	    from.setBounds(0,200,400,20);
		from.setFont(new Font("Arial",Font.BOLD,15));
	    f.add(from);

		
	    cb=new JComboBox(languages);    
	    cb.setBounds(25, 100,140,20);    
	    f.add(cb);
	    
	    cb2=new JComboBox(languages);
	    cb2.setBounds(200,100,140,20);
	    f.add(cb2);
	    convert.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        
	        	a = (String) cb.getItemAt(cb.getSelectedIndex());  
	        	b = (String) cb2.getItemAt(cb2.getSelectedIndex()); 
	        	camount=(String)amount.getText();
	        	if (a==" "||b==" "||camount.isEmpty())
	        	{
	        		answer.setText("please enter all information");  
	        	}
	        	else
	        	{
	        		String c=" ";
	        		double a1=Double.parseDouble(camount);
	        		double c1=0.0;
	        		if(a=="INR"&&b=="Dollar")
	        		{
	        			c1=a1/65.25;
	        			c="Dollar:"+c1;
	        		}
	        		else if(b=="INR"&&a=="Dollar")
	        		{
	        			c1=a1*65.25;
	        			c="RUPPEE:"+c1;
	        		}
	        		else if(a=="INR"&&b=="EURO")
	        		{
	        			c1=a1*0.0110;
	        			c="EURO:"+c1;
	        		}
	        		else if (a=="EURO"&&b=="INR")
	        		{
	        			c1=a1*90.4995;
	        			c="RUPPEE:"+c1;
	        		}
	        		else if(a=="Dollar"&&b=="EURO")
	        		{
	        			c1=a1*0.918115;
	        			c="EURO:"+c1;
	        		}
	        		else if(a=="EURO"&&b=="Dollar")
	        		{
	        			c1=a1/0.918115;
	        			c="USD:"+c1;
	        		}
	        		answer.setText(c);  
	        	}	
	}  
	});           
		
		f.setVisible(true);

		
	}
	public static void main(String args[])
	{
		new lgmcurrencyconvertor();
	}
}
