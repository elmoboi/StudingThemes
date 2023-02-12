package FunctionAndLambda;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceAndLanbda {
    public void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = String::isEmpty;
        List<String> strings = new ArrayList<>();
        strings.add("Oleg");
        strings.add("");
        strings.add("studing");
        strings.add("");
        strings.add("");
        strings.add("lambda");
        strings.add("");
        print(strings, s -> myFunctionalInterface.isStringNotNull(s));
    }

    static void print(List<String> strings, MyFunctionalInterface myFunctionalInterface) {
        StringBuilder finalString = new StringBuilder();
        for(String string : strings) {
            if(!myFunctionalInterface.isStringNotNull(string)) {
                finalString.append(" ").append(string);
            }
        }
        System.out.println(finalString);
    }
}
