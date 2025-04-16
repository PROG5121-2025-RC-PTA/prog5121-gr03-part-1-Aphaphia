/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String username;
        String password;
        String cellNumber;
       
        
        
        System.out.println("===User Registration===");
         //Asking the user for their username
        
        while(true){
        System.out.println("Enter your username(max 5 characters, should contain '_'):");  
        username=scanner.nextLine();
        
        if(username.length()<=5 && username.contains("_")){
         System.out.println("Username successfully captured.") ;
         break;
         
        }else{
         System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long");   
        }
    }
        //Asking the user to create a password
        
        while(true){
            System.out.println("Enter your password(At least 8 characters, must contain a capital letter, number and a special character):");
            password= scanner.nextLine();
            
            if (isValidPassword(password)){
            System.out.println("Password successfully captured");
            break;
        }else{
                System.out.println("Password is NOT correctly formatted;please ensure that the password contains at keast 8 characters, a capital letter, a number and a special character.");
             
}
        }
        //Checking the cell number
        
        while(true){
            System.out.print("Enter your cell phone number(must start with +27 and be 10 digits");
            cellNumber= scanner.nextLine();
            
            
            if(cellNumber.matches("^\\+27\\d{12}$")){
            System.out.println("Cell phone successfully added");
            break;
            
           }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            }
        }
        System.out.println("\nAccount created successfully");
        scanner.close();
    }
    //Password validity
    public static boolean isValidPassword(String password){
         boolean hasUpperCase=false;
         boolean hasNumber=false;
         boolean hasSpecialChar=false;
    
    
    if (password.length()<8) return false;
    
     for(char c : password.toCharArray()){
         
     if (Character.isUpperCase (c)){
         hasUpperCase=true;
     }
        else if (Character.isDigit(c)){
            hasNumber=true;
        }
        else if (Character.isLetterOrDigit(c)){
            hasSpecialChar=true;
        }
    }
    return hasUpperCase && hasNumber && hasSpecialChar;
    }
    //Reference:https://www.greeksforgeeks.org/password-validation-in-java/
    
    
    //Cell number validity
    public static boolean isValidCellNumber(String cellNumber){
        return cellNumber.startsWith("+27")&&
                cellNumber.length()== 12 &&
                cellNumber.substring(3).matches("\\d{9}");
        
        //Reference: https://docs.oracle.com/javase/tutorials
    }
}