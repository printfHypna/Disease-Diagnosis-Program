package main;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Results extends JFrame {
	
	private ArrayList<String> selectedCheckBoxes;
	private String username;
	
	public Results(String username, ArrayList<String> selectedCheckBoxes) {
		
		this.username = username;
		this.selectedCheckBoxes = selectedCheckBoxes;
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		setLayout(new BorderLayout());
		
		LinkedList ll = new LinkedList();
		ll.add(username, selectedCheckBoxes);
		ll.display();
		
		DiseaseTree tree = new DiseaseTree();
		createDiseaseTree(tree);
		ArrayList<String> matchingDiseases = tree.searchBySymptoms(selectedCheckBoxes);
		
		JLabel diseasesLabel = new JLabel("Matching Diseases: " + matchingDiseases.toString());
        add(diseasesLabel, BorderLayout.CENTER);
			
		
	}
	 public static void createDiseaseTree(DiseaseTree tree) {
		  
	        ArrayList<String> fluSymptoms = new ArrayList<>();
	        fluSymptoms.add("RUNNY NOSE");
	        fluSymptoms.add("REDUCED SENSE OF SMELL");
	        fluSymptoms.add("Sore Throat");

	        ArrayList<String> coldSymptoms = new ArrayList<>();
	        coldSymptoms.add("Runny Nose");
	        coldSymptoms.add("Sneezing");
	        coldSymptoms.add("Headache");

	        ArrayList<String> covidSymptoms = new ArrayList<>();
	        covidSymptoms.add("Fever");
	        covidSymptoms.add("Cough");
	        covidSymptoms.add("Shortness of Breath");

	        ArrayList<String> malariaSymptoms = new ArrayList<>();
	        malariaSymptoms.add("Fever");
	        malariaSymptoms.add("Chills");
	        malariaSymptoms.add("Headache");

	        ArrayList<String> dengueSymptoms = new ArrayList<>();
	        dengueSymptoms.add("Fever");
	        dengueSymptoms.add("Severe Joint and Muscle Pain");
	        dengueSymptoms.add("Rash");

	        tree.insert("Sinusitis", fluSymptoms);
	        tree.insert("Common Cold", coldSymptoms);
	        tree.insert("COVID-19", covidSymptoms);
	        tree.insert("Malaria", malariaSymptoms);
	        tree.insert("Dengue", dengueSymptoms);
	    }
}
