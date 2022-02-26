/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien;

import java.util.Scanner;

/**
 *
 * @author TrungCH
 */
public class Word {
   private int id;
   private String en;
   private String vn;

    public Word() {
        this.setId();
        this.setEn();
        this.setVn();
    }

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
        
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    public int getId() {
        return id;
    }

    public void setId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Support.inputNumber();
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ tiếng anh: ");
        String en = sc.nextLine();
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ tiếng việt: ");
        String vn = sc.nextLine();
        this.vn = vn;
    }
    
    public static void main(String[] args) {
        new Word();
    }
}
