/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analyse;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author thomas
 */
public class Analyse {

    /**
     * @param args the command line arguments
     */
    public static void setFlag(String flag) {
        int[] orderArray;
        orderArray = new int[3];
        //GRANT = 0
        //COIN = 1
        //TA = 2

        if ("GRANT".equals(flag)) {
            orderArray[0] = 1;
        } else if ("COIN".equals(flag)) {
            if (orderArray[0] != 0) { // if GRANT exist
                orderArray[1] = 1;
            } else {
                System.out.println("==================================\nERROR: Signaling " + flag + " before GRANT \n==================================");
            }
        } else if ("TEA".equals(flag)) {

            if (orderArray[1] != 0) { // if COIN exist
                orderArray[2] = 1;
            } else {
                System.out.println("================================\nERROR: Signaling " + flag + " before COIN \n================================");
            }
        }
    }

    public void chechOrder() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
    	
    	try {
    		String strLine;
    		
			Scanner scanner = new Scanner(new File("log2.csv"));
			
			while (scanner.hasNext()) {
				strLine = scanner.nextLine();
				
				System.out.println(strLine);
                if (strLine.matches(".*\\bSignaling grant\\b.*")) {
                    //System.out.println(">> GRANT!");
                    setFlag("GRANT");
                } else if (strLine.matches(".*\\bSignaling coin\\b.*")) {
                    //System.out.println(">> COIN!");
                    setFlag("COIN");
                } else if (strLine.matches(".*\\bSignaling tea\\b.*")) {
                    //System.out.println(">> TEA!");
                    setFlag("TEA");
                }
			}
			
			// Close the input stream
			scanner.close();

        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }
}
