package com.example.Reto3.entities;

import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    private String name;

    private String email;

    private Integer age;

    private String password;

    @OneToMany(cascade ={CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    public List<Message> messages;


    @OneToMany(cascade ={CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    public List<Reservation> reservation;    

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

