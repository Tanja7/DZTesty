package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: SavingsAccount")
public class SavingsAccountTest {
    private SavingsAccount savingsAccount;

    @Test
    @DisplayName("Тестирование метода оплаты вариант 1")
    void pay1() {
        SavingsAccount savingsAccount = new SavingsAccount(50000, 30000);
        Assertions.assertTrue(savingsAccount.pay(20000));

    }

    @Test
    @DisplayName("Тестирование метода оплаты вариант 2")
    void pay2() {
        SavingsAccount savingsAccount = new SavingsAccount(50000, 30000);
        Assertions.assertFalse(savingsAccount.pay(30000));

    }
}
