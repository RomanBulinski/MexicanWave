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
    

    @Test
    public void testMainWithGap(){
        Main main = new Main();
        String[] words={"Gap ", "gAp ", "gaP "};
        assertArrayEquals( words,main.wave("gap "));
    }

    @Test
    public void testMainWithGapInside(){
        Main main = new Main();
        String[] words={"G ap", "g Ap", "g aP"};
        assertArrayEquals( words,main.wave("g ap"));
    }

}
