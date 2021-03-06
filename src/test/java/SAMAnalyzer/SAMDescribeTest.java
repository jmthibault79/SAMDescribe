package SAMAnalyzer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class SAMDescribeTest {

    public String getTestDataDir() { return "src/test/resources/"; }

    @DataProvider(name = "cramFiles")
    public Object[][] getSerializationTestData() {
        return new Object[][]{
                {new File(getTestDataDir(), "valid.cram")},
                //{new File("/Users/cmn/projects/hellbender/src/test/resources/large/CEUTrio.HiSeq.WGS.b37.NA12878.20.21.cram")}
        };
    }

    @Test(dataProvider="cramFiles")
    public void testAnalyze(File inputFile) {
        SAMDescribe.main(
                new String[] { inputFile.getAbsolutePath() });
    }
}