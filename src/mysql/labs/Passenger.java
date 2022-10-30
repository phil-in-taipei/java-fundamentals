package mysql.labs;

public class Passenger {
    private String given_name;
    private String surname;
    private int passportNum;

    public Passenger( int passportNum, String given_name, String surname) {
        this.given_name = given_name;
        this.surname = surname;
        this.passportNum = passportNum;
    }

    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public String getGiven_name() {
        return given_name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPassportNum() {
        return passportNum;
    }
}
