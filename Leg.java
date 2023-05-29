package main;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Leg extends JFrame implements MouseListener {

	JTextField txtCA = new JTextField();
	JTextField txtCa = new JTextField();
	JButton btnFeet = new JButton("FEET");
	JButton btnKneecap = new JButton("KNEECAP");
	JButton btnUpperLeg = new JButton("UPPER LEG");
	
	private String username;
	public Leg(String username) {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN"));
		add(new JLabel("LEG"));
		add(btnFeet);
		add(btnKneecap);
		add(btnUpperLeg);
		
		btnFeet.addMouseListener(this);
		btnKneecap.addMouseListener(this);
		btnUpperLeg.addMouseListener(this);
		
		
	}
	
	Feet ft= new Feet(username);
	Kneecap kc = new Kneecap(username);
	UpperLeg ul = new UpperLeg(username);

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnFeet)
		{
	     ft.setVisible(true);
	     dispose();
		}
		
		else if(e.getSource() == btnKneecap)
		{
	     kc.setVisible(true);
	     dispose();
		}
		else if(e.getSource() == btnUpperLeg)
		{
	     ul.setVisible(true);
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
