import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    private static File file;

    public static void recorsive(File file) throws IOException {
            File[] files = file.listFiles();
                for (File file1 : files) {
                    if(file1.isDirectory()){
                        System.out.println(file1.getName());
                        recorsive(file1);
                    }
                       else if (file1.isFile()){
                        System.out.println(file1.getName());
                    }
            }
        }
    }
