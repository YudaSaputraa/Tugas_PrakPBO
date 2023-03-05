package com.tugas1;

public class Lingkaran implements MenghitungBidang {
   private float r; // jari jari

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luasBidang() {
        return (float) (Math.PI * this.r * this.r);

    }

    @Override
    public float kelilingBidang() {
        return (float) (2 * Math.PI * this.r);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

}
