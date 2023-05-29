package main;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Abdomen extends JFrame implements MouseListener {
	
	
	
	JTextField txtCA = new JTextField();
	JTextField txtCa = new JTextField();
	JButton btnStomach = new JButton("STOMACH");
	JButton btnLowerStomach = new JButton("LOWER STOMACH");
	JButton btnUpperStomach = new JButton("UPPER STOMACH");
	private String username;
	
	public Abdomen(String username) {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("CHOOSE THE AREA WHERE YOU FEEL PAIN"));
		add(new JLabel("ABDOMEN"));
		add(btnStomach);
		add(btnLowerStomach);
		add(btnUpperStomach);
		
		btnStomach.addMouseListener(this);
		btnLowerStomach.addMouseListener(this);
		btnUpperStomach.addMouseListener(this);
		
		
	}

	Stomach ns= new Stomach(username);
	LowerStomach ha= new LowerStomach(username);
	UpperStomach ey= new UpperStomach(username);

	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnStomach)
		{
	     ns.setVisible(true);
	     dispose();
		}
		
		else if(e.getSource() == btnLowerStomach)
		{
	     ha.setVisible(true);
	     dispose();
		}
		else if(e.getSource() == btnUpperStomach)
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
