/*
# Python code:
def main():
    count = [0] * 10
    data = open("test_data.dat")

    for line in data:
        count[int(line)] = count[int(line)] + 1
    print(count)
    idx = 0

    for num in count:
        print(idx, " occured ", num, " times.")
        idx += 1
 */

import com.sun.tools.javac.Main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class numberHistogram {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test_data.dat");
        Scanner data = null;
        ArrayList<Integer> count;
        int idx;

        try {
            data = new Scanner(inputStream);
        }
        catch (NullPointerException e) {
            System.out.println("Unable to open test data file!");
            e.printStackTrace();
            System.exit(0);
        }

        count = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            count.add(i, 0);
        }

        while (data.hasNextInt()) {
            idx = data.nextInt();
            count.set(idx, count.get(idx) + 1);
        }

        idx = 0;
        for (int i: count) {
            System.out.println(idx + " occurred " + i + " times.");
            idx++;
        }
    }
}
