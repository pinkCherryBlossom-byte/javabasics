package basic.lombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main16 {

    public void readFile(String path) throws IOException {
        @Cleanup InputStream ip = new FileInputStream(path);
        byte[] data = ip.readAllBytes();
        System.out.println(new String(data));
    }
}
