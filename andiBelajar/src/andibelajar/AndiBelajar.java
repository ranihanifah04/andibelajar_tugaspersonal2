/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andibelajar;

/**
 *
 * @author user Rani Hanifah
 */
import java.util.Scanner;

public class AndiBelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //pendeklarasian variable
        int angka,beda;
        int mat = 1;
        int mat2 = 1;
        char ulang;
        
        
        do {
        System.out.println("Belajar Deret Aritmatika, Geometri, dan Faktorial");
        System.out.print("Masukkan Banyak Angka [2 - 10]: ");
        angka = in.nextInt();
        if(angka >= 2 && angka <=10){
            System.out.print("Masukkan Beda Angka [2 - 9]: ");
            beda = in.nextInt();
            if(beda >=2 && beda <=9) {
            System.out.println("Deret Aritmatika: ");
                for (int i=1; i <= angka; i++) {
                System.out.print(mat + " "); 
                mat += beda;
            }
            System.out.println("");
            System.out.println("Deret Geometri: ");
                for (int i = 1; i <= angka; i++) {
                    System.out.print(mat2 + " ");
                    mat2 *= beda;
            }
            System.out.println("");
            System.out.println("Faktorial Dari " + beda + " adalah : ");
                int fact = angka;
                for (int i = angka; i > 0; i--) {
                    System.out.print(i);
                    if (i>1){
                        System.out.print(" * ");
                    }
                    if (angka != i){
                        fact *= i;
                    }
                }
               System.out.print(" = " + fact);
        }else{
            System.out.println("Banyak Angka Harus Memenuhi Kriteria!");
        }
        }else{
            System.out.println("Beda Angka Harus Memenuhi Kriteria!");
        }
        System.out.println();
         System.out.println("Anda ingin mengulang [y/t] : ");
         ulang = in.next().charAt(0);
         System.out.println();
        }
        while(ulang != 't');
        
        System.out.println("Terima Kasih");
    }
}
   
