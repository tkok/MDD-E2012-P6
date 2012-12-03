
package dk.itu.ecdar.text.generator;
import dk.itu.ecdar.text.generator.framework.IController;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Controller extends IController {

	public Controller() {
         super(new ITIOA[]{
				new Machine(),
				new University2(),
				new Spec(),
				new University(),
				new MachineImpl(),
				new MachineRef(),
				new ResearcherImpl(),
				new Researcher()
                 });
         IController.controllerInstance = this;
     }
   
    // Define tasks for every spec->location
     
				
	public static void MachineServing() {
        
        // define task here
   
    }
    
				
	public static void University2id2() {
        
        // define task here
   
    }
	public static void University2Inconsistent() {
        
        // define task here
   
    }
	public static void University2id4() {
        
        // define task here
   
    }
	public static void University2Universal() {
        
        // define task here
   
    }
	public static void University2id6() {
        
        // define task here
   
    }
    
				
	public static void SpecEnd() {
        
        // define task here
   
    }
	public static void SpecGrant() {
        
        // define task here
   
    }
    
				
	public static void UniversityD() {
        
        // define task here
   
    }
	public static void UniversityC() {
        
        // define task here
   
    }
	public static void UniversityB() {
        
        // define task here
   
    }
    
				
	public static void MachineImplServing() {
        
        // define task here
   
    }
    
				
	public static void MachineRefServing() {
        
        // define task here
   
    }
    
				
	public static void ResearcherImpllu() {
        
        // define task here
   
    }
	public static void ResearcherImplid21() {
        
        // define task here
   
    }
	public static void ResearcherImplid22() {
        
        // define task here
   
    }
    
				
	public static void ResearcherUNIV() {
        
        // define task here
   
    }
	public static void ResearcherT() {
        
        // define task here
   
    }
	public static void ResearcherC() {
        
        // define task here
   
    }
    

}

