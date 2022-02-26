/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author USER
 */
public class SinhvienMatMa extends Sinhvien{
    private String donVi;
    private int luong;

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String donVi, int luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhvienMatMa(String donVi, int luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() +","+ donVi + "," + luong;
    }
    
}
