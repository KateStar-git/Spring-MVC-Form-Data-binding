package com.luv2code.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String favoriteLanguage;

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    private List<String> favoriteSystems; //List because you can chose more than 1


    private String country;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student(){

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
}
