package main;

import java.util.ArrayList;
import java.util.List;

class DiseaseNode {
    String disease;
    List<String> symptoms;
    DiseaseNode left;
    DiseaseNode right;

    public DiseaseNode(String disease, List<String> symptoms) {
        this.disease = disease;
        this.symptoms = symptoms;
        this.left = null;
        this.right = null;
    }
}

class DiseaseTree {
    private DiseaseNode root;

    public DiseaseTree() {
        this.root = null;
    }

    public void insert(String disease, List<String> symptoms) {
        root = insertRecursive(root, disease, symptoms);
    }

    private DiseaseNode insertRecursive(DiseaseNode current, String disease, List<String> symptoms) {
        if (current == null) {
            return new DiseaseNode(disease, symptoms);
        }

        // Assuming diseases are stored in alphabetical order
        if (disease.compareToIgnoreCase(current.disease) < 0) {
            current.left = insertRecursive(current.left, disease, symptoms);
        } else if (disease.compareToIgnoreCase(current.disease) > 0) {
            current.right = insertRecursive(current.right, disease, symptoms);
        }

        return current;
    }
    
    public List<String> searchBySymptoms(List<String> symptoms) {
        List<String> diseases = new ArrayList<>();
        searchBySymptomsRecursive(root, symptoms, diseases);
        return diseases;
    }

    private void searchBySymptomsRecursive(DiseaseNode current, List<String> symptoms, List<String> diseases) {
        if (current != null) {
            searchBySymptomsRecursive(current.left, symptoms, diseases);
            if (current.symptoms.containsAll(symptoms)) {
                diseases.add(current.disease);
            }
            searchBySymptomsRecursive(current.right, symptoms, diseases);
        }
    }

    public void displayInOrder() {
        displayInOrderRecursive(root);
    }

    private void displayInOrderRecursive(DiseaseNode current) {
        if (current != null) {
            displayInOrderRecursive(current.left);
            System.out.println("Disease: " + current.disease);
            System.out.println("Symptoms: ");
            for (String symptom : current.symptoms) {
                System.out.println("- " + symptom);
            }
            System.out.println();
            displayInOrderRecursive(current.right);
        }
    }
}