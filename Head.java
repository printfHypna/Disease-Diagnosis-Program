package main;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Head extends JFrame implements MouseListener{
	
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JButton btnNose = new JButton("NOSE");
	JButton btnHairyArea = new JButton("HAIRY AREA");
	JButton btnEye = new JButton("EYE");
	
	public Head() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN"));
		add(new JLabel("HEAD"));
		add(btnNose);
		add(btnHairyArea);
		add(btnEye);
		
		btnNose.addMouseListener(this);
		
		
		
	}
	
//	public static void main(String[] args) {
//		new Head().setVisible(true);
//		
//	}
	
	Nose ns= new Nose();
	

	
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnNose)
		{
	     ns.setVisible(true);
	     
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
