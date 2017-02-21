package com.example.fujitsu.recycleviewtest;

/**
 * Created by FUJITSU on 2/21/2017.
 */

public class ProfileInfo {
    String profilePicUrl;
    String name;
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
