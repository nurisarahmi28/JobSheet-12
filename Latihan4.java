/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

import java.util.Scanner;

/**
 *
 * @author nuris
 */
public class Latihan4 {
    public static void kecepatan(double a, double b) 
    {
        System.out.println("Kecepatan : " + (a/b) + "km/jam");
    }
    
    public static void main(String[] good) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jarak: ");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan waktu tempuh : ");
        int waktu = input.nextInt();
        
        kecepatan(jarak, waktu);
    }
}
    
       
    

    
        
    

