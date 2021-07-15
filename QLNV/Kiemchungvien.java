package QLNV;

public class Kiemchungvien {
    @Override
    public String toString() {
        return "Kiemchungvien [email=" + email + ", hoten=" + hoten + ", luong=" + luong + ", manv=" + manv + ", sdt="
                + sdt + ", soloiph=" + soloiph + ", tuoi=" + tuoi + "] "+" Tổng Lương: "+ tinhluong();
    }
    public long getManv() {
        return manv;
    }
    public void setManv(long manv) {
        this.manv = manv;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public long getSdt() {
        return sdt;
    }
    public void setSdt(long sdt) {
        this.sdt = sdt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getLuong() {
        return luong;
    }
    public void setLuong(long luong) {
        this.luong = luong;
    }
    public int getSoloiph() {
        return soloiph;
    }
    public void setSoloiph(int soloiph) {
        this.soloiph = soloiph;
    }
    public Kiemchungvien(long manv, String hoten, int tuoi, long sdt, String email, long luong, int soloiph) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
        this.luong = luong;
        this.soloiph = soloiph;
    }
    long manv;
    String hoten;
    int tuoi;
    long sdt;
    String email;
    long luong;
    int soloiph;
    public long tinhluong(){
        long tongluong=getLuong()+getSoloiph()*50000;
        return tongluong;
    }

}
