package BankTreadStuding.WithBigDecimal;

import java.math.BigDecimal;

public class BankClientBigDecimal {
    private String name;
    private BigDecimal money;
    private Integer clientId;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public BankClientBigDecimal(BigDecimal money, Integer clientId) {
        this.money = money;
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "Money=" + money +
                ", ClientId=" + clientId +
                '}';
    }
}
