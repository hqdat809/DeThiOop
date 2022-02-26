/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiSinh;

import java.util.Scanner;


/**
 *
 * @author USER
 */
public class ThiSinhKC extends ThiSinh{
    private float DV,DS,DD;

    public ThiSinhKC(float DV, float DS, float DD, String HT, String NS, String DC) {
        super(HT, NS, DC);
        this.DV = DV;
        this.DS = DS;
        this.DD = DD;
    }

    public ThiSinhKC() {
    }

    public float getDV() {
        return DV;
    }

    public void setDV(float DV) {
        this.DV = DV;
    }

    public float getDS() {
        return DS;
    }

    public void setDS(float DS) {
        this.DS = DS;
    }

    public float getDD() {
        return DD;
    }

    public void setDD(float DD) {
        this.DD = DD;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Điểm Văn: ");
        DV = new Scanner(System.in).nextFloat();
        System.out.print("Điểm sử: ");
        DS = new Scanner(System.in).nextFloat();
        System.out.print("Điểm địa: ");
        DD = new Scanner(System.in).nextFloat();//To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public String toString() {
        return super.toString()+"\t|\t Điểm văn: "+DV+"\t|\t Điểm sử: "+DS+"\t|\t Điểm địa: "+DD+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
