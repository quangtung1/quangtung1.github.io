package Book;

public class Doan extends Sach implements Kho {
    @Override
    public String toString() {
        return "Doan [nambaove=" + nambaove + ", sotrang=" + sotrang + ", tinhtrang=" + tinhtrang + "]";
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
    public int getNambaove() {
        return nambaove;
    }
    public void setNambaove(int nambaove) {
        this.nambaove = nambaove;
    }
    public Doan(long id, String tensach, String nhaxuatban, int namsanxuat, int sotrang, String tinhtrang,
            int nambaove) {
        super(id, tensach, nhaxuatban, namsanxuat);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.nambaove = nambaove;
    }
    int sotrang;
    String tinhtrang;
    int nambaove;
    @Override
    public void vitri(int tang, String ke) {
        // TODO Auto-generated method stub
        System.out.println("Quyển sách này ở tâng: "+ tang+" và ở kệ: " + ke); 
        
    }
  
    
}
