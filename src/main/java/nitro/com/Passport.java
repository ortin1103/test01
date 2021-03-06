package nitro.com;


import javax.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String kod;

    public Passport() {
    }

    public Passport(String kod) {
        this.kod = kod;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", kod='" + kod + '\'' +
                '}';
    }
}



