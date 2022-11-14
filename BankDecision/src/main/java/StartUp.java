import Core.Decision;
import Customers.Person;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StartUp {
    public static void main(String[] args) {
        ArrayList<Person> customers = new ArrayList();
        Person John = new Person("John", 18, BigDecimal.valueOf(100), BigDecimal.valueOf(500));
        Person Corry = new Person("Corry", 20, BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        Person Wes = new Person("Wes", 30, BigDecimal.valueOf(5_000), BigDecimal.valueOf(100));
        Person Bryan = new Person("Bryan", 33, BigDecimal.valueOf(-1), BigDecimal.valueOf(-1));

        John.setStatus();
        Corry.setStatus();
        Wes.setStatus();

        customers.add(John);
        customers.add(Corry);
        customers.add(Wes);
        customers.add(Bryan);

        for ( Person client:customers) {
            System.out.println(client.getStatus());
        }


        System.out.println("End of program");

    }
}
