/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latukl;

import java.util.ArrayList;

public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Muhammad");
        this.alamat.add("Malang");
        this.telepon.add("08245580089");
        this.saldo.add(100000);
        this.namaClient.add("Radya");
        this.alamat.add("jember");
        this.telepon.add("08234567899");
        this.saldo.add(100000);
        this.namaClient.add("Fulan");
        this.alamat.add("Lombok");
        this.telepon.add("08976543210");
        this.saldo.add(100000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

    public int getJmlClient() {
        return this.saldo.size();

    }

    @Override
    public void setNama(String nama) {

    }

    @Override
    public void setAlamat(String alamat) {

    }

    @Override
    public void setTelepon(String telepon) {

    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }
}
