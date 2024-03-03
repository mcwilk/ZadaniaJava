/*
# Python code:
def main():
    data = open('test_data.dat')
    numList = data.read().split()
    count = {}

    for num in numList:
        num = num.lower()
        count[num] = count.get(num, 0) + 1

    keyList = sorted(count.keys())
    for k in keyList:
        print("%-5s occurred %4d times" % (k, count[k]))
 */

import com.sun.tools.javac.Main;

import java.io.InputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class mapHistogram {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test_data.dat");
        Scanner data = null;
        TreeMap<String, Integer> count;
        String num;
        Integer numCount;

        try {
            data = new Scanner(inputStream);
        }
        catch (NullPointerException e) {
            System.out.println("Unable to open test data file!");
            e.printStackTrace();
            System.exit(0);
        }

        count = new TreeMap<String, Integer>();

        while (data.hasNextInt()) {
            num = data.next().toLowerCase();
            numCount = count.get(num);

            if (numCount == null) {
                numCount = 0;
            }

            count.put(num, ++numCount);
        }

        for (String i: count.keySet()) {
            System.out.printf("%-5s occurred %4d times\n", i, count.get(i) );
        }
    }
}
