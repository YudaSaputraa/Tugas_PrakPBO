package com.tugas1;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private float t; // Float Tinggi

    public Balok(float p, float l, float t) {
        super(p, l);
        this.t = t;
    }

    @Override
    public float volume() {
        return this.t * this.luasBidang();
    }

    @Override
    public float luasPermukaan() {
        float p = getp();
        float t = getT();
        float l = getl();
        return 2 * (this.luasBidang() + p * t + l * t);
    }

    public float getT() {
        return this.t;
    }

    public void setT(float t) {
        this.t = t;
    }

}
