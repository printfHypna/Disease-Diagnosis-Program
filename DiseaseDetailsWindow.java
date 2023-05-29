package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DiseaseDetailsWindow extends JFrame implements MouseListener{
	
	private String selectedDisease;
	
	JButton returnBtn = new JButton("RETURN");

	public DiseaseDetailsWindow(String selectedDisease) {
		
		this.selectedDisease = selectedDisease;
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		setLayout(new BorderLayout());
		
		JTextArea diseaseDesc = new JTextArea(selectedDisease); 
		
		diseaseDesc.setLineWrap(true);
		diseaseDesc.setWrapStyleWord(true);
		diseaseDesc.setEditable(false);
		
		int fontSize = 18;
		diseaseDesc.setFont(diseaseDesc.getFont().deriveFont(Font.BOLD, fontSize));
		
		add(diseaseDesc, BorderLayout.CENTER);
		add(returnBtn, BorderLayout.SOUTH);
		
		// FIX THIS GUI 
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == returnBtn) {
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
