
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
public class Students {
    
    private Scanner myScanner;
    private String newRecord;
    
    
    public void createRecord() throws IOException{
        
        double newStuMark;
        int mark;
        
        myScanner = new Scanner(System.in);
        
        ///////////////add verification starting B00/////////////////
        System.out.println("Please enter the new student number: ");
        
        ////////////////add a try for correct input type/////////////
        String newStuNum = myScanner.nextLine();
                
        ///////////////add verification between 0-100/////////////////
        System.out.println("Please enter the corresponding mark for " + 
                newStuNum + ":");
        
        ////////////////add a try for correct input type/////////////
        newStuMark = myScanner.nextDouble();
        
        // a new string is creted in the correct format
        newRecord = newStuNum + "," + Math.round(newStuMark) + "\n";    // mark is rounded to the nearest int
        System.out.println("New record has been created: " + newRecord);    // confirmation message
        
        //return newRecord;
        FileReaderWriter File = new FileReaderWriter();
        File.writeToFile(newRecord);
    }
}
