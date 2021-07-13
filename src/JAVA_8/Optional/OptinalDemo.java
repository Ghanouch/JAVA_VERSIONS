package JAVA_8.Optional;

import java.util.Optional;

public class OptinalDemo {
    public static void main(String[] args) {

// --------------------    4.1. Creation of the Optional<T>

        Optional<String> optional = Optional.empty();
        String str = "value";
        Optional<String> _optional = Optional.of(str);
        System.out.println(_optional.isEmpty());

        Optional<String> __optional = Optional.ofNullable(str);
        System.out.println(__optional.isEmpty());



    }
}
