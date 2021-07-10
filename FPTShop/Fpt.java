package FPTShop;

public class Fpt {
    @Override
    public String toString() {
        return "Fpt [Danh muc=" + d + ", gia=" + gia + ", hang=" + hang + ", masp=" + masp + ", mota=" + mota + ", soluong="
                + soluong + ", soluongban=" + soluongban + ", ten=" + ten + "]";
    }
    public int getMasp() {
        return masp;
    }
    public void setMasp(int masp) {
        this.masp = masp;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMota() {
        return mota;
    }
    public void setMota(String mota) {
        this.mota = mota;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public int getSoluongban() {
        return soluongban;
    }
    public void setSoluongban(int soluongban) {
        this.soluongban = soluongban;
    }
    public String getHang() {
        return hang;
    }
    public void setHang(String hang) {
        this.hang = hang;
    }
    public long getGia() {
        return gia;
    }
    public void setGia(long gia) {
        this.gia = gia;
    }
    public Danhmuc getD() {
        return d;
    }
    public void setD(Danhmuc d) {
        this.d = d;
    }
    public Fpt(int masp, String ten, String mota, int soluong, int soluongban, String hang, long gia, Danhmuc d) {
        this.masp = masp;
        this.ten = ten;
        this.mota = mota;
        this.soluong = soluong;
        this.soluongban = soluongban;
        this.hang = hang;
        this.gia = gia;
        this.d = d;
    }
    int masp;
    String ten;
    String mota;
    int soluong;
    int soluongban;
    String hang;
    long gia;
    Danhmuc d;
    
}
