package accounts;

public class SavingsAccount extends Account {
    // накопительный счет
    private long minBalance;

    public SavingsAccount(long balance, long minBalance) {
        super(balance);
        this.minBalance = minBalance;
    }


    @Override
    public boolean pay(int amount) {
        if (balance - amount >= minBalance) {
            super.pay(amount);
            return true;
        } else {
            message = "Операция отклонена. На Вашем счету недостаточно средств. " +
                    " Ваш баланс составляет " + balance + " руб.";
            return false;
        }
    }


}
