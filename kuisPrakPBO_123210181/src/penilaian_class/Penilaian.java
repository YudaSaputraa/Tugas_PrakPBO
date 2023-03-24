/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian_class;

/**
 *
 * @author Lab Informatika
 */
public interface Penilaian {
    default int nilaiAkhir(){
        System.out.println("Ini nilai Akhir");
        return 0;
    }
    
}
