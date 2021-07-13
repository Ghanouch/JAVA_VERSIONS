package JAVA_8.METHOD_REFERENCE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MethodReferenceDEMO {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        User user = new User();
//        3.1. Reference to a Static Method
        userList.stream()
                .anyMatch(User::isRealUser);


//        3.2. Reference to an Instance Method
        userList.stream()
                .anyMatch(user::isLegalUser);


//        3.3. Reference to an Instance Method of an Object of a Particular Type
        List<String> list = List.of("A","B","");
        long count = list.stream().filter(String::isEmpty).count();
        System.out.println(count);


//        3.4. Reference to a Constructor
        Stream<User> stream = list.stream().map(User::new);




    }
}
