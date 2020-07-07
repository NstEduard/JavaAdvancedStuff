import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringOperationTest {
    StringOperation stringOperation = new StringOperation();

    @BeforeClass
    public static void initialize(){
        System.out.println("---- Starting test------");
    }

    @AfterClass
    public static void finish(){
        System.out.println("---- End Test ----");
    }


    @Before
    public void beforeRunningTest(){
        System.out.println("Ma execut inainte de fiecare test ");
    }

    @Test
    public void stringLengthTest(){
        String text = "Alex";
        int result = stringOperation.stringLength(text);

        assertEquals(result,4);
    }

    @Test
    public void stringConcatenationTest(){
        String text1 = "Ana";
        String text2 = " are mere";
        String result = stringOperation.stringConcatenation(text1,text2);

        assertEquals(result,"Ana are mere");
    }

    @Test
    public void stringContainsTest(){
        String text1 = "Toamna";
        String text2 = "am";

        Boolean result = text1.contains(text2);
        assertEquals(result, true);
    }
}
