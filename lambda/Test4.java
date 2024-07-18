package lambda;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {

  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("C://Temp//study.txt");

      int cnt = 0;
      System.out.println(fis.read());

      while (fis.read() == -1) {
        cnt++;
      }

      fis.close();
      System.out.println(cnt);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
