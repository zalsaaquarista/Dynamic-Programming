/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        int uang = baca.nextInt();
        int[] data = new int[] {100, 500, 1000, 2000, 5000};
        
        int a = 0;
        while(uang >= 5000)
        {
            uang = uang - 5000;
            a++;
        }
        System.out.println("Banyak uang 5000: " + a);
        
    
    }
}
