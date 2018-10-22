/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author kyokuto
 */
public class RemarkToVoyage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String u = "0123456X___________________ ___________________X012345678901";
        System.out.println(u.length());
        System.out.println("|"+pickVoyageLeft(u)+"|");
        System.out.println("|"+pickVoyageRight(u)+"|");
        System.out.println("|"+pickShipName(u)+"|");
    }
    
    public static String pickVoyageLeft(String remark){
        return remark.substring(0, 7).trim();
    } 
    
    public static String pickVoyageRight(String remark){
        return remark.substring(48,60).trim();
    }
    
    public static String pickShipName(String remark){
        return remark.substring(7,48).trim();
    }
    
}
