/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Pola
 */
package Praktikum12032026;

/**
 *
 * @author Echa2
 */
import java.util.Scanner;
public class Pola {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, j, d, k;
        System.out.print("Masukan Angka Pertama = ");
        d = input.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        k = input.nextInt();
        for(i=1; i<=d; i++)
        {
            for(j=1; j<=k; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();           
        }
    } 
}
   
