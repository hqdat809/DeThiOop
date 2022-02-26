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
public class Support {

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        boolean accept = false;
        int n = 0;
        do {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    accept = true;
                } else {
                    System.out.println("Yêu cầu số lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Lỗi mời nhập lại");
            }
        } while (!accept);
        return n;
    }
}
