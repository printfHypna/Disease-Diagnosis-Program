package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.w3c.dom.css.RGBColor;

import java.awt.GridLayout;
import java.awt.FlowLayout;


public class Login extends JFrame implements MouseListener{
	
	JTextField txtNMAndSrnm = new JTextField();
	JButton btnNext = new JButton("Next");
	
	
	public Login() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(300,150);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new GridLayout(3,1)); 
		
		add(new JLabel("NAME AND SURNAME:"));
		add(txtNMAndSrnm);
		add(btnNext);
		
		btnNext.addMouseListener(this);
		
		
	}
	

//	public static void main(String[] args) {
//		new Login().setVisible(true);
//		
//	}
	
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnNext)
		{
	     Symptoms sy = new Symptoms(txtNMAndSrnm.getText());
	     sy.setVisible(true);
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