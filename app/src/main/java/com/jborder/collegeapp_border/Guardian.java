package com.jborder.collegeapp_border;
public class Guardian extends FamilyMember{
    String mLastName;
    String mFirstName;
    String mOccupation;

    @Override
    public String getLastName() {
        return mLastName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public String getFirstName() {
        return mFirstName;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Guardian(String firstName, String lastName){
        super(firstName, lastName);
        mOccupation = "unknown";
    }

    public Guardian(){
        super();
        mOccupation = "unknown";
    }

    public Guardian(String firstName, String lastName, String occupation){
        mFirstName = firstName;
        mLastName = lastName;
        mOccupation = occupation;
    }

    @Override
    public String toString(){
        return("Guardian: " + mFirstName + " " + mLastName + "\n Occupation: " + mOccupation);
    }

    public int getOccupation() {
        return 0;
    }

    public void setOccupation(String occupation) {
    }
}



