/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author Yudha
 */
public interface HitungRuang {

    default double volumeRuang() {
        System.out.println("Volume");
        return 0;
    }

    default double luasPermukaan() {
        System.out.println("Luas Permukaan");
        return 0;

    }

}
