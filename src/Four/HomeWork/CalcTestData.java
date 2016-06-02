package Four.HomeWork;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CalcTestData {
    private static String addressPlus = "https://raw.githubusercontent.com/Demianenko/AutoCourse/master/src/DataPlus";
    private static String addressMinus = "https://raw.githubusercontent.com/Demianenko/AutoCourse/master/src/DataPlus";
    @DataProvider(name = "getDataPlus")
    public static Object[][] getDataPlus() {
        URL URLPlus = null;
        try {
            URLPlus = new URL(addressPlus);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return setData(pareData(getDataFromSite(URLPlus)));
    }

    @DataProvider(name = "getDataMinus")
    public static Object[][] getDataMinus() {
        URL URLPlus = null;
        try {
            URLPlus = new URL(addressMinus);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return setData(pareData(getDataFromSite(URLPlus)));
    }

    private static ArrayList<String> getDataFromSite(URL address) {
        BufferedReader in = null;
        ArrayList<String> dataArr = new ArrayList<>();
        try {
            in = new BufferedReader(new InputStreamReader(address.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
               dataArr.add(inputLine);
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
        return dataArr;
    }
    private static ArrayList<String[]> pareData(ArrayList<String> siteData) {
        ArrayList<String[]> result = new ArrayList<>();
        for (String s : siteData) {
            if (s.length()>0) {
                result.add(s.split(","));
            }
        }
        return result;
    }
    private static Object[][] setData(ArrayList<String[]> arrList) {
        Object[][] data = new Object[arrList.size()][arrList.get(0).length];
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.get(i).length; j++ ) {
                data[i][j] = arrList.get(i)[j];
            }
        }
        return data;
    }

}
