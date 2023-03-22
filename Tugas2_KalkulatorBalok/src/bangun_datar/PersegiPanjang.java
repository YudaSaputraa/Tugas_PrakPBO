/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author Yudha
 */
public class PersegiPanjang implements HitungBidang {
    private double p, l;
    public double luasPersegiPanjang, kelilingPersegiPanjang;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    public void setLuasPersegiPanjang(double luasPersegiPanjang) {
        this.luasPersegiPanjang = luasPersegiPanjang;
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

    public void setKelilingPersegiPanjang(double kelilingPersegiPanjang) {
        this.kelilingPersegiPanjang = kelilingPersegiPanjang;
    }

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
        hitungLuas();
        hitungKeliling();
      
    }
    @Override
    public double hitungLuas(){
        luasPersegiPanjang =  this.p * this.l;
        return luasPersegiPanjang;
    }
    @Override
    public double hitungKeliling(){
        kelilingPersegiPanjang = ((this.p + this.l) * 2);
        return kelilingPersegiPanjang;
    }
}
