import com.oktaliem.qark.QarkScanner;
import org.junit.Test;

import java.io.IOException;

public class QarkScannerTest {

    @Test
    public void scanner() throws IOException {
        System.out.println("Test Started....");
        QarkScanner scanner = new QarkScanner();
        if (System.getProperty("path") != null) {
            scanner.qarkScan(System.getProperty("type"),System.getProperty("path"));
            System.out.println("Test Finished....");
        } else {
            System.out.println("Please set your java source code or apk path!!!");
        }
    }
}
