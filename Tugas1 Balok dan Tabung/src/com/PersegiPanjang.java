package com;

public class PersegiPanjang implements MenghitungBidang {
    float p, l; // Panjang, Lebar

    public PersegiPanjang(float p, float l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public float luasBidang() {
        return this.p * this.l;
    }

    @Override
    public float kelilingBidang() {
        return ((this.p + this.l) * 2);
    }

    public float getp() {
        return p;
    }

    public void setp(float panjang) {
        this.p = panjang;
    }

    public float getl() {
        return l;
    }

    public void setl(float l) {
        this.l = l;
    }

}
