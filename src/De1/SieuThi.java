/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class SieuThi {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_SanPham = curentDir + separator + separator + "SanPham.csv";
    private static File fileSP = new File(PATH_FILE_CSV_SanPham);
    private static final String PATH_FILE_CSV_KhachHang = curentDir + separator + separator + "KhachHang.csv";
    private static File fileKH = new File(PATH_FILE_CSV_KhachHang);
    private static final String PATH_FILE_CSV_HoaDong = curentDir + separator + separator + "HoaDon.csv";
    private static File fileHD = new File(PATH_FILE_CSV_HoaDong);

    public static void Menu() {
        System.out.println("1. Nhap them san pham.");
        System.out.println("2. Them khach hang.");
        System.out.println("3. Thay doi ten hoac nam sinh khach hang.");
        System.out.println("4. In ra danh sach cac san pham");
        System.out.println("5. Mua hang.");
        System.out.println("6. In thong tin khach hang va tong tien khach hang da mua.");
        System.out.println("7. Thoat.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        List<SanPham> listSP = new ArrayList<>();
        List<KhachHang> listKH = new ArrayList<>();
        List<TongHoaDon> listHD = new ArrayList<>();
        DocGhiF DocGhiFile = new DocGhiF();
        if (fileSP.exists()) {
            try {
                listSP = DocGhiFile.docFileSanPham();
            } catch (CsvValidationException ex) {
                Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (fileKH.exists()) {
            try {
                listKH = DocGhiFile.docFileKhachHang();
            } catch (CsvValidationException ex) {
                Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (fileHD.exists()) {
            try {
                listHD = DocGhiFile.docFileHoaDon();
            } catch (CsvValidationException ex) {
                Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {

            Menu();
            int check = sc.nextInt();

            switch (check) {
                case 1:
                    boolean flag = false;
                    sc.nextLine();
                    System.out.println("Moi nhap ma san pham: ");
                    String MSP = sc.nextLine();
                    System.out.println("Moi nhap so luong: ");
                    int SLg = sc.nextInt();
//                    Khi trung ma san pham (cong them so luong )
                    for (int i = 0; i < listSP.size(); i++) {
                        if (MSP.equals(listSP.get(i).getMaSP())) {
                            System.out.println("success");
                            listSP.get(i).setSoLuong(SLg + listSP.get(i).getSoLuong());
                            if (fileSP.exists()) {
                                fileSP.delete();
                                DocGhiFile.ghiFileSanPham(listSP);
                            } else {
                                DocGhiFile.ghiFileSanPham(listSP);
                            }
                            flag = true;
                        }
                    }
                    if (flag) {
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Moi nhap ten san pham: ");
                    String TSP = sc.nextLine();
                    System.out.println("Moi nhap don gia: ");
                    int DG = sc.nextInt();
                    try {
                        System.out.println("Moi nhap ngay san xuat: ");
                        sc.nextLine();
                        Date NSX = df.parse(sc.nextLine());
                        SanPham sp = new SanPham(MSP, TSP, DG, NSX, SLg);
                        listSP.add(sp);
                        if (fileSP.exists()) {
                            fileSP.delete();
                            DocGhiFile.ghiFileSanPham(listSP);
                        } else {
                            DocGhiFile.ghiFileSanPham(listSP);
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (int i = 0; i < listSP.size(); i++) {
                        System.out.println(listSP.get(i));
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Moi nhap ma khach hang: ");
                    String MKH = sc.nextLine();
                    System.out.println("Moi nhap ten khac hang: ");
                    String TKH = sc.nextLine();
                    System.out.println("Moi nhap nam sinh: ");
                    int NS = sc.nextInt();
                    System.out.println("Moi nhap dia chi: ");
                    sc.nextLine();
                    String DC = sc.nextLine();
                    KhachHang kh = new KhachHang(MKH, TKH, NS, DC);
                    listKH.add(kh);
                    if (fileKH.exists()) {
                        fileKH.delete();
                        DocGhiFile.ghiFileKhachHang(listKH);
                    } else {
                        DocGhiFile.ghiFileKhachHang(listKH);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Moi nhap ma khach hang: ");
                    String checkMKH = sc.nextLine();
                    if (fileKH.exists()) {
                        try {
                            System.out.println(checkMKH);
                            listKH = DocGhiFile.docFileKhachHang();
                        } catch (CsvValidationException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println(listKH.size());
                    for (int j = 0; j < listKH.size(); j++) {
                        System.out.println(listKH.get(j));
                        System.out.println("abc");
                    }
                    for (int i = 0; i < listKH.size(); i++) {
                        if (checkMKH.equals(listKH.get(i).getMaKH())) {
                            System.out.println(checkMKH);
                            System.out.println("1. Sua nam sinh");
                            System.out.println("2. Sua ho ten khach hang");
                            System.out.println("3. Quay tro lai");
                            int check2 = sc.nextInt();
                            switch (check2) {
                                case 1:
                                    System.out.println("Moi nhap lai nam sinh: ");
                                    int newNS = sc.nextInt();
                                    listKH.get(i).setNamSinh(newNS);
                                    if (fileKH.exists()) {
                                        fileKH.delete();
                                        DocGhiFile.ghiFileKhachHang(listKH);
                                    } else {
                                        DocGhiFile.ghiFileKhachHang(listKH);
                                    }
                                    break;
                                case 2:
                                    sc.nextLine();
                                    System.out.println("Moi nhap lai ho ten: ");
                                    String newTKH = sc.nextLine();
                                    listKH.get(i).setTenKH(newTKH);
                                    if (fileKH.exists()) {
                                        fileKH.delete();
                                        DocGhiFile.ghiFileKhachHang(listKH);
                                    } else {
                                        DocGhiFile.ghiFileKhachHang(listKH);
                                    }
                                    break;
                                case 3:
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    if (fileSP.exists()) {
                        try {
                            listSP = DocGhiFile.docFileSanPham();
                        } catch (CsvValidationException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParseException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    for (int i = 0; i < listSP.size(); i++) {
                        System.out.println(listSP.get(i));
                    }
                    break;
                case 5:
                    if (fileHD.exists()) {
                        try {
                            listHD = DocGhiFile.docFileHoaDon();
                        } catch (CsvValidationException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (fileSP.exists()) {
                        try {
                            listSP = DocGhiFile.docFileSanPham();
                        } catch (CsvValidationException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParseException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    sc.nextLine();
                    System.out.println("Nhap ten khach hang mua hang: ");
                    String KH = sc.nextLine();
                    for (int i = 0; i < listSP.size(); i++) {
                        System.out.println(listSP.get(i));
                    }
                    System.out.println("Nhap ma san pham khach hang muon mua");
                    String Msp = sc.nextLine();
                    System.out.println("Nhap so luong khach hang muon mua");
                    int slg = sc.nextInt();
                    for (int i = 0; i < listSP.size(); i++) {
                        if (Msp.equals(listSP.get(i).getMaSP())) {
                            String Tsp = listSP.get(i).getTenSp();
                            int Dg = listSP.get(i).getDonGia();
                            TongHoaDon hd = new TongHoaDon(KH, Msp, Tsp, slg, Dg, Dg*slg);
                            listHD.add(hd);
                            if (fileHD.exists()) {
                                fileHD.delete();
                                DocGhiFile.ghiFileHoaDon(listHD);
                            } else {
                                DocGhiFile.ghiFileHoaDon(listHD);
                            }
                        }
                    }
                    break;
                    
                case 6: 
                    if (fileHD.exists()) {
                        try {
                            listHD = DocGhiFile.docFileHoaDon();
                        } catch (CsvValidationException ex) {
                            Logger.getLogger(SieuThi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    Collections.sort(listHD, new TongHDComparator());
                    for(int i = 0 ; i < listHD.size(); i++) {
                        System.out.println(listHD.get(i));
                    }
                    break;

                case 7:
                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
}
