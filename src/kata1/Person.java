package kata1;

import java.util.Date;

public class Person {
    
    private String name;
    private Date birthday;

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
        long result = (((((getYear()/1000)/60)/60)/24)/365);
        return (int) result;
    }
    
    private long getYear() {
        Date now = new Date();
        return now.getTime() - birthday.getTime();
    }
    
}
