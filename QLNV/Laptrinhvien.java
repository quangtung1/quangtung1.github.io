package QLNV;

public class Laptrinhvien {
    @Override
    public String toString() {
        return "Laptrinhvien [email=" + email + ", giolamthem=" + giolamthem + ", hoten=" + hoten + ", luong=" + luong
                + ", manv=" + manv + ", sdt=" + sdt + ", tuoi=" + tuoi + "]";
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
    public int getGiolamthem() {
        return giolamthem;
    }
    public void setGiolamthem(int giolamthem) {
        this.giolamthem = giolamthem;
    }
    public Laptrinhvien(long manv, String hoten, int tuoi, long sdt, String email, long luong, int giolamthem) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
        this.luong = luong;
        this.giolamthem = giolamthem;
    }
    long manv;
    String hoten;
    int tuoi;
    long sdt;
    String email;
    long luong;
    int giolamthem;
    public void tinhluong(){
        long tongluong=getLuong()+getGiolamthem()*200000;
        System.out.println("Lương của nhân viên "+getManv() +" là: "+tongluong);
    }
}
