package Library;

import java.util.concurrent.locks.ReentrantLock;

public class Idgenerator {
    private static Long idBook= 0L;
    private static Long idReader= 0L;
    private static Long idVoucher=0L;
  private static ReentrantLock lock = new ReentrantLock();
  public static Long getNewIDBook() {
    Long result;
    lock.lock();//Biến lock tăng lên 1 rồi ném vào khối try finally
    try {
      result = ++idBook;
    } finally {
      lock.unlock(); // Khởi tạo lại biến lock bắt đầu từ 0     
    }
    return result;
  }
  public static Long getNewIDReader() {
    Long result;
    lock.lock();//Biến lock tăng lên 1 rồi ném vào khối try finally
    try {
      result = ++idReader;
    } finally {
      lock.unlock(); // Khởi tạo lại biến lock bắt đầu từ 0     
    }
    return result;
  }
  public static Long getNewIDVoucher() {
    Long result;
    lock.lock();//Biến lock tăng lên 1 rồi ném vào khối try finally
    try {
      result = ++idVoucher;
    } finally {
      lock.unlock(); // Khởi tạo lại biến lock bắt đầu từ 0     
    }
    return result;
  }
  private Idgenerator(){}
}
