package EksamensopgaveUser;

public class User {

    private String fornavn;
    private String efternavn;
    private String email;
    private int tlfnr;

    public User(String fornavn, String efternavn, String email) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;

    }

    public User(String fornavn, String efternavn, String email, int tlfnr) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
        this.tlfnr = tlfnr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String toString() {
        return this.fornavn + " " + this.efternavn + ", " + this.email;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof User)) {
            return false;
        }
        User comparedEmail = (User) compared;

        if (this.email.equals(comparedEmail.email)) {
            return true;
        }
        return false;
    }
}
