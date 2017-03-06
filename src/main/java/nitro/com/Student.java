package nitro.com;

import javax.persistence.*;


@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(fetch=FetchType.LAZY)
    private Passport passports;

    protected Student() {
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    String firstName;
    String secondName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String toString(){
        return "[ "+getFirstName()+" , "+getSecondName();
    }
    public void addPassports(String passport){
        if(passports == null) passports = new Passport();
        passports.setKode(passport);

    }
}
