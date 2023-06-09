package main;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Back extends JFrame implements MouseListener {
	
	JTextField txtCA = new JTextField();
	JTextField txtCa = new JTextField();
	JButton btnWaist = new JButton("WAIST");
	JButton btnLowerBack = new JButton("LOWER BACK");
	JButton btnUpperBack = new JButton("UPPER BACK");
	
	private String username;
	public Back(String username) {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN"));
		add(new JLabel("BACK"));
		add(btnWaist);
		add(btnLowerBack);
		add(btnUpperBack);
		btnWaist.addMouseListener(this);
		btnLowerBack.addMouseListener(this);
		btnUpperBack.addMouseListener(this);
		
		
		
		
	}

	Waist ws= new Waist(username);
	LowerBack  lb= new LowerBack(username);
	UpperBack ey= new UpperBack(username);
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
			if(e.getSource() == btnWaist)
			{
		     ws.setVisible(true);
		     dispose();
			}
			
			else if(e.getSource() == btnLowerBack)
			{
		     lb.setVisible(true);
		     dispose();
			}
			else if(e.getSource() == btnUpperBack)
			{
		     ey.setVisible(true);
		     dispose();
			}
			
			
		}
		
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


}
