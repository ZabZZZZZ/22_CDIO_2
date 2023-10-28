import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class AccountTest {
    @Test
    public void testForNegativeAccountBalance() {
        Account acc = new Account(10);

        assertEquals(0, acc.withdraw(-20));
    }

    @Test
    public void testForAccountWidthdrawel() {
        Account acc = new Account(10);

        assertEquals(5, acc.withdraw(-5));
    }

    @Test
    public void testForAccountDeposit() {
        Account acc = new Account(10);

        assertEquals(50, acc.deposit(40));
    }
}
