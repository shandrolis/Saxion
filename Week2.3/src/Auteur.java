import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Joep on 23-Nov-15.
 */
public class Auteur {
    private String name;
    Calendar date;

    public Auteur(String name, GregorianCalendar dateOfBirth){
        this.name=name;
        this.date=dateOfBirth;

    }
    public Auteur (String name){
        this.name=name;
    }


    public String getAge(){
            if(date != null){
                Calendar curr = new GregorianCalendar();
                int age = curr.get(Calendar.YEAR) - date.get(Calendar.YEAR);
                return age+"";

            }
            return "A date of birth has not been set.";

    }
}
