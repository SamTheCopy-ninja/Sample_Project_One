/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package companyproducts;

import java.util.Scanner;

/**
 *
 * @author Samkelo Tshabalala
 */

public class CompanyProducts {
private static final Scanner KB = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //object of SetupDataStructure method from Products class 
      new Products().SetupDataStructure();
      
      //output for start menu display screen
        System.out.println("**************************************");
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        System.out.println("Enter (1) to launch menu\nor any other or any other key to exit");
        
      
        String launch = KB.next(); //user input for their choice to proceed to the menu or exit the app
   
     if ("1".equals(launch)) {
         //if - else statement to check user choice and proceed to the menu or exit the app
         new Products().DisplayMenu();//instance of DisplayMenu method Products class
    } 
     else {
         System.exit(0);
     }
    }
    
}
