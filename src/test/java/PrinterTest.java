import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 100);
    }

    @Test
    public void canPrint() {
        printer.print(4, 2);
        assertEquals(42, printer.getSheetsLeft());
    }

    @Test
    public void canReduceToner() {
        printer.print(4, 2);
        assertEquals(92, printer.getToner());
    }
}
