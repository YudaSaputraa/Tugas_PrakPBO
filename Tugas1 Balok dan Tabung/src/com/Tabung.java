package com;

public class Tabung extends Lingkaran implements MenghitungRuang {
    float t; // Float Tinggi

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
        return this.kelilingBidang() * (this.r + this.t);
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }

}
