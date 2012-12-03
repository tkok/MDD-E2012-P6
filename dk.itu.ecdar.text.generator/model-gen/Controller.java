
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
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@56809629 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4506eae8 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineServing() {
        
        // define task here
   
    }
	public static void MachineIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@35d2165f (urgent: false, universal: false, name: id2), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2a8b5b48 (urgent: true, universal: false, name: Inconsistent), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@73a7dec4 (urgent: false, universal: false, name: id4), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4473f04f (urgent: false, universal: false, name: Universal), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3c9f91aa (urgent: false, universal: false, name: id6), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7e21a6cc (urgent: false, universal: false, name: id7)]
				
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
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@796c1a02 (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@863c657 (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5d431617 (urgent: false, universal: false, name: Start)]
				
	public static void SpecEnd() {
        
        // define task here
   
    }
	public static void SpecGrant() {
        
        // define task here
   
    }
	public static void SpecStart() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@9b962c9 (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7e4d38a7 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5d46a6af (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1bfe654f (urgent: false, universal: false, name: A)]
				
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
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3fd66596 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@a637589 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineImplServing() {
        
        // define task here
   
    }
	public static void MachineImplIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@19e43b5e (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1ecc5427 (urgent: false, universal: false, name: Idle)]
				
	public static void MachineRefServing() {
        
        // define task here
   
    }
	public static void MachineRefIdle() {
        
        // define task here
   
    }
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2c5f87e4 (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@740476b6 (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6806188d (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@e7e29d7 (urgent: false, universal: false, name: Idle)]
				
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
    
				
				//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4229cbc3 (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@8ee71d8 (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@531cc7a1 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4fa983e (urgent: false, universal: false, name: Idle)]
				
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

