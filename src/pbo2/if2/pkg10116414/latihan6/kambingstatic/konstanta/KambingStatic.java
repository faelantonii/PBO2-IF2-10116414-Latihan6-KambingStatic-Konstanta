/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.if2.pkg10116414.latihan6.kambingstatic.konstanta;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * Deskripsi    : Program Memasukkan Jumlah Kambing Static
 */
public class KambingStatic {
public static int jumlahKambing;

   //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
   
    public static void main(String[] args) {
        KambingStatic.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                          + KambingStatic.jumlahKambing);
    }
    
}
