package btbh;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
    private static Long idCustomer = 0L;
    private static Long idProduct = 0L;
  private static ReentrantLock lock = new ReentrantLock();
  public static Long getNewID() {
    Long result;
    lock.lock();//Biến lock tăng lên 1 rồi ném vào khối try finally
    try {
      result = ++idCustomer;
    } finally {
      lock.unlock(); // Khởi tạo lại biến lock bắt đầu từ 0     
    }
    return result;
  }
  public static Long getNewIDProduct() {
    Long result;
    lock.lock();//Biến lock tăng lên 1 rồi ném vào khối try finally
    try {
      result = ++idProduct;
    } finally {
      lock.unlock(); // Khởi tạo lại biến lock bắt đầu từ 0     
    }
    return result;
  }
  private IdGenerator(){}
}