package bt2910;

import java.util.ArrayList;

public class HocVien {
    private String maHocVien;
    private String hoTen;
    private String email;
    private String ngaySinh;
    private ArrayList<KhoaHoc> khoaHocDaDangKy;

    public HocVien(String maHocVien, String hoTen, String email, String ngaySinh, ArrayList<KhoaHoc> khoaHocDaDangKy) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.khoaHocDaDangKy = khoaHocDaDangKy;
    }

    public ArrayList<KhoaHoc> getKhoaHocDaDangKy() {
        return khoaHocDaDangKy;
    }

    public void setKhoaHocDaDangKy(ArrayList<KhoaHoc> khoaHocDaDangKy) {
        this.khoaHocDaDangKy = khoaHocDaDangKy;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
