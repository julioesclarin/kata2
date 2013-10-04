package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Julio", new Date(53, 5, 2));
        Person person1 = new Person("Raul",new Date(75,12,25));
        
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
}
