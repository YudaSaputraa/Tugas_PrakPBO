package com.tugas1;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private float t; // Float Tinggi

    public Tabung(float r, float t) {
        super(r);
        this.t = t;

    }

    @Override
    public float volume() {
        return (float) (this.luasBidang() * this.t);
    }

    @Override
    public float luasPermukaan() {
        float r = getR();
        float t = getT();
        return this.kelilingBidang() * (r + t);
    }

    public float getT() {
        return this.t;
    }

    public void setT(float t) {
        this.t = t;
    }

}
