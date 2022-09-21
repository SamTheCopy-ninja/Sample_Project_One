/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyproducts;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author Samkelo Tshabalala
 */
public class Products {
    //global scanner visible across the entire class
    private final Scanner kb = new Scanner(System.in);
    
    //Arraylists to capture product information
    private ArrayList productCode;
    private ArrayList productName;
    private ArrayList productCategory;
    private ArrayList productWarranty;
    private ArrayList productPrice;
    private ArrayList productStockLevels;
    private ArrayList productSupplier;
    
    
    
    public void SetupDataStructure(){
        //Arraylist objects created
    productCode = new ArrayList();
    productName = new ArrayList();
    productCategory = new ArrayList();
    productWarranty = new ArrayList();
    productPrice = new ArrayList();
    productStockLevels = new ArrayList();
    productSupplier = new ArrayList();
    
    }
   
    
    
    public void DisplayMenu(){
        
        boolean run = false;
        while(run == false)
        {//while loop to display menu switch case until user picks an option from the menu
            System.out.println("______________________________________________");
        System.out.println("Please select one of the following menu items\n");
        System.out.println("(1) - Capture a new product");
        System.out.println("(2) - Search for a product");
        System.out.println("(3) - Update a product");
        System.out.println("(4) - Delete a product");
        System.out.println("(5) - Print report");
        System.out.println("(6) - Exit application");
            System.out.println("______________________________________________");
        
        String menuChoice = kb.next(); //capturing the user's menu choice
        
        switch(menuChoice){
            //switch case to redirect to the relevant screen after the user makes a choice
            case "1": CaptureProduct();
                System.out.println("Product details saved successfully\n\n");break; //output for successful product capture
            case "2": SearchProduct();break;
            case "3": UpdateProduct();
                System.out.println("Product details has been successfully updated\n\n");break;
            case "4": DeleteProduct();
                System.out.println("Product has been successfully deleted\n\n");break;
            case "5": ViewReport();break;
            case "6": ExitApplication();
                System.out.println("System shutdown");break;
        }
    }
    }

    public void CaptureProduct() {
        boolean close = true;
        
        //while loop to return to main menu after user successfully captures items
        while(close = true){
            System.out.println("\n*************************************");
        System.out.println("CREATE A NEW PRODUCT\n*************************************");
        
        
        SetupDataStructure();
        System.out.println("Enter the product code: ");
        productCode.add(kb.next()); //adding users code to arraylist
        
        System.out.println("Enter the product name: ");
        productName.add(kb.next()); //adding product name to arraylist
        
       int selection;
       do{ System.out.println("Enter the product category\n" 
                + "1 - Desktop computer\n"
                + "2 - Laptop\n"
                + "3 - Tablet\n"
                + "4 - Printer\n"
                + "5 - Gaming console\n");
       
        
       
       //Switch case to take into consideration which category the user selects
       //adding category to arraylist based on which number the user entered
       selection = kb.nextInt();
           switch (selection) {
                case 1:
                    productCategory.add(1);
                    break;
                case 2:
                    productCategory.add(2);
                    break;
                case 3:
                    productCategory.add(3);
                    break;
                case 4:
                    productCategory.add(4);
                    break;
                case 5:
                    productCategory.add(5);
                    break;
                default: //Default case to indicate when user selects a category not listed
                    if(selection > 5){System.out.println("INVALID CATEGORY. PLEASE TRY AGAIN");}
                    break; 
           }
         }while(selection > 5); //Do - While loop to display category selection list again if invalid option is picked
       
            
        System.out.println("Product category >> " + selection );
        
          
        System.out.println("Indicate the product warranty\n"
                + "Enter (1) for 6 months or any other key for 2 years");
        
        //if - else statement to save user's warranty choice to the arraylist
        String warranty;
        warranty = kb.next();
        if(warranty.equals("1")){
            productWarranty.add("6 months");}
        else{
            productWarranty.add("2 years");}
              
        
        System.out.println("Enter the price for " + productName + ": ");
        productPrice.add(kb.nextDouble());//adding user price to arraylist
        
        System.out.println("Enter the stock level for " + productName + ": ");
        productStockLevels.add(kb.nextInt()); //adding stock level to arraylist
        
        System.out.println("Enter the supplier for " + productName +": ");
        productSupplier.add(kb.next()); //adding supplier to arraylist
        
            System.out.println("_______________________________________");
        return;
    } 
       
    }

    public void SearchProduct() {
        
        boolean exit = true;
        
        //while loop to return to main menu after report is displayed
        while(exit = true){
        System.out.println("Please enter a product code to search ");
        productCode.contains(kb.next()); //checking if the array contains the captured code
       
        System.out.println("**************************************");
        System.out.println("PRODUCT SEARCH RESULTS"); //output report with relevant product details
        System.out.println("**************************************");
        System.out.println("Product code: " + productCode);
        System.out.println("Product name: " + productName);
        System.out.println("Product warranty: " + productWarranty);
        System.out.println("Product price: " + productPrice);
        System.out.println("Product stock levels: " + productStockLevels);
        System.out.println("Product supplier: " + productSupplier);
        System.out.println("****************************************\n");
        System.out.println(">>>>>>>>>>END OF SEARCH RESULTS<<<<<<<<<");
        return;
        }
    }

    public void UpdateProduct() {
        
        boolean Y = true;
        String confirm;
        String verify;
        String replace;
        
        System.out.println("Please enter the product code to update: " );
        productCode.contains(kb.next()); //checking if the array contains the captured code
      
        
        System.out.println("Update the warranty? (Y) or (N): " );
        confirm = kb.next();
        
        if(confirm.equals("Y")) // if - else statement for confirmation. "Y" = proceed, "N" = return to main menu
        {System.out.println("CURRENT WARRANTY: " + productWarranty);
        productWarranty.clear(); //clear array if user chooses to update warranty
       
       System.out.println("Indicate the product warranty\n"
                + "Enter (1) for 6 months or any other key for 2 years");
        
       //if - else statement to save user's warranty choice to the arraylist
        String warranty;
        warranty = kb.next();
        if(warranty.equals("1")){
            productWarranty.add("6 months");}
        else{
            productWarranty.add("2 years");}
            System.out.println("Warranty succesfully updated\n");
        }else return;
        
        System.out.println("Update the price? (Y) or (N):");
        verify = kb.next();
        if(verify.equals("Y")) // if - else statement for confirmation. "Y" = proceed, "N" = return to main menu
        {System.out.println("Enter the new price for " + productName);
            Object reset = productPrice.set(0, kb.nextDouble()); //replacing price with new one added by user
            System.out.println("Price successfuly updated\n");
        }else return;
        
        System.out.println("Update the stock level? (Y) or (N):");
        replace = kb.next();
        if(replace.equals("Y")) // if - else statement for confirmation. "Y" = proceed, "N" = return to main menu
        {System.out.println("Enter the new stock level for " + productName);
            Object newStock = productStockLevels.set(0, kb.nextInt()); //replacing stock level with new one added by user
            System.out.println("Stock levels updated");
        }else return;
        
        
    }

    public void DeleteProduct() {
    
        Object remove;
        String confirm;
        
        System.out.println("Please enter the code for the product you wish to delete: ");
        remove = productCode.contains(kb.next()); //Check if arraylist contains value entered by user
        
        System.out.println("Are you sure you want to delete " + productName + "\n Enter (Y) to proceed or (N) to return to the main menu");
        confirm = kb.next(); //Confirm if user wants to clear the arraylists
        
        if(confirm.equals("Y")){
            //clear all arraylists and return true upon completion
        System.out.println(productCode.removeAll(productCode));
        System.out.println(productName.removeAll(productName));
        System.out.println(productWarranty.removeAll(productWarranty));
        System.out.println(productPrice.removeAll(productPrice));
        System.out.println(productStockLevels.removeAll(productStockLevels));
        System.out.println(productSupplier.removeAll(productSupplier));
        }else return;
        
    }

    public void ViewReport() {
        //instance of ReportData class
        ReportData rd = new ReportData();
        
         
        //set methods from ReportData class, with relevent arraylists set
        ReportData.setCategory(productCategory.toString());
        ReportData.setCode(productCode.toString());
        ReportData.setLevels((int) productStockLevels.get(0));
        ReportData.setName(productName.toString());
        ReportData.setPrice((double) productPrice.get(0));
        ReportData.setSupplier(productSupplier.toString());
        ReportData.setTotalPrice((double) Collections.max(productPrice));
        ReportData.setTotalProductCount(productName.size());
        ReportData.setTotalStockLevel((int) ((double) Collections.max(productPrice)/productPrice.size()));
        ReportData.setWarranty(productWarranty.toString());
        
         
         
        boolean exit = true;
         //while loop to return to main menu after report is displayed
         //get methods to return values from the set methods and out their set information
        while(exit = true){
        System.out.println("PRODUCT REPORT");
        System.out.println("============================================");
        System.out.println("Product 1\n" + "-----------------------------------------------");
        System.out.println("PRODUCT CODE >> " + ReportData.getCode());
        System.out.println("PRODUCT NAME >> " + ReportData.getName());
        System.out.println("PRODUCT CATEGORY >> " + ReportData.getCategory());
        System.out.println("PRODUCT WARRANTY >> " + ReportData.getWarranty());
        System.out.println("PRODUCT PRICE >> " + ReportData.getPrice());
        System.out.println("PRODUCT LEVEL >> " + ReportData.getLevels());
        System.out.println("PRODUCT SUPPLIER >> " + ReportData.getSupplier());
        System.out.println("============================================\n");
        System.out.println("TOTAL PRODUCT COUNT >> " + ReportData.getTotalProductCount());
        System.out.println("TOTAL PRODUCT VALUE >> " + ReportData.getTotalPrice());
        System.out.println("AVERAGE PRODUCT VALUE >> " + ReportData.getTotalStockLevel());
        System.out.println("============================================\n");
        System.out.println("------------END OF PRODUCT REPORT------------");
        return;}
    }

    public void ExitApplication() {
        String exit;
        
        System.out.println("Are you sure you wish to exit the application? (Y) or (N)?");
        exit = kb.next(); //Prompt to comfirm is user choose to exit the app. "Y" stops the app. "N" returns to main menu
        
        //if statement to check user input
        if(exit.equals("Y")){
        System.exit(0);
        }
        
    }
}
