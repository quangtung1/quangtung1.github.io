package Library;

import java.time.LocalDate;

import java.util.List;

public class Voucher {
    @Override
    public String toString() {
        return "Voucher [dayofhires=" + dayofhires + ", id Voucher =" + id + ", lines=" + lines + ", payday=" + payday
                + ", reader=" + reader + "]";
    }
    private long id;
    private Reader reader;
    private LocalDate dayofhires;
    private LocalDate payday;
    private List<LineItem> lines;
    
    public Voucher(Reader reader, LocalDate dayofhires, LocalDate payday, List<LineItem> lines) {
        id=Idgenerator.getNewIDVoucher();
        this.reader = reader;
        this.dayofhires = dayofhires;
        this.payday = payday;
        this.lines = lines;
    }
    public Reader getReader() {
        return reader;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    public LocalDate getDayofhires() {
        return dayofhires;
    }
    public void setDayofhires(LocalDate dayofhires) {
        this.dayofhires = dayofhires;
    }
    public LocalDate getPayday() {
        return payday;
    }
    public void setPayday(LocalDate payday) {
        this.payday = payday;
    }
    public List<LineItem> getLines() {
        return lines;
    }
    public void setLines(List<LineItem> lines) {
        this.lines = lines;
    }
    
}
