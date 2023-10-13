/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_application;

import java.util.Scanner;

/**
 *
 * @author Hikamt Afghan
 */
public class MY_APPLICATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
          String  arr;
       
       String a="";
        System.out.println("welcome to my query creating application");
        System.out.println("please press 1 for create table query and insertting data");
      
        int create=input.nextInt();
        if(create==1){
               System.out.print("create table  ");
               a=input.next();
             
               System.out.println("(");
               for(int i=0;i<5;i++){
                   arr=input.next();
               }
               System.out.println(")");
               System.out.println("table created! ");
     
        }
        System.out.println("for insert data press 2 || for exit press 0 ");
        int b=input.nextInt();
        if(b==2){
           System.out.println("please insert data Now");
                System.out.print("insert into "+a+" values");
                System.out.println("(");
                for(int i=0;i<5;i++){
                arr=input.next();
                
                }
                System.out.println(")");
                System.out.println("Data Inserted");
                
        }
        if(b==0){
            System.out.println("you exit the program!!");
        }
        
        
    }
    
}
//C:\Users\Hikamt Afghan\Documents\NetBeansProjects\MY_APPLICATION