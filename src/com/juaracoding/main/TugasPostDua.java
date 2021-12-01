package com.juaracoding.main;
import java.util.Scanner;
public class TugasPostDua {
	//TUGAS NOMOR DUA
 public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Masukan jumlah baris");

     int baris = scan.nextInt();

     for (int i = 1; i <= baris; i++)
     {
//         for (int j = baris; j > i; j--)
//         {
//             System.out.print(" ");
//         }
         for (int k = 1; k <= i; k++)
         {
             System.out.print(i + " ");
         }
         System.out.println();
     }
 }
}
