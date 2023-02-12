package BankTreadStuding.WithInt.withoutSync;

public class RunnerInt {

    //с BigDecimal
    public static void main(String[] args) throws InterruptedException {
        BankActivity bankActivity = new BankActivity();


        BankClientInt Mike = new BankClientInt("Mike", 3200, 1234);
        BankClientInt Jane = new BankClientInt("Jane", 1500, 1235);
        BankClientInt Dima = new BankClientInt("Dima", 6421, 1236);
        BankClientInt Oleg = new BankClientInt("Oleg", 11000, 1237);

        Runnable runnable1 = () -> {
            for(int i=0; i<1000; i++) {
                bankActivity.payTo(1, Oleg, Mike);
                bankActivity.payTo(1, Mike, Jane);
            }
        };

        Runnable runnable2 = () -> {
            for(int i=0; i<1000; i++) {
                bankActivity.payTo(1, Jane, Mike);
                bankActivity.payTo(1, Mike, Oleg);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("У Oleg " + Oleg.getMoney());
        System.out.println("У Mike " + Mike.getMoney());
        System.out.println("У Jane " + Jane.getMoney());
    }
}
