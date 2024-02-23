/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latukl;

import java.util.ArrayList;

public class JenisLaundry {

    String namaToko = "Laundry pak ANGGA ";
    String slogan = "   yes yes yes";

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(5000);
        this.durasi.add(20);
        this.jenisLaundry.add("Cuci Lipat");
        this.harga.add(10000);
        this.durasi.add(30);
        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(10000);
        this.durasi.add(30);
    }

    public int getJmlLaundry() {
        return this.jenisLaundry.size();
    }

    public void setNamaLaundry(String namaBarang) {
        this.jenisLaundry.add(namaBarang);
    }

    public String getNamaLaundry(int idLaundry) {
        return this.jenisLaundry.get(idLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idLaundry) {
        return this.harga.get(idLaundry);
    }

    public void editHarga(int idLaundry, int harga) {
        this.harga.set(idLaundry, harga);
    }

    public void setDurasi(int Durasi) {
        this.durasi.add(Durasi);
    }

    public int getDurasi(int idLaundry) {
        return this.durasi.get(idLaundry);
    }
}
