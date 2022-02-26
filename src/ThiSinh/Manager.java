/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiSinh;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Manager {

    static List<ThiSinh> list = new ArrayList<>();

    static public void menu() {
        System.out.println("1. Nhập thông tin thí sinh");
        System.out.println("2. In danh sách sinh viên trúng tuyển");
        System.out.println("3. Thoát");
        System.out.print("Chọn: ");
    }

    static public boolean Check(float a, float b, float c) {
        if (a + b + c > 20) {
            return true;
        } else {
            return false;
        }
    }

    static public void Nhap_DS() {
        System.out.print("Nhập vào số thí sinh: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Chọn khối thí sinh nhập thông tin: ");
            System.out.println("1. Khối A");
            System.out.println("2. Khối C");
            System.out.print("Chọn: ");
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    ThiSinh tska = new ThiSinhKA();
                    tska.Nhap();
                    list.add(tska);
                    break;
                case 2:
                    ThiSinh tskc = new ThiSinhKC();
                    tskc.Nhap();
                    list.add(tskc);
                    break;
            }
        }
    }

    static public void Show() {
        if (!list.isEmpty()) {
            System.out.println("Thí sinh trúng tuyển khối A là:");
            for (ThiSinh item : list) {
                if (item instanceof ThiSinhKA) {
                    ThiSinhKA ts = (ThiSinhKA) item;
                    if (Check(ts.getDT(), ts.getDH(), ts.getDL())) {
                        System.out.println(ts.toString());
                    }
                }
                if (item instanceof ThiSinhKC) {
                    ThiSinhKC ts = (ThiSinhKC) item;
                    if (Check(ts.getDD(), ts.getDS(), ts.getDV())) {
                        System.out.println(ts.toString());
                    }
                }
                
            }
        }
        
        System.out.println("");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    Nhap_DS();
                    break;
                case 2:
                    Show();
                    break;
                case 3:
                    exit(0);

            }
        }
    }
}
