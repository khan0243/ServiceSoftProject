package com.servicesoft.app.mobile.servicesoft.customer;

/**
 * Created by Jessie on 2017-02-04.
 */

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String streetNumber;
    private String streetName;
    private String province;
    private String city;
    private String postcode;
    private String country;

    public Customer(String firstName, String lastName, String email, String phone, String streetNumber, String streetName, String province, String city, String postcode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.province = province;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }
}
