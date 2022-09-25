package clients;

import accounts.Account;

public class Client {

    protected String nameClient; // имя клиента
    protected int accountMax; // максимальное количество счетов
    protected String message;

    protected Account[] accounts;

    // конструктор для заполнения полей
    public Client(String nameClient, int accountMax) {
        this.nameClient = nameClient;
        this.accountMax = accountMax;
        accounts = new Account[accountMax];
    }

    // добавление нового счета
    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println(nameClient + "! Мест для добавления нового счёта нет!");
    }

    public boolean pay(int amount) {

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                message = nameClient + "! " + accounts[i].getMessage();

                return true;
            }
        }
        message = nameClient + "! Операция отклонена. На Ваших счетах недостаточно средств.";
        return false;

    }

    public String toString() {
        return message;
    }

}
