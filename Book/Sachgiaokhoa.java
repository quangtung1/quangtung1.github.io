package Book;

public class Sachgiaokhoa extends Sach implements Muon,Kho {
    @Override
    public String toString() {
        return "Sachgiaokhoa [soluongmuon=" + soluongmuon + ", sotrang=" + sotrang + ", tinhtrang=" + tinhtrang
                + ", tongsoluong=" + tongsoluong + "]";
    }
    public int getSotrang() {
        return sotrang;
    }
    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    public String getTinhtrang() {
        return tinhtrang;
    }
    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    public int getTongsoluong() {
        return tongsoluong;
    }
    public void setTongsoluong(int tongsoluong) {
        this.tongsoluong = tongsoluong;
    }
    public int getSoluongmuon() {
        return soluongmuon;
    }
    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }
    public Sachgiaokhoa(long id, String tensach, String nhaxuatban, int namsanxuat, int sotrang, String tinhtrang,
            int tongsoluong, int soluongmuon) {
        super(id, tensach, nhaxuatban, namsanxuat);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.tongsoluong = tongsoluong;
        this.soluongmuon = soluongmuon;
    }
    int sotrang;
    String tinhtrang;
    int tongsoluong;
    int soluongmuon;
    
    @Override
    public void tonkho() {
        // TODO Auto-generated method stub
        int ton=getTongsoluong()-getSoluongmuon();
        System.out.println("Số sách tồn lại trong kho là: " + ton);
        
    }
    @Override
    public void vitri(int tang, String ke) {
        System.out.println("Quyển sách này ở tâng: "+ tang+" và ở kệ: " + ke);  
    }}
   
