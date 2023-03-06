package com.tugas1;

public interface MenghitungBidang {
    default float luasBidang() {
        System.out.println("Ini Luas Bidang");
        return 0;
    };

    default float kelilingBidang() {
        System.out.println("Ini Keliling Bidang");
        return 0;
    };

}
