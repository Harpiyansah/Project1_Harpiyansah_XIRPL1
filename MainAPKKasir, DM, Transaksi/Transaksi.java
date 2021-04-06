/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Transaksi {
 
    private String noTransaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    
    private double biayaService=0;
    
    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja ){
        this.noTransaksi = no_transaksi;
        this.namaPemesan = nm_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;
        
        pesanan = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan){
        this.pesanan.add(pesanan);
    }
    
    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan;
    }
    
    public double hitungTotalBayar() {return 0;}
    
    public double hitungKembalian() {return 0;}
    
    public void cetakStruk() { }

    public double hitungKembalian(double uang_bayar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double hitungTotalPesanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPajak(double PAJAK_PPN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double hitungPajak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBiayaService(double BIAYA_SERVICE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double hitungBiayaService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String hitungTotalBayar(double ppn, double biaya_service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}