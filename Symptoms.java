package main;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Symptoms extends JFrame implements MouseListener{
	
	
	JTextField txtPA = new JTextField();
	JButton btnHead = new JButton("HEAD");
	JButton btnChest = new JButton("CHEST AREA");
	JButton btnBack = new JButton("BACK");
	JButton btnAbdomen = new JButton("ABDOMEN");
	JButton btnLeg = new JButton("LEG");
	
	private String username;
	
	public Symptoms(String username) {
		
		this.username = username;
//		String capname = username.substring(0, 1).toUpperCase()
//				+ username.substring(1).toLowerCase();
//		System.out.println(capname);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(6,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN " + username));
		
		add(btnHead);
		add(btnChest);
		add(btnBack);
		add(btnAbdomen);
		add(btnLeg);
		
		
		btnHead.addMouseListener(this);
		btnChest.addMouseListener(this);
		btnBack.addMouseListener(this);
		btnAbdomen.addMouseListener(this);
		btnLeg.addMouseListener(this);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnHead) {
			Head hd= new Head(username);
		    hd.setVisible(true);
		}

		else if(e.getSource() == btnChest) {
		    Chest ca= new Chest();
			ca.setVisible(true);
		}
		
		else if(e.getSource() == btnBack) {
			Back bck= new Back();
			bck.setVisible(true);
		}
		
		else if(e.getSource() == btnAbdomen) {
			Abdomen abd= new Abdomen();
			abd.setVisible(true);
		}
		
		else if(e.getSource() == btnLeg) {
			Leg lg= new Leg();
			lg.setVisible(true);
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
