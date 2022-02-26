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
public class ThiSinhKA extends ThiSinh{
    private float DT,DH,DL;

    public ThiSinhKA() {
    }

    public ThiSinhKA(float DT, float DH, float DL, String HT, String NS, String DC) {
        super(HT, NS, DC);
        this.DT = DT;
        this.DH = DH;
        this.DL = DL;
    }

    public float getDT() {
        return DT;
    }

    public void setDT(float DT) {
        this.DT = DT;
    }

    public float getDH() {
        return DH;
    }

    public void setDH(float DH) {
        this.DH = DH;
    }

    public float getDL() {
        return DL;
    }

    public void setDL(float DL) {
        this.DL = DL;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        
        System.out.print("Điểm toán: ");
        DT = new Scanner(System.in).nextFloat();
        System.out.print("Điểm hoá: ");
        DH = new Scanner(System.in).nextFloat();
        System.out.print("Điểm lý: ");
        DL = new Scanner(System.in).nextFloat();
    }

    
    @Override
    public String toString() {
        return super.toString()+"\t|\t Điểm toán: "+DT+"\t|\t Điểm hoá: "+DH+"\t|\t Điểm lý: "+DL+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
