package nitro.com;

import javax.persistence.*;


@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String firstName;
    String secondName;

  @OneToOne
  Passport getId;

    long passport_id;

    protected Student() {
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }



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

}
