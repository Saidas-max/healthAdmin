package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US20_StaffPojo {

    private String firstName;
    private String lastName;
    private String phone;
    private String ssn;
    private Integer id;
    private US20_User_innerPojo user;

    public US20_StaffPojo(String firstName, String lastName, String phone, String ssn, US20_User_innerPojo user, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.ssn = ssn;
        this.user = user;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public US20_StaffPojo() {
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public US20_User_innerPojo getUser() {
        return user;
    }

    public void setUser(US20_User_innerPojo user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "US20_StaffPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", id=" + id +
                ", user=" + user +
                '}';
    }
}
