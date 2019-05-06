package com.jborder.collegeapp_border;

import java.util.Date;

public class Profile {

    String objectId;
    String lastName ;
    String firstName;
    Date dateOfBirth;
    String email;
    String PhotoFilename;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Profile(){
        dateOfBirth = new Date();
        lastName = "Border";
        firstName = "Jacob";
        email = "@marinemaster00@gmail.com";
    }

    public String getObjectId(){
        return objectId;
    }
    public void setObjectId(String objectID){
        this.objectId = objectID;
    }



    public String getPhotoFilename() {
        return "";
    }
}

