package com.infinityiterators.Account;

public class UserDTO {

    private int PK;
    private String ID;
    private String pwd;
    private String name;
    private String birthDate;
    private String adminStatus;
    private String registerDate;

    public UserDTO() {
    }
    public UserDTO(int PK, String ID, String pwd, String name, String birthDate, String registerDate) {
        this.PK = PK;
        this.ID = ID;
        this.pwd = pwd;
        this.name = name;
        this.birthDate = birthDate;
        this.registerDate = registerDate;
    }

    public int getPK() {
        return PK;
    }

    public void setPK(int PK) {
        this.PK = PK;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "PK=" + PK +
                ", ID='" + ID + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", registerDate='" + registerDate + '\'' +
                '}';
    }
}


