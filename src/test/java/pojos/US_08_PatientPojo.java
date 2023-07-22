package pojos;

public class US_08_PatientPojo {
    private String firstname;
    private String lastname;
    private String gender;
    private US_08_UserPojo userPojo;

    public US_08_PatientPojo(String firstname, String lastname, String gender, US_08_UserPojo userPojo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.userPojo = userPojo;
    }

    public US_08_PatientPojo() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public US_08_UserPojo getUserPojo() {
        return userPojo;
    }

    public void setUserPojo(US_08_UserPojo userPojo) {
        this.userPojo = userPojo;
    }

    @Override
    public String toString() {
        return "US_08_PatientPojo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", userPojo=" + userPojo +
                '}';
    }
}
