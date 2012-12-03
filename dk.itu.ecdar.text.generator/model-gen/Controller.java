
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
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@14028a1d (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@492848bf (urgent: false, universal: false, name: Idle)]
				
	public static void MachineServing() {
        
        // define task here
   
    }
	public static void MachineIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@73bad293 (urgent: false, universal: false, name: id2), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2315e9ca (urgent: true, universal: false, name: Inconsistent), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1212512e (urgent: false, universal: false, name: id4), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@17a5f5a5 (urgent: false, universal: false, name: Universal), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@10144efe (urgent: false, universal: false, name: id6), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@534ddbc5 (urgent: false, universal: false, name: id7)]
				
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
	public static void University2id7() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@281fb795 (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4e727e0e (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5f5f6fd6 (urgent: false, universal: false, name: Start)]
				
	public static void SpecEnd() {
        
        // define task here
   
    }
	public static void SpecGrant() {
        
        // define task here
   
    }
	public static void SpecStart() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6a047f1b (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7fc29cb8 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@49695b00 (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5aad33e4 (urgent: false, universal: false, name: A)]
				
	public static void UniversityD() {
        
        // define task here
   
    }
	public static void UniversityC() {
        
        // define task here
   
    }
	public static void UniversityB() {
        
        // define task here
   
    }
	public static void UniversityA() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@14a77b98 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7b97ab3 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineImplServing() {
        
        // define task here
   
    }
	public static void MachineImplIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@56f5a599 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@78a8dc3c (urgent: false, universal: false, name: Idle)]
				
	public static void MachineRefServing() {
        
        // define task here
   
    }
	public static void MachineRefIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@33d2a07e (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@510de23b (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@68360655 (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7cece9af (urgent: false, universal: false, name: Idle)]
				
	public static void ResearcherImpllu() {
        
        // define task here
   
    }
	public static void ResearcherImplid21() {
        
        // define task here
   
    }
	public static void ResearcherImplid22() {
        
        // define task here
   
    }
	public static void ResearcherImplIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@46009124 (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5e74207c (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@67645a8 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@602110ff (urgent: false, universal: false, name: Idle)]
				
	public static void ResearcherUNIV() {
        
        // define task here
   
    }
	public static void ResearcherT() {
        
        // define task here
   
    }
	public static void ResearcherC() {
        
        // define task here
   
    }
	public static void ResearcherIdle() {
        
        // define task here
   
    }
    

}

