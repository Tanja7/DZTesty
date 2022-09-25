package accounts;

public class CheckingAccount extends Account {
    // расчетный счет
    public CheckingAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean pay(int amount) {
        if (balance - amount >= 0) {
            super.pay(amount);
            return true;
        } else {
            message = "Операция отклонена. На Вашем счету недостаточно средств. " +
                    " Ваш баланс составляет " + balance + " руб.";
            return false;
        }
    }

}
