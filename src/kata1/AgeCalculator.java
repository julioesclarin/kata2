package kata1;

import java.util.Date;

public class AgeCalculator {

    private Person person1;
    private Person person2;

    public AgeCalculator(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public int calculateDifference(){
        Date date1 = person1.getBirthdate();
        Date date2 = person2.getBirthdate();
        long dif = Math.abs(date1.getTime() - date2.getTime());
        return (int) (dif/Time.MILLISECONDS_PER_YEAR);
    }
    
}
