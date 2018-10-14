package travel.uittrser.go9.go9.View.TrangChu.ListMenu.DuongDayNongPackage;

import travel.uittrser.go9.go9.R;

public class DuongDayNongListView {
    private String Ten;
    private String SDT;
    private int HinhDaiDien;
    private int HinhDienThoai;

    public DuongDayNongListView(String ten, String SDT, int hinhDaiDien) {
        Ten = ten;
        this.SDT = SDT;
        HinhDaiDien = hinhDaiDien;
        HinhDienThoai = R.drawable.menuicon_hotline;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getHinhDaiDien() {
        return HinhDaiDien;
    }

    public void setHinhDaiDien(int hinhDaiDien) {
        HinhDaiDien = hinhDaiDien;
    }

    public int getHinhDienThoai() {
        return HinhDienThoai;
    }

    public void setHinhDienThoai(int hinhDienThoai) {
        HinhDienThoai = hinhDienThoai;
    }
}
