//This file was generated from (Academic) UPPAAL 4.1.4 (rev. 4598), October 2010

/*

*/
E<> N5.Leader

/*

*/
E<> N4.Leader

/*

*/
E<> N3.Leader

/*

*/
E<> N2.Leader

/*

*/
E<> N1.Leader

/*

*/
E<> N0.Leader

/*

*/
//NO_QUERY

/*

*/
A[] (time>12 imply N0.Leader)

/*

*/
//NO_QUERY

/*

*/
refinement: (N0 || N1 || N2 || N3 || N4 || N5) <= Spec

/*

*/
refinement: N5 <= P15

/*

*/
refinement: ( P15 || N4 ) <= P14

/*

*/
refinement: ( P14 || N3 ) <= P13

/*

*/
refinement: ( P13 || N2 ) <= P12

/*

*/
refinement: ( P12 || N1 ) <= P11

/*

*/
refinement: ( P11 || N0 ) <= Spec

/*

*/
//NO_QUERY

/*

*/
refinement: N5 <= P25

/*

*/
refinement: ( P25 || N4 ) <= P24

/*

*/
refinement: ( P24 || N3 ) <= P23

/*

*/
refinement: ( P23 || N2 ) <= P22

/*

*/
refinement: ( P22 || N1 ) <= P21

/*

*/
refinement: ( P21 || N0 ) <= SpecTime

/*

*/
//NO_QUERY

/*

*/
//NO_QUERY
