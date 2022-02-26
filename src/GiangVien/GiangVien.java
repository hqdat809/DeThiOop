/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiangVien;

/**
 *
 * @author USER
 */
public class GiangVien extends NhanVien{
    private String diachi; 
    private String gioiTinh; 
    private String khoa; 

    public GiangVien() {
    }

    public GiangVien( String diachi, String gioiTinh, String khoa) {
        this.diachi = diachi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public GiangVien( String diachi, String gioiTinh, String khoa, String id, String hoTen) {
        super(id, hoTen);
        this.diachi = diachi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + "," + diachi + "," + gioiTinh + "," + khoa;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    

    

}
