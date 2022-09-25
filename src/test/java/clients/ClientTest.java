package clients;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import org.junit.jupiter.api.*;

@DisplayName("Тестирование: Client")
public class ClientTest {

    private Client client;

    @Test
    @DisplayName("Тестирование добавления нового счета")
    void add() {
        Client client = new Client("Ольга", 2);
        Account account = new CheckingAccount(50000);
        Account account1 = new SavingsAccount(50000, 30000);
        Account account2 = new CreditAccount(10000);

        client.add(account);
        client.add(account1);
        client.add(account2);
        Assertions.assertEquals(client.accountMax, client.accounts.length);
        Assertions.assertTrue(client.accountMax - client.accounts.length >= 0);
    }

    @Test
    @DisplayName("Тестирование метода оплаты вариант 1")
    void pay1() {
        Client client = new Client("Ольга", 2);
        Account account = new CheckingAccount(50000);
        Account account1 = new SavingsAccount(50000, 30000);
        client.add(account);
        client.add(account1);

        Assertions.assertTrue(client.pay(50000));

    }

    @Test
    @DisplayName("Тестирование метода оплаты вариант 2")
    void pay2() {
        Client client = new Client("Ольга", 2);
        Account account = new CheckingAccount(50000);
        Account account1 = new SavingsAccount(50000, 30000);
        client.add(account);
        client.add(account1);

        Assertions.assertFalse(client.pay(51000));

    }
}
