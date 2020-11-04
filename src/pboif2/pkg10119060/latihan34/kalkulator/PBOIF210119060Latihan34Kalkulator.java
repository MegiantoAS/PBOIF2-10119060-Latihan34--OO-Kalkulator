/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan34.kalkulator;
import java.util.Scanner;
import kalkulator.kalkulator;
/**
 *
@author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program kalkulator
 */
public class PBOIF210119060Latihan34Kalkulator {

    public static void main(String[] args) {
        // TODO code application logic here
        kalkulator kal = new kalkulator();
        
       Scanner input = new Scanner(System.in);
        
        System.out.println("======Aplikasi Klkulator Bilangan====");
        System.out.print("Masukan Angka ke-1 : ");
        kal.value1 = input.nextDouble();
        
        System.out.print("Masukan Angka ke-2 : ");
        kal.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil pertambahan : " + kal.tambahBilangan());
        System.out.println("Hasil pengurangan : " + kal.kurangBilangan());
        System.out.println("Hasil perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil pembagian : " + kal.bagiBilangan());
        System.out.println("Hasil sisa : " + kal.sisaBilangan());
    } 
}
