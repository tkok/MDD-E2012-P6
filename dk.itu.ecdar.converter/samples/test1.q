//This file was generated from (Academic) UPPAAL 4.1.4 (rev. 4598), October 2010

/*

*/
consistency: ESM_SysReq

/*

*/
consistency: RedButton

/*

*/
consistency: EmergencySwitch0

/*

*/
consistency: EmergencySwitch1

/*

*/
consistency: ResetButton

/*

*/
consistency: ResetSwitch

/*

*/
consistency: CAN_bus

/*

*/
consistency: FinalElement0

/*

*/
consistency: FinalElement1

/*

*/
consistency: CoreSystem

/*

*/
consistency: NCInput

/*

*/
refinement: (CoreSystem || EmergencySwitch0 || FinalElement0) <= ESM_SysReq 

/*

*/
//NO_QUERY
