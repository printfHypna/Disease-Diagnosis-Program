package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DiseaseDetailsWindow extends JFrame {
	
	private String selectedDisease;

	public DiseaseDetailsWindow(String selectedDisease) {
		
		this.selectedDisease = selectedDisease;
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		setLayout(new BorderLayout());
		
		JLabel diseaseDesc = new JLabel(selectedDisease); 
		
		add(diseaseDesc, BorderLayout.CENTER);
		
		
		
	}
}
