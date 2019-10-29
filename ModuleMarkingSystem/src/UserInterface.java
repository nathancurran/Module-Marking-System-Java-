
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan Curran - B00756824, Gareth McGuinness - B00756712
 */
public class UserInterface {
    private Scanner myScanner;
    private int userInput;
    
    public void displayMenu(){
        // displays a menu for the user
        System.out.println("MENU");
        System.out.println("(1)Display all records.");
        System.out.println("(2)Create a new record.");
        System.out.println("(3)Edit a record.");
        System.out.println("(4)Delete a record.");
        System.out.println("(5)Calculate the total number of students.");
        System.out.println("(6)Calculate the average mark.");
        System.out.println("(7)Get the maximum mark.");
        System.out.println("(8)Get the minimum mark.");
        System.out.println("(9)Exit program.\n");
    }
    
    public void performAction() throws IOException{
        // instantiate the object File to access non-static members
        FileReaderWriter File = new FileReaderWriter();
        
        // instantiate the object Student to access non-static members
        Students Student = new Students();
        
        // prompts for user input
        System.out.print("Please select an option: ");
        myScanner = new Scanner(System.in);
        
        ////////////////add a try for correct input type/////////////
        userInput = myScanner.nextInt();
        
        while (userInput != 9){
            switch (userInput){
                case 1:
                    System.out.println("All student marks are shown below.");
                    File.readFile();
                    break;
                case 2:
                    System.out.println("You have decided to create a new record.");
                    Student.createRecord();
                    break;
                case 3:
                    System.out.println("Which record would you like to edit?");
                    break;
                case 4:
                    System.out.println("Which record would you like to delete?");
                    break;
                case 5:
                    System.out.println("The total number of students is:");
                    break;
                case 6:
                    System.out.println("The average student mark is:");
                    break;
                case 7:
                    System.out.println("The maximum student mark is:");
                    break;
                case 8:
                    System.out.println("The minimum student mark is:");
                    break;
                default: 
                    System.out.println("Invalid selection!");
                    System.out.println("Please select a number between 1 and 9.");
                    break;
            }
            
            // prompts for user input
            System.out.print("Please select an option: ");
            myScanner = new Scanner(System.in);

            ////////////////add a try for correct input type/////////////
            userInput = myScanner.nextInt();
        }
        // program closing message
        System.out.println("Program terminating, Goodbye!");
    }
}
