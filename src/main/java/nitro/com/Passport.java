package nitro.com;


import javax.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    private long id;

    String passport;

    protected Passport() {
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
