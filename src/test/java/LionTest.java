import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Predator predator;
    @Test
    public void getKittensTestForLion() {
        Lion lion = new Lion(predator);
        Mockito.when(predator.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());

    }

    @Test
    public void getFoodTestForLion() throws Exception {
        Lion lion = new Lion(predator);
        Mockito.when(predator.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void lionThrowsException() throws Exception {
        Lion lion = new Lion("Детеныш");
    }



}
