package models;

public class Passenger {

    private String name;
    private int phoneNum;
    private String id;

    public Passenger(String name, int phoneNum, String id) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
