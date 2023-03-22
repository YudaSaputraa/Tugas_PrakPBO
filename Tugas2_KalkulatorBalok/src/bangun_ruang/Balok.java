/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

import bangun_datar.*;

/**
 *
 * @author Yudha
 */
public class Balok extends PersegiPanjang implements HitungRuang {


    private double t;
    double luasPermukaanBalok, volumeBalok;

    public Balok(double t, double p, double l) {
        super(p, l);
        this.t = t;
        luasPermukaan();
        volumeRuang();
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getLuasPermukaanBalok() {
        return luasPermukaanBalok;
    }

    public void setLuasPermukaanBalok(double luasPermukaanBalok) {
        this.luasPermukaanBalok = luasPermukaanBalok;
    }

    public double getVolumeBalok() {
        return volumeBalok;
    }

    public void setVolumeBalok(double volumeBalok) {
        this.volumeBalok = volumeBalok;
    }

    @Override
    public double luasPermukaan() {
        double p = getP();
        double l = getL();
        luasPermukaanBalok = 2.0 * (super.luasPersegiPanjang + p * this.t + l * this.t);
        return luasPermukaanBalok;
    }

    @Override
    public double volumeRuang() {
        volumeBalok = this.t * super.luasPersegiPanjang;
        return volumeBalok;
    }
}
