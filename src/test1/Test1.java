/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.util.Scanner;

/**
 * test backend sitama no 1 
 * @author vckev
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(loopingMultiplier10(input));
    }
    
    /**
     * Melakukan perkalian angka dari angka 1 hingga 10
     * @param n Integer : angka integer yang ingin dilakukan perkalian dari angka 1 hingga 10
     * @return result String : penjabaran dari perkalian angka yang dilakukan operasi perkalian
     */
    public static String loopingMultiplier10(int n) {
        String res = "";
        for(int i = 1; i <= 10; i++) {
            res+= n+" x "+i+" = "+(n*i)+"\n";
        }
        return res;
    }
    
}
