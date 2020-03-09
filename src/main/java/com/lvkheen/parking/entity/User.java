package com.lvkheen.parking.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotNull(message = "Enter first name")
    @Pattern(regexp = "[A-Za-z]+", message = "Enter correct first name")
    @Column(name = "first_name")
    private String firstName;
    @NotNull(message = "Enter last name")
    @Pattern(regexp = "[A-Za-z]+", message = "Enter correct last name")
    @Column(name = "last_name")
    private String lastName;
    @NotNull(message = "Enter phone number")
    @Pattern(regexp = "[8][9][\\d]{9}", message = "Enter phone number in 89123456789 format")
    @Column(name = "phone")
    private String phone;
    @NotNull(message = "Enter car name")
    @Size(min=1, message = "Enter car name")
    @Column(name = "car")
    private String car;
    @NotNull(message = "Enter car number")
    @Pattern(regexp = "[a-zA-Z][0-9]{3}[a-zA-Z]{2}", message = "Enter car number in A000AA format")
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "location")
    private String location;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", car='" + car + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
