package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader myReader = new BufferedReader(new FileReader("data.csv"));
            while ((line = myReader.readLine()) != null) {
                String[] employee = line.split(splitBy);
                String[] peoples = employee[0].split(";");
                if (peoples[3].equals("Student")) {
                        Student stud = new Student(peoples[0], peoples[1], peoples[2],false);
                        System.out.println(stud.name +" "+ stud.userName +" "+ stud.age+" hasLEarnedLesson: "+stud.hasLearnedLesson);
                }else if (peoples[3].equals("Teacher")) {
                    Teacher teach = new Teacher(peoples[0], peoples[1], peoples[2],true);
                    System.out.println(teach.name +" "+ teach.userName +" "+ teach.age+" isInClass: "+teach.isInClass);
                }else{
                    Director director = new Director(peoples[0], peoples[1], peoples[2],true);
                    System.out.println(director.name +" "+ director.userName +" "+ director.age+" isActveDirector: "+director.isActiveDirector);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}