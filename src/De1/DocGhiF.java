/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DocGhiF {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_KhachHang = curentDir + separator + separator + "KhachHang.csv";
    private static final String PATH_FILE_CSV_SanPham = curentDir + separator + separator + "SanPham.csv";    
    private static final String PATH_FILE_CSV_HoaDon = curentDir + separator + separator + "HoaDon.csv";


    public void ghiFileKhachHang(List<KhachHang> listKhachHang) {
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV_KhachHang);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV_KhachHang, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ma KH", "Ho Ten", "Nam Sinh", "Dia Chi"};
                csvWrite.writeNext(header);
                for (KhachHang item : listKhachHang) {
                    csvWrite.writeNext(new String[]{item.getMaKH(), item.getTenKH(), String.valueOf(item.getNamSinh()), item.getDiaChi()});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV_KhachHang, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (KhachHang item : listKhachHang) {
                    csvWrite.writeNext(new String[]{item.getMaKH(), item.getTenKH(), String.valueOf(item.getNamSinh()), item.getDiaChi()});
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiF.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    public void ghiFileHoaDon(List<TongHoaDon> listHoaDon) {
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV_HoaDon);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV_HoaDon, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ten KH", "Ma SP", "Ten SP", "So luong", "Don Gia", "Tong Gia"};
                csvWrite.writeNext(header);
                for (TongHoaDon item : listHoaDon) {
                    csvWrite.writeNext(new String[]{item.getTenKH(), item.getMaSP(),item.getTenSP(), String.valueOf(item.getSoluong()), String.valueOf(item.getDonGia()), String.valueOf(item.getTongGia() )});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV_KhachHang, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (TongHoaDon item : listHoaDon) {
                    csvWrite.writeNext(new String[]{item.getTenKH(), item.getMaSP(),item.getTenSP(), String.valueOf(item.getSoluong()), String.valueOf(item.getDonGia()), String.valueOf(item.getTongGia() )});
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiF.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void ghiFileSanPham(List<SanPham> listSanPham) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV_SanPham);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV_SanPham, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ma SP", "Ten SP", "Don Gia", "NSX", "So Luong"};
                csvWrite.writeNext(header);
                for (SanPham item : listSanPham) {
                    csvWrite.writeNext(new String[]{item.getMaSP(), item.getTenSp(), String.valueOf(item.getDonGia()), df.format(item.getNSX()), String.valueOf(item.getSoLuong())});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV_SanPham, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (SanPham item : listSanPham) {
                    csvWrite.writeNext(new String[]{item.getMaSP(), item.getTenSp(), String.valueOf(item.getDonGia()), df.format(item.getNSX()), String.valueOf(item.getSoLuong())});
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiF.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public List<KhachHang> docFileKhachHang() throws CsvValidationException {
        FileReader fr = null;
        List<KhachHang> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV_KhachHang);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                KhachHang kh = new KhachHang(line[0], line[1], Integer.parseInt(line[2]), line[3]);
                list.add(kh);
            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhiF.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return list;
    }
    
    public List<TongHoaDon> docFileHoaDon() throws CsvValidationException {
        FileReader fr = null;
        List<TongHoaDon> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV_HoaDon);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                TongHoaDon hd = new TongHoaDon(line[0], line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]));
                list.add(hd);
            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhiF.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return list;
    }

    public List<SanPham> docFileSanPham() throws CsvValidationException, ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        FileReader fr = null;
        List<SanPham> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV_SanPham);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                SanPham sp = new SanPham(line[0], line[1], Integer.parseInt(line[2]), df.parse(line[3]), Integer.parseInt(line[4]));
                list.add(sp);

            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fr != null) {
                try {
                    fr.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiF.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return list;
    }
}
