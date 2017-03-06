package nitro.com;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_passport")
    private Set<Passport> passports;

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
    public void setPassports(Passport passport){
        if(passports == null) passports = new HashSet<Passport>();
        passports.add(passport);


    }
}
