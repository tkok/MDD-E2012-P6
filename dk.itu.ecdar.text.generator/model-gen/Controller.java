
pakage dk.itu.ecdar.text.generator.generated;
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
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@52380405 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2a799171 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineServing() {
        
        // define task here
   
    }
	public static void MachineIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@145d727a (urgent: false, universal: false, name: id2), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1f99ab1c (urgent: true, universal: false, name: Inconsistent), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5dfe8636 (urgent: false, universal: false, name: id4), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@318a9216 (urgent: false, universal: false, name: Universal), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@424c4002 (urgent: false, universal: false, name: id6), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6080e4c6 (urgent: false, universal: false, name: id7)]
				
	public static void University2Id2() {
        
        // define task here
   
    }
	public static void University2Inconsistent() {
        
        // define task here
   
    }
	public static void University2Id4() {
        
        // define task here
   
    }
	public static void University2Universal() {
        
        // define task here
   
    }
	public static void University2Id6() {
        
        // define task here
   
    }
	public static void University2Id7() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5a04648b (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5757ab5a (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@71c88986 (urgent: false, universal: false, name: Start)]
				
	public static void SpecEnd() {
        
        // define task here
   
    }
	public static void SpecGrant() {
        
        // define task here
   
    }
	public static void SpecStart() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@f498153 (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3c117898 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@16132507 (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4ecf57a2 (urgent: false, universal: false, name: A)]
				
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
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1cfc547 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@744decf5 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineImplServing() {
        
        // define task here
   
    }
	public static void MachineImplIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@8c68c8b (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@11f05dde (urgent: false, universal: false, name: Idle)]
				
	public static void MachineRefServing() {
        
        // define task here
   
    }
	public static void MachineRefIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2da017b6 (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@16457b0c (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4107e577 (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@425e79fc (urgent: false, universal: false, name: Idle)]
				
	public static void ResearcherImplLu() {
        
        // define task here
   
    }
	public static void ResearcherImplId21() {
        
        // define task here
   
    }
	public static void ResearcherImplId22() {
        
        // define task here
   
    }
	public static void ResearcherImplIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@600d676b (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6505ef (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@326fda17 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@67d8015 (urgent: false, universal: false, name: Idle)]
				
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

