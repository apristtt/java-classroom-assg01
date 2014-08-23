/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assg01;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class TestPerson {
    static void print(Person obj){
        System.out.println("Name : " + obj.getName() + "\nSurname : " + obj.getSurname() + "\nProgram : " + obj.getProgram() + "\nAge : "+ obj.getAge());
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        Person pop = new Person();
        
        System.out.println("Pop : Please type your name : ");
        String name1 = sc.next();
        pop.setName(name1);
        
        System.out.println("Pop : Please type your surname : ");
        String surname1 = sc.next();
        pop.setSurname(surname1);
        
        System.out.println("Pop : Please type your program : ");
        String program1 = sc.next();
        pop.setProgram(program1);
        
        System.out.println("Pop : Please type your age : ");
        int age1 = sc.nextInt();
        pop.setAge(age1);
        
        Person nin = new Person();
        
        System.out.println("Nin : Please type your name : ");
        String name2 = sc.next();
        nin.setName(name2);
        
        System.out.println("Nin : Please type your surname : ");
        String surname2 = sc.next();
        nin.setSurname(surname2);
        
        System.out.println("Nin : Please type your program : ");
        String program2 = sc.next();
        nin.setProgram(program2);
        
        System.out.println("Nin : Please type your age : ");
        int age2 = sc.nextInt();
        nin.setAge(age2);
        
        print(pop);
        print(nin);

    }
}
