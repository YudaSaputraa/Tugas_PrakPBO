/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author Yudha
 */
public interface HitungBidang {
    default double hitungLuas(){
        System.out.println("Hitung Bidang");
        return 0;
    }
    default double hitungKeliling(){
        System.out.println("Hitung Keliling");
        return 0;
    }
    
}
