package com.tugas1;

public interface MenghitungRuang {
    default float volume() {
        System.out.println("Ini Volume");
        return 0;
    };

    default float luasPermukaan() {
        System.out.println("Ini Luas Permukaan");
        return 0;
    };
}
