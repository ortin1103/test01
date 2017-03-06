package nitro.com;


import javax.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue
    @Column(name = "passport_id")
    private long id;

    String passport;

    public Passport() {
    }

    public Passport(String passporld) {
        this.passport = passporld;
    }

    public String getPassporld() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
