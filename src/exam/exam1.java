/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            System.out.println("Nhap input: ");
            Date dt = df.parse(sc.nextLine());
            System.out.println("Output: "+df.format(dt));
        } catch (ParseException ex) {
            Logger.getLogger(exam1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
