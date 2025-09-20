package chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabeimport javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame
{
	public JTextArea ca=new JTextArea();
	public JTextField cf=new JTextField();
	public JButton b=new JButton();
	public JLabel l=new JLabel();
	
	Chatbot()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.lightGray);	
		f.setTitle("ChatBot");
		
		f.add(ca);
		
		ca.setSize(300,310);
		ca.setLocation(1,1);
		ca.setBackground(Color.cyan);
		f.add(cf);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b)
				{ 
					//String text=cf.getText().toLowerCase();
					String text=cf.getText().toLowerCase();
					
					ca.append(" You--> "+text+"\n");
					cf.setText("");
					if(text.contains("hi"))
					{
						replyMeth("Hi there");
					}
					else if(text.contains("how are you"))
					{
						replyMeth("I am good, Thank you for asking");
					}
					else if(text.contains("What is your name"))
					{
						replyMeth("My name Shiri");
					}
					else if(text.contains("who made you"))
					{
						replyMeth("Amruta made me");
					}
					else
					{
						replyMeth("I can't understand");
					}
							
				}
			}
		});
		
		
	}
	public void replyMeth(String s)
	{
		ca.append("ChatBot-->"+s+"\n");
	}
}



public class ChatbotDemo {

	public static void main(String[] args) {
		
		Chatbot c=new Chatbot();
	}

}
