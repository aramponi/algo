package utils;

import com.infine.utils.GzipedCsvArray;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.assertEquals;
/**
 * Created by aramponi032414 on 15/01/2016.
 */
public class GzipCsvArrayTest {
    @Test
    public void shouldReadTheGZipedFile() throws IOException {
        GzipedCsvArray gzipedCsvArray = new GzipedCsvArray("data/cpuload.csv.gz");

        double [] array;
        while( (array = gzipedCsvArray.next()) != null) {
            assertEquals(array.length, 100);
        }
    }
}
