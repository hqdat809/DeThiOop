/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author USER
 */
public class SanPham {
    private String MaSP;
    private String TenSp;
    private int DonGia;
    private Date NSX;
    private int SoLuong;
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSp, int DonGia, Date NSX, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSp = TenSp;
        this.DonGia = DonGia;
        this.NSX = NSX;
        this.SoLuong = SoLuong;
    }

    

    public String getMaSP() {
        return MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSp=" + TenSp + ", DonGia=" + DonGia + ", NSX=" + df.format(NSX) + ", SoLuong=" + SoLuong + '}';
    }
}
