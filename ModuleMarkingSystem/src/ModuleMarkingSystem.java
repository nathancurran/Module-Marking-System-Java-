
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan Curran - B00756824, Gareth McGuinness - B00756712
 */
public class ModuleMarkingSystem {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    //private UserInterface UserInterface = new UserInterface();
    
    public static void main(String[] args) throws IOException {
        
        // create the object called markSystem
    	ModuleMarkingSystem markSystem = new ModuleMarkingSystem() ;
                        
        // instantiate the object UI to access non-static members
        UserInterface UI = new UserInterface();
        
        // instantiate the object File to access non-static members
        FileReaderWriter File = new FileReaderWriter();
        
        // instantiate the object Student to access non-static members
        //Students Student = new Students();
        
        File.openFile();
        
        UI.displayMenu();
        UI.performAction();
        
        
    }
    
}
