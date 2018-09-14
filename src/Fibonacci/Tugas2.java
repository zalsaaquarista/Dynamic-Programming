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
public class Tugas2 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        double total;
        
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
        System.out.println("5. E");
        System.out.print("Jenis Barang (1/2/3/4/5): ");
        double barang = baca.nextDouble();
        
        System.out.print("Masukkan berat barang: ");
        double berat = baca.nextDouble();
        
        System.out.println(" ");
        
        if(barang == 1)
        {
            if(berat % 4 == 0)
            {
                total = berat/4*5000;
                System.out.println("Total yang harus dibayar: " + total);
            }
            else
            {
                total = (5000/4)*berat;
                System.out.println("Total yang harus dibayar: " + total);
            }
        }  
        
        else if(barang == 2)
        {
            if(berat % 5 == 0)
            {
                total = berat/5*7000;
                System.out.println("Total yang harus dibayar: " + total);
            }
            else
            {
                total = (7000/5)*berat;
                System.out.println("Total yang harus dibayar: " + total);
            }
        }
        
        else if(barang == 3)
        {
            if(berat % 2 == 0)
            {
                total = berat/2*2000;
                System.out.println("Total yang harus dibayar: " + total);
            }
            else
            {
                total = (2000/2)*berat;
                System.out.println("Total yang harus dibayar: " + total);
            }
        }
    }
}
