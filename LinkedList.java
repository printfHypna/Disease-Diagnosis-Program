package main;

import java.util.ArrayList;

class Node {
    String name;
    ArrayList<String> symptoms;
    Node next;

    public Node(String name, ArrayList<String> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
        this.next = null;
    }
}
// Kullanıcı ismi ve semptomları bu linked listte depolanacak
class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(String name, ArrayList<String> symptoms) {
        Node newNode = new Node(name, symptoms);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Name: " + current.name);
            System.out.println("Symptoms: ");
            for (String symptom : current.symptoms) {
                System.out.println("- " + symptom);
            }
            System.out.println();
            current = current.next;
        }
    }
}
