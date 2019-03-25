import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestClass {

//    wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]

    @Test
    public void testMain(){
        Main main = new Main();
        String[] words={"Hello", "hEllo", "heLlo", "helLo", "hellO"};
        assertArrayEquals( words,main.wave("hello"));
    }




}
