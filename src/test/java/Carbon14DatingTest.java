import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();

    /*
        #2 Build a test for getRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for getRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */
    @Test
    public void testGetRemainingAmount(){
        Carbon14Dating carbon14Dating = new Carbon14Dating(5);
        assertEquals(5, carbon14Dating.getRemainingAmount());
    }


    // #4 Build a test for the toString() method.
}
