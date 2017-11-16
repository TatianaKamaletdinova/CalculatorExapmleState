package Calculator;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class ContextTest {
    @org.junit.Test
    public void run() throws Exception {
        Context context= new Context();
        assertEquals(0, context.run("C"));
        assertEquals(2, context.run("C2"));
        assertEquals(25, context.run("C25="));
        assertEquals(257452, context.run("C257452="));
        assertEquals(56, context.run("C7*8="));
        assertEquals(2025, context.run("C45*45="));
        assertEquals(1, context.run("C9/5="));
        assertEquals(0, context.run("C4344*0="));
        assertEquals(45, context.run("C15+15=30="));
    }
}