package src.main.java.app.model;

public class Buyer {
    private String FIRSTNAME;
    private int age;
    private String number;

    public Buyer(String FIRSTNAME, int age, String number) {
        this.FIRSTNAME = FIRSTNAME;
        this.age = age;
        this.number = number;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "FIRSTNAME='" + FIRSTNAME + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}
