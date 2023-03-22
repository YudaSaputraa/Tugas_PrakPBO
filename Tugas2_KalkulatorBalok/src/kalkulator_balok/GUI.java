/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_balok;

import bangun_ruang.Balok;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Yudha
 */
public class GUI extends JFrame implements ActionListener {

    JLabel titleLbl = new JLabel("KALKULATOR BALOK");
    JLabel panjangLbl = new JLabel("Panjang");
    JTextField panjangField = new JTextField(15);
    JLabel lebarLbl = new JLabel("Lebar");
    JTextField lebarField = new JTextField(15);
    JLabel tinggiLbl = new JLabel("Tinggi");
    JTextField tinggiField = new JTextField(15);

    JLabel hasilLbl = new JLabel("Hasil");
    JLabel luasLbl = new JLabel("Luas Persegi Panjang  : ");
    JLabel kelilingLbl = new JLabel("Keliling Persegi panjang : ");
    JLabel luasPermukaanLbl = new JLabel("Luas Permukaan Balok  : ");
    JLabel volumeLbl = new JLabel("Volume Balok  : ");

    JButton hitungButton = new JButton("Hitung");
    JButton resetButton = new JButton("Reset");

    public GUI() {
        setTitle("kalkulator Balok");
        setSize(400, 380);
        setLayout(null);

        add(titleLbl);
        titleLbl.setBounds(130, 10, 150, 20);
        Font fontTitle = new Font("Courier", Font.BOLD, 14);
        titleLbl.setFont(fontTitle);
        Font fTitle = titleLbl.getFont();
        titleLbl.setFont(fTitle.deriveFont(fTitle.getStyle() | Font.BOLD));

        add(panjangLbl);
        panjangLbl.setBounds(40, 50, 150, 20);
        add(panjangField);
        panjangField.setBounds(130, 50, 190, 20);
        add(lebarLbl);
        lebarLbl.setBounds(40, 80, 100, 20);
        add(lebarField);
        lebarField.setBounds(130, 80, 190, 20);
        add(tinggiLbl);
        tinggiLbl.setBounds(40, 110, 100, 20);
        add(tinggiField);
        tinggiField.setBounds(130, 110, 190, 20);

        add(hitungButton);
        hitungButton.setBounds(90, 155, 90, 20);
        hitungButton.addActionListener(this);
        add(resetButton);
        resetButton.setBounds(200, 155, 90, 20);
        resetButton.addActionListener(this);

        add(hasilLbl);
        hasilLbl.setBounds(40, 185, 90, 20);
        Font fontHasil = new Font("Courier", Font.BOLD, 14);
        Font fHasil = titleLbl.getFont();
        hasilLbl.setFont(fHasil.deriveFont(fHasil.getStyle() | Font.BOLD));
        hasilLbl.setFont(fontHasil);
        add(luasLbl);
        luasLbl.setBounds(40, 215, 180, 20);
        add(kelilingLbl);
        kelilingLbl.setBounds(40, 235, 180, 20);
        add(luasPermukaanLbl);
        luasPermukaanLbl.setBounds(40, 255, 180, 20);
        add(volumeLbl);
        volumeLbl.setBounds(40, 275, 180, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int p, l, t;
        if (e.getSource() == hitungButton) {
            if (panjangField.getText().isEmpty() && lebarField.getText().isEmpty() && tinggiField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi semua Field");
            } else if (panjangField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi Field 'Panjang'");
            } else if (lebarField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi Field 'Lebar'");
            } else if (tinggiField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'Tinggi'");
            } else {
                try {
                    p = Integer.parseInt(panjangField.getText());
                    l = Integer.parseInt(lebarField.getText());
                    t = Integer.parseInt(tinggiField.getText());
                    Balok balok = new Balok(t, p, l);
                    balok.setP(p);
                    balok.setT(t);
                    balok.setL(l);
//              System.out.println("p " + p);
//              System.out.println("l " + l);
//              System.out.println("t" + t);

//              System.out.println("Luas Persegi Panjang : " + balok.getLuasPersegiPanjang());
//              System.out.println("Keliling Persegi panjang :" + balok.getKelilingPersegiPanjang());
                    luasLbl.setText("Luas Persegi Panjang : " + balok.getLuasPersegiPanjang());
                    kelilingLbl.setText("Keliling Persegi panjang : " + balok.getKelilingPersegiPanjang());
                    luasPermukaanLbl.setText("Luas Permukaan Balok  : " + balok.getLuasPermukaanBalok());
                    volumeLbl.setText("Volume Balok : " + balok.getVolumeBalok());

                } catch (NumberFormatException error) {
                    String message = error.getMessage();
                    JOptionPane.showMessageDialog(this, "Eror Format Input " + "'" + message.substring(19, message.length() - 1) + "' ;( ");
                }
            }
        } else if (e.getSource() == resetButton) {
            panjangField.setText("");
            lebarField.setText("");
            tinggiField.setText("");
            luasLbl.setText("Luas Persegi Panjang : ");
            kelilingLbl.setText("Keliling Persegi panjang : ");
            luasPermukaanLbl.setText("Luas Permukaan Balok  : ");
            volumeLbl.setText("Volume Balok : ");

        }
    }

}
