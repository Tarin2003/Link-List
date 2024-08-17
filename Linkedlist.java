/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Hp
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        LinkedList<Student> list = new LinkedList<Student>();
        Student s1 = new Student("Sadia",87);
         Student s2 = new Student("Tarin",130);
         list.add(s1);
         list.add(s2);
         for(Student s : list){
             System.out.println("Name : "+s.name+" "+"ID : "+s.id);
         }
    }
    }
    

