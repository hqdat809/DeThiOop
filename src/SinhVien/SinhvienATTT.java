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
public class SinhvienATTT extends Sinhvien{
    private int hocPhi;

    public SinhvienATTT() {
    }

    public SinhvienATTT(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhvienATTT(int hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() +","+ hocPhi ;
    }
    
}
