package com;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    float t; // Float Tinggi

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
        return 2*(this.luasBidang()+this.p * this.t + this.l *this.t );
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
}
