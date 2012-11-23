/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analyse;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
        
        if("GRANT".equals(flag)) {
            orderArray[0] = 1;
        }
        else if("COIN".equals(flag)) {
            if(orderArray[0] != 0) { // if GRANT exist
                orderArray[1] = 1;
            }
            else {
                System.out.println("==================================\nERROR: Signaling " + flag + " before GRANT \n==================================");
            }
        }
        else if("TEA".equals(flag)) {
            
            if(orderArray[1] != 0) { // if COIN exist
                orderArray[2] = 1;
            }
            else {
                System.out.println("================================\nERROR: Signaling " + flag + " before COIN \n================================");
            }
        }
    }
    public void chechOrder() {
        
    }
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            // Open file to FileInputStram
            FileInputStream fstream = new FileInputStream("log1.csv");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line

            for (int i = 0; i < br.readLine().length(); i++) {
                if(br.readLine() != null) {
                    strLine = br.readLine();
                    System.out.println(strLine);
                    if(strLine.matches(".*\\bSignaling grant\\b.*")) {
                        //System.out.println(">> GRANT!");
                        setFlag("GRANT");
                    }
                    else if(strLine.matches(".*\\bcoin\\b.*")) {
                        //System.out.println(">> COIN!");
                        setFlag("COIN");
                    }
                    else if(strLine.matches(".*\\bSignaling tea\\b.*")) {
                        //System.out.println(">> TEA!");
                        setFlag("TEA");
                    }
                    
                }
            }


            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }
}
