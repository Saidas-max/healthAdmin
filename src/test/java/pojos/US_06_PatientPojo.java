package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_06_PatientPojo {
    private String firstName;
    private String lastName;
    private String gender;
    private US_06_UserPojo userPojo;

    public US_06_PatientPojo(String firstName, String lastName, String gender, US_06_UserPojo userPojo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.userPojo = userPojo;
    }

    public US_06_PatientPojo() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public US_06_UserPojo getUserPojo() {
        return userPojo;
    }

    public void setUserPojo(US_06_UserPojo userPojo) {
        this.userPojo = userPojo;
    }

    @Override
    public String toString() {
        return "US_06_PatientPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", userPojo=" + userPojo +
                '}';
    }
}