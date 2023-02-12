package BankTreadStuding.WithBigDecimal;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnerBigDecimal {

    //с BigDecimal
    public static void main(String[] args) {
        BankActivity bankActivity = new BankActivity();

        BankClientBigDecimal Mike = new BankClientBigDecimal(new BigDecimal(3200), 1234);
        BankClientBigDecimal Jane = new BankClientBigDecimal(new BigDecimal(1500), 1235);
        BankClientBigDecimal Dima = new BankClientBigDecimal(new BigDecimal(6421), 1236);
        BankClientBigDecimal Oleg = new BankClientBigDecimal(new BigDecimal(8600), 1237);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    bankActivity.payTo(BigDecimal.valueOf(1000), Oleg, Mike);
                }
            }
        };

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(runnable);
    }
}
