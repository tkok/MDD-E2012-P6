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
//NO_QUERY

/*

*/
refinement: ( ( (G25 || A25a) \ A25b)  || N4 ) <= ((G24 || A24a) \ A24b)

/*

*/
refinement: N5 <= ( (G25 || A25a) \ A25b) 

/*

*/
//NO_QUERY

/*

*/
consistency: A15a

/*

*/
refinement:  ((G25 || A25a) \ A25b) <= P25

/*

*/
refinement: P25 <= ((G25 || A25a) \ A25b)

/*

*/
refinement: P14 <= ((G14 || A14a) \ A14b)

/*

*/
refinement: ((G14 || A14a) \ A14b) <= P14

/*

*/
refinement: N5 <= (( (G15 ||G25)|| (A15a || A25a)) \ (A15b || A25b)) 

/*

*/
refinement: N5 <= ( (G15 || A15a) \ A15b) 

/*

*/
consistency: G11

/*

*/
refinement: ( ( (G11 || A11a) \ A11b) || N0 ) <= Spec

/*

*/
refinement: ( ( (G15 || A15a) \ A15b)  || N4 ) <= ((G14 || A14a) \ A14b)

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
refinement:  P21 <= ( (G21|| A21a) \ A21b)

/*

*/
refinement:  ( (G21|| A21a) \ A21b)   <= P21

/*

*/
refinement: ( ( (G21|| A21a) \ A21b)  || N0 ) <= SpecTime

/*

*/
refinement: ( P21 || N0 ) <= SpecTime

/*

*/
//NO_QUERY

/*

*/
//NO_QUERY
