/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kyokuto
 */
public class ValueOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a = null;
       
       System.out.println(Integer.parseInt(a));
       String b = "1";
       System.out.println(Integer.valueOf(b));
    }
    
}
