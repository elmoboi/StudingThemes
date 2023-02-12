package BankTreadStuding.WithInt.withoutSync;

public class BankActivity {
    private Integer currentMoney;
    public void payTo(Integer paymentAmount, BankClientInt bankClientPayer, BankClientInt bankClientRecipient) {
        Integer currentMoneyPayer = bankClientPayer.getMoney();
        Integer currentMoneyRecipient = bankClientRecipient.getMoney();
        if(currentMoneyPayer >= paymentAmount) {
            bankClientPayer.setMoney(currentMoneyPayer - paymentAmount);
            bankClientRecipient.setMoney(currentMoneyRecipient + paymentAmount);
            System.out.println("Перевод от " + bankClientPayer.getName() + " к " + bankClientRecipient.getName() + " осуществлен" + " в размере " + paymentAmount);
        } else System.out.println("У отправляющего " + bankClientPayer.getName() + " недостоаточно денег для перевода!" + " " + currentMoneyPayer);
    }

    public  void deposit(Integer depositAmount, BankClientInt bankClient) {
        currentMoney = bankClient.getMoney();
        bankClient.setMoney(currentMoney + depositAmount);
        System.out.println("Пополнение успешно! Кол-ао денег на счету: " + bankClient.getMoney());
    }

    public  void checkMoney (BankClientInt bankClient) {
        System.out.println("Кол-ао денег на счету: " + bankClient.getMoney());
    }
}
