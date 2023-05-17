package utilityPrograms;
import java.io.IOException;
import org.testng.annotations.DataProvider;
public class Datadrivenutility {
@DataProvider(name="testData")
public Object[][] getTestData() throws IOException{
String data[][] = XLUtility.tdata();
return data;
}
}



