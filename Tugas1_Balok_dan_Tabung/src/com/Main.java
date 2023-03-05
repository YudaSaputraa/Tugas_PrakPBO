package com;

import java.util.Scanner;
import com.tugas1.Balok;
import com.tugas1.Tabung;

public class Main {
    public static Scanner inputNilai = new Scanner(System.in);
    public static Scanner inputMenu = new Scanner(System.in);

    public static void main(String[] args) {
        int inputBack;
        do {
            System.out.println("=========================\n");
            System.out.println("\tMENU UTAMA\n");
            System.out.println("=========================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit\n");
            System.out.print("Pilih : ");
            int pilihMenu = inputMenu.nextInt();

            switch (pilihMenu) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    balokMenu();

                    break;
                case 2:
                    tabungMenu();
                    break;

                default:
                    System.out.println("Menu tidak ada, mohon input yang ada ada saja!");
            }
            System.out.println("\n");
            Scanner backHome = new Scanner(System.in);
            System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ");
            inputBack = backHome.nextInt();
        } while (inputBack == 1);
    }

    static void balokMenu() {
        System.out.print("Input Panjang : ");
        int p = inputNilai.nextInt();
        System.out.print("Input Lebar : ");
        int l = inputNilai.nextInt();
        System.out.print("Input Tinggi : ");
        int t = inputNilai.nextInt();

        Balok balok = new Balok(p, l, t);
        System.out.println("\nLuas Persegi Panjang : " + balok.luasBidang());
        System.out.println("Keliling Persegi Panjang : " + balok.kelilingBidang());
        System.out.println("Volume Balok : " + balok.volume());
        System.out.println("Luas Permukaan Balok : " + balok.luasPermukaan());
    }

    static void tabungMenu() {
        System.out.print("Input Tinggi : ");
        int tinggi = inputNilai.nextInt();
        System.out.print("Input Jari - Jari : ");
        int jari2 = inputNilai.nextInt();

        Tabung tabung = new Tabung(jari2, tinggi);
        System.out.println("Luas Lingkaran : " + tabung.luasBidang());
        System.out.println("Keliling Lingkaran : " + tabung.kelilingBidang());
        System.out.println("Volume Tabung : " + tabung.volume());
        System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());
    }
}