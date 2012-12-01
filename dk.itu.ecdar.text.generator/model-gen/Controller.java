
package dk.itu.ecdar.text.generator;
import dk.itu.ecdar.text.generator.framework.IController;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Controller extends IController {

	public Controller() {
         super(new ITIOA[]{
         	
         		 //Insert new + specnames() here
                 
                 });
         IController.controllerInstance = this;
     }
     
    // Define tasks for every spec->location
     
    public static void classnameLocationname() {
        
        System.out.print("testing task");
    
    }
     
     
}


