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
public class KhachHang {
    private String TenKH;
    private String MaKH;
    private int NamSinh;
    private String DiaChi;

    public KhachHang() {
    }

    public KhachHang( String MaKH,String TenKH, int NamSinh, String DiaChi) {
        this.TenKH = TenKH;
        this.MaKH = MaKH;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "TenKH=" + TenKH + ", MaKH=" + MaKH + ", NamSinh=" + NamSinh + ", DiaChi=" + DiaChi + '}';
    }
    
    
}
