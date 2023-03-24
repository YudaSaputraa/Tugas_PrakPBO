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
public class PegawaiDesigner implements Penilaian{
    private String nama, asalKampus, ipk;
    private int portofolio, prototyping, kreativitas;

    public PegawaiDesigner(String nama, String asalKampus, String ipk, int portofolio, int prototyping, int kreativitas) {
        this.nama = nama;
        this.asalKampus = asalKampus;
        this.ipk = ipk;
        this.portofolio = portofolio;
        this.prototyping = prototyping;
        this.kreativitas = kreativitas;
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

    public int getPortofolio() {
        return portofolio;
    }

    public void setPortofolio(int portofolio) {
        this.portofolio = portofolio;
    }

    public int getPrototyping() {
        return prototyping;
    }

    public void setPrototyping(int prototyping) {
        this.prototyping = prototyping;
    }

    public int getKreativitas() {
        return kreativitas;
    }

    public void setKreativitas(int kreativitas) {
        this.kreativitas = kreativitas;
    }
    
    public int nilaiAkhir(){
        return (this.portofolio + this.prototyping + this.kreativitas) / 3;
    }
}
