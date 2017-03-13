package com.alex.beerapp.model;

import android.net.Uri;
import android.widget.ImageView;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.ArrayList;

/**
 * Created by alex on 27/2/17.
 */

public class User {

    private int Id;
    private String name;
    private String Surnames;
    private String email;
    private String password;
    private String bio;
    private ImageView profileImage;
    private ArrayList<?> beersCollection;
    //private TimeLine postsList;
    private ArrayList<User> followers;
    private ArrayList<User> followings;

    public User(GoogleSignInAccount acct){
        this.name = acct.getGivenName();
        this.email = acct.getEmail();
        this.profileImage.setImageURI(Uri.parse(acct.getPhotoUrl().toString()));
    }

    public User(String password, String email, ImageView profileImage) {
        this.password = password;
        this.email = email;
        this.profileImage = profileImage;
    }

    public ArrayList<?> getBeersCollection() {
        return beersCollection;
    }

    public void setBeersCollection(ArrayList<?> beersCollection) {
        this.beersCollection = beersCollection;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowings() {
        return followings;
    }

    public void setFollowings(ArrayList<User> followings) {
        this.followings = followings;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*
    public TimeLine getPostsList() {
        return postsList;
    }

    public void setPostsList(TimeLine postsList) {
        this.postsList = postsList;
    }*/

    public ImageView getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(ImageView profileImage) {
        this.profileImage = profileImage;
    }

    public String getSurnames() {
        return Surnames;
    }

    public void setSurnames(String surnames) {
        Surnames = surnames;
    }

}

