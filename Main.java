package ruby;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    @Test
    public void TestCreating_5() throws Exception {

        String expectedResult = "111221";
        String actualResult = Creating.creating(5);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestCreating_10() throws Exception {

        String expectedResult = "13211311123113112211";
        String actualResult = Creating.creating(10);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestCreating_1() throws Exception {

        String expectedResult = "1";
        String actualResult = Creating.creating(1);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestCreating_0() {
        Assertions.assertThrows(NotRightArgumentException.class, () -> Creating.creating(0));
    }
}
