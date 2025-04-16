/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registerandlogin;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class RegisterAndLogin {
       static String savedUsername;
       static String savedPassword;
       static String firstName;
       static String lastName;
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         //---Registration---
         System.out.println("====REGISTER===");
         
         //First and last names of the user
         System.out.println("Enter your first name:");
         firstName= scanner.nextLine();
         
         System.out.println("Enter your last name:");
         lastName= scanner.nextLine();
         
         
         
         while(true){
        System.out.println("Enter your username(max 5 characters, should contain '_'):");  
        String username=scanner.nextLine();
        
        if(Login.checkUsername( username)){
         System.out.println("Username successfully captured.") ;
         savedUsername=username;
         break;
         
        }else{
         System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long");   
        }
        }
         while(true){
            System.out.println("Enter your password(At least 8 characters, must contain a capital letter, number and a special character):");
            String password= scanner.nextLine();
            
            if (Login.isValidPassword(password)){
            System.out.println("Password successfully captured");
            savedPassword=password;
            break;
        }else{
                System.out.println("Password is NOT correctly formatted,please ensure that the password contains at keast 8 characters, a capital letter, a number and a special character.");
                
         }
    }
          while(true){
            System.out.print("Enter your cell phone number(must start with +27 and be 10 digits");
            String cellNumber= scanner.nextLine();
            
            
            if(Login.isValidCellNumber(cellNumber)){
            System.out.println("Cell phone successfully added");
            break;
            
           }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            
            }
}
            //Login
            System.out.println("\n=== LOGIN===");

            System.out.println("Enter your username:");
            String LoginUsername=scanner.nextLine();
            
            System.out.println("Enter your password:");
            String LoginPassword=scanner.nextLine();
            
if (LoginUsername.equals(savedUsername) && LoginPassword.equals(savedPassword)){
    System.out.println("Welcome " + firstName + " " + lastName + "it is  great to see you again.");
}else{
    System.out.println("Username or password incorrect, please try again.");
}
scanner.close();
     }
}