/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

/**
 *
 * @author USER
 */
public class TongHoaDon {
    private String tenKH;
    private String MaSP;
    private String TenSP;
    private int soluong;
    private int DonGia;
    private int TongGia;

    public TongHoaDon() {
    }

    public TongHoaDon(String tenKH, String MaSP, String TenSP, int soluong, int DonGia, int TongGia) {
        this.tenKH = tenKH;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.soluong = soluong;
        this.DonGia = DonGia;
        this.TongGia = TongGia;
    }

    
    

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getTongGia() {
        return TongGia;
    }

    public void setTongGia(int TongGia) {
        this.TongGia = TongGia;
    }



    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    @Override
    public String toString() {
        return "TongHoaDon{" + "tenKH=" + tenKH + ", MaSP=" + MaSP + ", TenSP=" + TenSP + ", soluong=" + soluong + ", DonGia=" + DonGia + ", TongGia=" + TongGia + '}';
    }

    
    
}
