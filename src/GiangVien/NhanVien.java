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
public class NhanVien {
    private String id;
    private String hoTen;

    public NhanVien() {
    }

    public NhanVien(String id, String hoTen) {
        this.id = id;
        this.hoTen = hoTen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return  id + ", hoTen=" + hoTen;
    }
    
}
