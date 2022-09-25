package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: CheckingAccount")
public class CheckingAccountTest {
    private CheckingAccount checkingAccount;

    @Test
    @DisplayName("Тестирование метода оплаты 1 вариант")
    void pay1() {
        CheckingAccount checkingAccount = new CheckingAccount(50000);
        Assertions.assertTrue(checkingAccount.pay(50000));

    }

    @Test
    @DisplayName("Тестирование метода оплаты 2 вариант")
    void pay2() {
        CheckingAccount checkingAccount = new CheckingAccount(50000);
        Assertions.assertFalse(checkingAccount.pay(60000));

    }

}
