package baseMath;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
;

public class AssEquals {

    @Test
    public void objectsByValue_Demo(){
        Integer first = 127;
        int second = 127;

        Assertions.assertSame(first, second);
        Assertions.assertEquals(first, second);
        Assertions.assertEquals(false, Boolean.FALSE);
        Assertions.assertSame(false, Boolean.FALSE);
        Assertions.assertNotSame(new Boolean(false), Boolean.FALSE);

    }
}
