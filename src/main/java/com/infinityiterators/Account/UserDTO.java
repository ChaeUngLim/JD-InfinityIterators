package com.infinityiterators.Account;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {

//    private int PK;
    private String ID;
    private String pwd;
    private String name;
    private LocalDate birthDate;
    private boolean adminStatus;
    private LocalDateTime registerDate;

    public UserDTO() {
    }

    public UserDTO(String ID, String pwd, String name, LocalDate birthDate, boolean adminStatus) {
//        this.PK = PK;
        this.ID = ID;
        this.pwd = pwd;
        this.name = name;
        this.birthDate = birthDate;
        this.adminStatus = adminStatus;
        this.registerDate = LocalDateTime.now();
    }

    public UserDTO(String ID, String pwd) {
        this.ID = ID;
        this.pwd = pwd;
    }
//    public int getPK() {
//        return PK;
//    }
//
//    public void setPK(int PK) {
//        this.PK = PK;
//    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String inputBirthDate) {
        LocalDate birthDate = LocalDate.parse(inputBirthDate, DateTimeFormatter.ISO_DATE);
        this.birthDate = birthDate;
    }

    public boolean isAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(boolean adminStatus) {
        this.adminStatus = adminStatus;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
//                "PK=" + PK +
                ", ID='" + ID + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adminStatus=" + adminStatus +
                ", registerDate=" + registerDate +
                '}';
    }
}


