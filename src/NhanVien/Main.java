/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Main {

    public List<NhanVien> ReadFile() {
        List<NhanVien> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("nhanvien.dat");
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String line = "";
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split("\\$");
                list.add(new NhanVien(txt[0], txt[1], Integer.parseInt(txt[2]), Integer.parseInt(txt[3]), Integer.parseInt(txt[4]), txt[5], txt[6], txt[7]));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        List<NhanVien> list = new ArrayList<>();
        Main m = new Main();
        list = m.ReadFile();
        
        NhanVienForm nvf = new NhanVienForm();
        nvf.setVisible(true);
        nvf.setData(list);
    }
}
