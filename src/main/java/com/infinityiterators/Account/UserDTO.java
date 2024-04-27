package com.infinityiterators.Account;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDTO {

    private int pk;
    private String id;
    private String pwd;
    private String name;
    private LocalDate birthDate;
    private Boolean adminStatus;
    private LocalDateTime registerDate;

    public UserDTO() {
    }

    public UserDTO(int pk, String id, String pwd, String name, LocalDate birthDate, Boolean adminStatus, LocalDateTime registerDate) {
        this.pk = pk;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.birthDate = birthDate;
        this.adminStatus = adminStatus;
        this.registerDate = registerDate;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Boolean adminStatus) {
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
                "pk=" + pk +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adminStatus=" + adminStatus +
                ", registerDate=" + registerDate +
                '}';
    }
}


