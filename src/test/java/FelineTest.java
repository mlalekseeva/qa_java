import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {



    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensTestForFeline() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }







}
