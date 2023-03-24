/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian_class;

/**
 *
 * @author Lab Informatika
 */
public class PegawaiProgrammer implements Penilaian {

    private String nama, asalKampus, ipk;
    private int knowladge, cleanCode, debugging;

    public PegawaiProgrammer(String nama, String asalKampus, String ipk, int knowladge, int cleanCode, int debugging) {
        this.nama = nama;
        this.asalKampus = asalKampus;
        this.ipk = ipk;
        this.knowladge = knowladge;
        this.cleanCode = cleanCode;
        this.debugging = debugging;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsalKampus() {
        return asalKampus;
    }

    public void setAsalKampus(String asalKampus) {
        this.asalKampus = asalKampus;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    public int getKnowladge() {
        return knowladge;
    }

    public void setKnowladge(int knowladge) {
        this.knowladge = knowladge;
    }

    public int getCleanCode() {
        return cleanCode;
    }

    public void setCleanCode(int cleanCode) {
        this.cleanCode = cleanCode;
    }

    public int getDebugging() {
        return debugging;
    }

    public void setDebugging(int debugging) {
        this.debugging = debugging;
    }

    @Override
    public int nilaiAkhir() {
        return (this.knowladge + this.cleanCode + this.debugging) / 3;
    }

}
