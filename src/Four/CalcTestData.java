package Four;

import org.testng.annotations.DataProvider;

import java.io.*;
import java.net.URL;

public class CalcTestData {
    private static String address = "https://raw.githubusercontent.com/Demianenko/AutoCourse/master/src/DataPlus";
    public static void main(String[] args) {
        getDataFromSite();
    }
    public static URL URLPlus;
    @DataProvider(name = "getDataPlus")
    public static Object[][] getDataPlus() {

        return null;
    }
    private static String getDataFromSite() {
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try {
            URLPlus = new URL(address);
            in = new BufferedReader(new InputStreamReader(URLPlus.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
               sb.append(inputLine).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        String result = sb.toString();
        System.out.println(result);
        return result;
    }
}
