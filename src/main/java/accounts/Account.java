package accounts;

public class Account {
    protected long balance;
    protected String message;

    public Account(long balance) {
        this.balance = balance;
    }

    public String getMessage() {
        return message;
    }

    // оплатить метод

    public boolean pay(int amount) {

        balance = balance - amount;
        message = "С Вашего счета списана сумма " + amount
                + " руб. Ваш баланс составил " + balance + " руб.";
        return true;
    }

    @Override
    public String toString() {
        return message;
    }
}
