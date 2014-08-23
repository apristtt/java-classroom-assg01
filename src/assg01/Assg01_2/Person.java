/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assg01;

/**
 *
 * @author dell
 */
public class Person {
    private String name;
    private String surname;
    public String program;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
}
