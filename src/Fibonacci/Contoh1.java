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
public class Contoh1 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas: " + identitas);
       
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke: ");
        int n  = scanner.nextInt();
        
        return n;
    }
    
    
    
}
