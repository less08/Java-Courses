import javafx.util.Pair;

import java.util.ArrayList;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return getSimpleRomanNumber(arabicNumber);
    }

    private String getSimpleRomanNumber(int arabicNumber) {
        String romanNumber = "";

        Pair<Integer, String> one = new Pair(1, "I");
        Pair<Integer, String> five = new Pair(5, "V");
        ArrayList<Pair<Integer, String>> map = new ArrayList();
        map.add(five);
        map.add(one);
        for (Pair<Integer, String> digit : map) {
            while (arabicNumber >= digit.getKey()) {
                romanNumber += digit.getValue();
                arabicNumber -= digit.getKey();
            }
        }

        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}