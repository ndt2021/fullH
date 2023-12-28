package bt2910;

import java.util.ArrayList;

public class KhoaHoc {
    private String tenKhoaHoc;
    private ArrayList<String> monHoc;

    public KhoaHoc(String tenKhoaHoc, ArrayList<String> monHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.monHoc = monHoc;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public ArrayList<String> getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(ArrayList<String> monHoc) {
        this.monHoc = monHoc;
    }
}
