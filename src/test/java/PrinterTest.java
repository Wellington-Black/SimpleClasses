import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void canPrint() {
        assertEquals(100, printer.print(100, 10));
    }
}
