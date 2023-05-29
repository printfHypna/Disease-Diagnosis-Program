package main;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Chest extends JFrame implements MouseListener {
	JTextField txtCA = new JTextField();
	JTextField txtCa = new JTextField();
	JButton btnChestt = new JButton("CHEST");
	JButton btnChestArea = new JButton("CHEST AREA");
	
	private String username;
	
	public Chest(String username) {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(4,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN"));
		add(new JLabel("CHEST AREA"));
		add(btnChestt);
		add(btnChestArea);
		btnChestt.addMouseListener(this);
		btnChestArea.addMouseListener(this);
		
		
	}

	ChestArea ch= new ChestArea(username);
	Chestt chs= new Chestt(username);
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnChestt)
		{
	     chs.setVisible(true);
	     dispose();
		}
		else if(e.getSource() == btnChestArea)
		{
	     ch.setVisible(true);
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
