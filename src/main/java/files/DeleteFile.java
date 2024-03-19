package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.delete()) {
            System.out.println("File has been removed!");
        } else {
            System.out.println("There is nothing to be deleted...");
        }
    }
}
