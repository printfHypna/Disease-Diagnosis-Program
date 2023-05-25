package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
    	Login l = new Login();
    	l.setVisible(true);
    	// Tree Main
    	// Each node consists diseases and the symptoms of it
    	
    	
    	LinkedList userList = new LinkedList();
    	String username = l.getUsername();
    	
    	Nose n = new Nose(username);
    	ArrayList<String> symptoms = new ArrayList();
    	symptoms = n.getSelectedCheckBoxes(); 
    	userList.add(username, symptoms);
    	userList.display();
    	
    }

   
}
