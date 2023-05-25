package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
    	Login l = new Login();
    	l.setVisible(true);
    	// Tree Main
    	// Each node consists diseases and the symptoms of it
    	
        DiseaseTree tree = new DiseaseTree();
        createDiseaseTree(tree);

        tree.displayInOrder();

        List<String> symptoms = new ArrayList<>();
        symptoms.add("Fever");
        symptoms.add("Cough");

        List<String> diseasesWithSymptoms = tree.searchBySymptoms(symptoms);

        System.out.println("Diseases with symptoms:");
        for (String disease : diseasesWithSymptoms) {
            System.out.println("- " + disease);

        }
        
        // Linked List Main
        // Each node consists user's name and symptoms
        
        LinkedList userList = new LinkedList();

        ArrayList<String> symptoms1 = new ArrayList<>();
        symptoms1.add("Fever");
        symptoms1.add("Cough");
        userList.add("John", symptoms1);

        ArrayList<String> symptoms2 = new ArrayList<>();
        symptoms2.add("Headache");
        symptoms2.add("Sore Throat");
        userList.add("Emma", symptoms2);

        userList.display();
    }

    public static void createDiseaseTree(DiseaseTree tree) {
        List<String> fluSymptoms = new ArrayList<>();
        fluSymptoms.add("Fever");
        fluSymptoms.add("Cough");
        fluSymptoms.add("Sore Throat");

        List<String> coldSymptoms = new ArrayList<>();
        coldSymptoms.add("Runny Nose");
        coldSymptoms.add("Sneezing");
        coldSymptoms.add("Headache");

        List<String> covidSymptoms = new ArrayList<>();
        covidSymptoms.add("Fever");
        covidSymptoms.add("Cough");
        covidSymptoms.add("Shortness of Breath");

        List<String> malariaSymptoms = new ArrayList<>();
        malariaSymptoms.add("Fever");
        malariaSymptoms.add("Chills");
        malariaSymptoms.add("Headache");

        List<String> dengueSymptoms = new ArrayList<>();
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