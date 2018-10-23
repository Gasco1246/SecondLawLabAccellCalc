/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kinematicssecondlawlab;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;
public class KinematicsSecondLawLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        boolean cont = false;
        double t, d, a, tSqur;
        while(cont == false){
        System.out.println("Time :");
        Scanner keyInput = new Scanner(System.in);
        t = keyInput.nextDouble();
        System.out.println("Displacement : 0.5");
        d = 0.5;
        tSqur = t*t;
        a = d/tSqur*2;
        System.out.println("Accell:"+a);
        }
        
        
        
        
        
    }
    
}
