package loop.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopTest1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            if (i < num) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }
    }
}
