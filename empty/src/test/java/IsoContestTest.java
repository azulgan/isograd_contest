import com.isograd.exercise.IsoContest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;


/**
 * (c) aguegan, 2015
 * User: aguegan
 * Date: 9/22/15
 * Time: 6:05 PM
 */
public class IsoContestTest {

//    @Ignore
    @Test
    public void test0() throws Exception {
        String[] argv = new String[] { "input0.txt", "output0.txt" };
        singleTest(argv);
    }

    @Test
    public void test1() throws Exception {
        String[] argv = new String[] { "input1.txt", "output1.txt" };
        singleTest(argv);
    }

//    @Ignore
    @Test
    public void test2() throws Exception {
        String[] argv = new String[] { "input2.txt", "output2.txt" };
        singleTest(argv);
    }

    private void singleTest(String[] argv) throws Exception {
        IsoContest.main(argv);
        Assert.assertEquals(loadFileFirstLines(argv[1]), IsoContest.getMain().getResult());
    }

    private String loadFileFirstLines(String fileName) {
        InputStream is = IsoContest.getInputStream(new String[] { fileName });
        String ret = "";
        if (is != null) {
            Scanner scanner = null;
            try {
                StringBuilder sb = new StringBuilder();
                scanner = new Scanner(is);
                String sep = "";
                while (scanner.hasNextLine()) {
                    sb.append(sep).append(scanner.nextLine());
                    sep = "\n";
                }
                ret = sb.toString();
            }
            finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
        return ret;
    }

}
