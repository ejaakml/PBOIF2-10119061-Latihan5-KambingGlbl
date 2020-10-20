/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan5.kambingglbl;

/**
 *
 * @author Rheiza
 */
public class PBOIF210119061Latihan5KambingGlbl {
    // Variabel JumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing: "+ jumlahKambing);
             
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBOIF210119061Latihan5KambingGlbl kambingSusu = new PBOIF210119061Latihan5KambingGlbl();
    // Menampilkan jumlah kambiing yang ada saat prgogram x berjalan0
        kambingSusu.getJumlahKambing();
        
     // Menambah satu kambing
     kambingSusu.getJumlahKambing();
     
     // Menampilkan jumlah kambing yang ada
     kambingSusu.getJumlahKambing();
     
    
    }
    
    
}
