import org.junit.Assert;
import org.junit.Test;

public class WhenConvertArabicNumberToRoman {
    private String convertToRoman(int arabicNumber){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return converter.convert(arabicNumber);
    }
    @Test
    public void Convert_0_To_EmptyString(){
        String romanNumber = convertToRoman(0);
        Assert.assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I(){
        String romanNumber = convertToRoman(1);
        Assert.assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II(){
        String romanNumber = convertToRoman(2);
        Assert.assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III(){
        String romanNumber = convertToRoman(3);
        Assert.assertEquals("III", romanNumber);
    }

    @Test
    public void Convert_5_To_V(){
        String romanNumber = convertToRoman(5);
        Assert.assertEquals("V", romanNumber);
    }

    @Test
    public void Convert_6_To_VI(){
        String romanNumber = convertToRoman(6);
        Assert.assertEquals("VI", romanNumber);
    }

    @Test
    public void Convert_8_To_VIII(){
        String romanNumber = convertToRoman(8);
        Assert.assertEquals("VIII", romanNumber);
    }
}