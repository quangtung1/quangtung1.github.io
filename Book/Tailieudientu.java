package Book;

public class Tailieudientu extends Sach implements Dowload {
    @Override
    public String toString() {
        return "Tailieudientu [dungluong=" + dungluong + ", giathanh=" + giathanh + ", luottai=" + luottai + "]";
    }
    public String getDungluong() {
        return dungluong;
    }
    public void setDungluong(String dungluong) {
        this.dungluong = dungluong;
    }
    public long getLuottai() {
        return luottai;
    }
    public void setLuottai(long luottai) {
        this.luottai = luottai;
    }
    public long getGiathanh() {
        return giathanh;
    }
    public void setGiathanh(long giathanh) {
        this.giathanh = giathanh;
    }
    public Tailieudientu(long id, String tensach, String nhaxuatban, int namsanxuat, String dungluong, long luottai,
            long giathanh) {
        super(id, tensach, nhaxuatban, namsanxuat);
        this.dungluong = dungluong;
        this.luottai = luottai;
        this.giathanh = giathanh;
    }
    String dungluong;
    long luottai;
    long giathanh;
    @Override
    public void tongtien() {
        // TODO Auto-generated method stub
        long tong=getLuottai()*getGiathanh();
        System.out.println("Tổng tiền bạn phải thanh toán là: "+tong);
        
    }
    
}
