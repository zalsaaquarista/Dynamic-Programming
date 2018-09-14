/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Tugas01 {
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
        
        int b = 0;
        while(uang >= 2000)
        {
            uang = uang - 2000;
            b++;
        }
        System.out.println("Banyak uang 2000: " + b);
        
        int c = 0;
        while(uang >= 1000)
        {
            uang = uang - 1000;
            c++;
        }
        System.out.println("Banyak uang 1000: " + c);
        
        int d = 0;
        while(uang >= 500)
        {
            uang = uang - 500;
            d++;
        }
        System.out.println("Banyak uang 500: " + d);
        
        int e = 0;
        while(uang >= 100)
        {
            uang = uang - 100;
            e++;
        }
        System.out.println("Banyak uang 100: " + e);
}
