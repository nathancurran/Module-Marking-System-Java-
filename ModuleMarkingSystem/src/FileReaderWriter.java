
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

public class FileReaderWriter {
    
    String fileName = "marks.csv";
    String path = System.getProperty("user.dir")+"/"+fileName;
    
    public void openFile(){
        System.out.print("open file worked.");
    }
        
    public void closeFile(){
        
    }
    
    public void writeToFile(String contents) throws IOException{
        File file = new File(path);
        //FileWriter Write = new FileWriter(file);
        
        //Write.append(contents);
        FileWriter fr = null;
        try {
            // Below constructor argument decides whether to append or override
            fr = new FileWriter(file, true);
            fr.write(contents);
            
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
            System.out.println("in" + System.getProperty("user.dir"));
        }
        finally{
            fr.close();
        }
    }
    
    public void readFile() throws IOException {
        System.out.println("read file worked!");
        File file = new File(path);
        
        Scanner scanFile = new Scanner(file);
        
        while (scanFile.hasNext()){
            System.out.println(scanFile.next());  
        }
                  
        
        
        /*FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while ((line = br.readLine()) != null){
            // output the file contents
            System.out.println(line);
        }*/
        
    }    
}