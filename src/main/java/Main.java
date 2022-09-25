import clients.Client;
import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;


public class Main {
    public static void main(String[] args) {

        Client client = new Client("Ольга", 3);
        Client client1 = new Client("Александр", 2);
        Client client2 = new Client("Алёна", 1);

        Account account = new SavingsAccount(100000, 30000);
        Account account1 = new SavingsAccount(100000, 30000);
        Account account2 = new CheckingAccount(50000);
        Account account3 = new CheckingAccount(80000);
        Account account4 = new CheckingAccount(50000);
        Account account5 = new SavingsAccount(30000, 30000);
        Account account6 = new CreditAccount(-30000);
        Account account7 = new CreditAccount(-130000);
        Account account8 = new CreditAccount(-50000);

        client.add(account);
        client.add(account3);
        client.add(account6);
        client1.add(account1);
        client1.add(account4);
        client1.add(account7);
        client2.add(account2);
        client2.add(account5);
        client2.add(account8);

        client.pay(70000);
        System.out.println(client.toString());
        client.pay(90000);
        System.out.println(client.toString());
        client.pay(80000);
        System.out.println(client.toString());
        client1.pay(70000);
        System.out.println(client1.toString());
        client1.pay(50000);
        System.out.println(client1.toString());
        client2.pay(70000);
        System.out.println(client2.toString());
        client2.pay(30000);
        System.out.println(client2.toString());
    }
}
