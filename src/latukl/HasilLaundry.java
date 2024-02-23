/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latukl;

/**
 *
 * @author radya
 */
public class HasilLaundry {

    public static void main(String[] args) {

        Client c = new Client();
        Petugas p = new Petugas();
        JenisLaundry j = new JenisLaundry();
        Transaksi t = new Transaksi();
        Laporan l = new Laporan();
        l.NamaToko();
        l.laporan(j);
        l.laporan(c);
        t.prosesTransaksi(c, t, j);
        l.laporan(j);
        l.laporan(c);

    }
}
