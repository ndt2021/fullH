package bt2910;

import java.util.ArrayList;

public class QuanLyHocVien {
    private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();

    public void themHocVien(HocVien hocVien) {
        danhSachHocVien.add(hocVien);
    }
    public void hienThiThongTinHocVien(String maHocVien) {
        for (HocVien hocVien : danhSachHocVien) {
            if (hocVien.getMaHocVien().equals(maHocVien)) {
                System.out.println("Mã học viên: " + hocVien.getMaHocVien());
                System.out.println("Họ tên: " + hocVien.getHoTen());
                System.out.println("Email: " + hocVien.getEmail());
                System.out.println("Ngày sinh: " + hocVien.getNgaySinh());

                // Hiển thị khóa học mà học viên đã đăng ký
                System.out.println("Khóa học đã đăng ký:");
                for (KhoaHoc khoaHoc : hocVien.getKhoaHocDaDangKy()) {
                    System.out.println("Tên khóa học: " + khoaHoc.getTenKhoaHoc());
                    System.out.println("Các môn học trong khóa:");
                    for (String monHoc : khoaHoc.getMonHoc()) {
                        System.out.println("- " + monHoc);
                    }
                }
                return;
            }
        }
        System.out.println("Không tìm thấy học viên có mã " + maHocVien);
    }


}
