package kata1;

import java.util.Date;

public class Person {
    
    private String name;
    private Date birthday;
    private long MILLISECONDS_PER_YEAR;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        return (int) millisecondsToYears(getAgeInMilliseconds());
    }
    
    private long millisecondsToYears(long milliseconds) {
        return (int) (milliseconds / MILLISECONDS_PER_YEAR);
    }
    
    private long getAgeInMilliseconds() {
        return now().getTime() - birthday.getTime();
    }
    
    private Date now() {
        return new Date();
    }
    
}
