package accounts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: Account")
public class AccountTest {

    private Account account;

    @Test
    @DisplayName("Тестирование метода оплаты")
    void pay() {
        Account account = new Account(50000);
        Assertions.assertTrue(account.pay(70000));
    }
}
