/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding 
 * mencari nilai terbesar dan terkecil.
 */
public class PBO210117070Latihan23NilaiTerbesardanterkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        double jml;
        int[] nilai= new int [20];
        int nimax;
        int nimin;
        
        
        
        System.out.println("======Program Nilai Terbesar Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner nm = new Scanner(System.in);
        nama = nm.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner jl = new Scanner(System.in);
        jml = jl.nextInt();
        
        nimax = 0;
        nimin = 100;
        for (int i=0; i< jml; i++){
            
                System.out.print("Nilai Mahasiswa Ke-"+(i+1)+": ");
                Scanner ht = new Scanner(System.in);
                nilai[i] = ht.nextInt();
                
                if (nimax <= nilai[i]){
                nimax = nilai[i];
                }
                if (nimin > nilai[i]){   
                    nimin = nilai[i];
                }
                    
                     
             }
        for (int i=0; i< jml; i++){
            System.out.println("Hasil nilai mahasiswa ke-"+(i+1)+" :"+nilai[i]);
        }
        System.out.println("Nilai Terbesar adalahh : "+ nimax);
        System.out.println("Nilai Terkecil adalahh : "+ nimin);
        System.out.println("Petugas : "+ nama);
        
               
}
}
