package nitro.com;


import javax.persistence.*;

@Entity
public class Passport {

    private long id;
@Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    String kode;

    protected Passport() {
    }

    public Passport(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}



