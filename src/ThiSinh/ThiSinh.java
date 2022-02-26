/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiSinh;

/**
 *
 * @author USER
 */
import java.util.Scanner;

/**
 *
 * @author winan
 */
public class ThiSinh {
    private String HT,NS,DC;

    public ThiSinh() {
    }

    public ThiSinh(String HT, String NS, String DC) {
        this.HT = HT;
        this.NS = NS;
        this.DC = DC;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public  void Nhap(){
        System.out.println("Nhập thông tin: ");
        System.out.print("Họ tên: ");
        HT = new Scanner(System.in).nextLine();
        System.out.print("Địa chỉ: ");
        DC = new Scanner(System.in).nextLine();
        System.out.print("Ngày sinh: ");
        NS = new Scanner(System.in).nextLine();
    }
    
    @Override
    public String toString() {
        return "HT: " + HT + "\t|\t NS: " + NS + "\t|\t DC: " + DC ;
    }
}