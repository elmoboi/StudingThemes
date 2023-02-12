package BankTreadStuding.WithBigDecimal;

import java.math.BigDecimal;

public class BankActivity {
    private BigDecimal currentMoney;
    public  void payTo(BigDecimal paymentAmount, BankClientBigDecimal bankClientPayer, BankClientBigDecimal bankClientRecipient) {
        BigDecimal currentMoneyPayer = bankClientPayer.getMoney();
        BigDecimal currentMoneyRecipient = bankClientRecipient.getMoney();
        if(currentMoneyPayer.compareTo(paymentAmount) > 0) {
            bankClientPayer.setMoney(currentMoneyPayer.subtract(paymentAmount));
            bankClientRecipient.setMoney(currentMoneyRecipient.add(paymentAmount));
            System.out.println("Перевод осуществлен!");
        } else System.out.println("У отправляющего недостоаточно денег для перевода!" + " " + bankClientPayer.getMoney());
    }

    public  void deposit(BigDecimal depositAmount, BankClientBigDecimal bankClient) {
        currentMoney = bankClient.getMoney();
        bankClient.setMoney(currentMoney.add(depositAmount));
        System.out.println("Пополнение успешно! Кол-ао денег на счету: " + bankClient.getMoney());
    }

    public  void checkMoney (BankClientBigDecimal bankClient) {
        System.out.println("Кол-ао денег на счету: " + bankClient.getMoney());
    }
}
