package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
//        int result = new GettingStarted().addFive(???);  we need to fill in some input
        int result = new GettingStarted().addFive(0); // in above command we gave number 5
//        Assertions.assertEquals(???, result);  what we are comparing it with we haven't defined here properly
        Assertions.assertEquals(5, result); // we added number 5 to make comparison with result
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
