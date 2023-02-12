package SingletoneStuding;

public class MySingletonClass {
    static MySingletonClass instance;
    public MySingletonClass() {}
    MySingletonClass getInstance() {
        if(instance==null) {
            instance = new MySingletonClass();
        }
        return instance;
    }
}
