package BankTreadStuding.WithInt.withoutSync;

public class BankClientInt {
    private String name;
    private Integer money;
    private Integer clientId;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public BankClientInt(String name, Integer money, Integer clientId) {
        this.name = name;
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
