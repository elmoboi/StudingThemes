package SingletoneStuding;

public class Runner {
    public  void main(String[] args) {
        MySingletonClass mySingletonClass = new MySingletonClass();
        mySingletonClass.getInstance();
        mySingletonClass.getInstance();
        if(mySingletonClass.getInstance().equals(mySingletonClass.getInstance())) {
            System.out.println("они одинаковые!");
        } else System.out.println("Синглтон не работает :(");
    }
}
