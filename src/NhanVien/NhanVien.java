/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author USER
 */
public class NhanVien extends Person{
    private String phongBan;
    private int heSoLuong;
    private int thamNien;
    private int luongCoBan;
    
    public NhanVien() {
    }

    public NhanVien(String phongBan, int heSoLuong, int thamNien, int luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien( String hoTen, String phongBan, int heSoLuong, int thamNien, int luongCoBan, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public float luongThucLinh() {
        return this.luongCoBan * this.heSoLuong * (1 + this.thamNien/100);
    }

    @Override
    public String toString() {
        return super.toString() + phongBan + "," + heSoLuong + "," + thamNien + "," + luongCoBan +","+this.luongThucLinh();
    }
    
}
