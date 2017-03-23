package singleton;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by LG on 2017/3/23.
 */
public class SingletonTest {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i ++) {
            for (int j = 0; j < 10000; j ++) {
                DoubleCheck instance = DoubleCheck.getInstance();
            }
        }

        long time2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i ++) {
            for (int j = 0; j < 10000; j ++) {
                InnerStaticClass instance = InnerStaticClass.getInstance();
            }
        }

        long time3 = System.currentTimeMillis();

        try(FileWriter fileWriter = new FileWriter("src\\singleton\\time.txt")) {
            fileWriter.write("DoubleCheck time :" + (time2 - time1) + "\n");
            fileWriter.write("InnerStaticClass time :" + (time3 - time2) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
