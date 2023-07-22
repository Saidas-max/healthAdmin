package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


public class US_10APIpojo {

    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;

    public US_10APIpojo(String login, String firstName, String lastName, String ssn, String email) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
    }

    public US_10APIpojo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "US_10APIpojo{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*
    {
        "id": 8503,
            "login": "sabiradil",
            "firstName": "Sabir",
            "lastName": "Adil",
            "ssn": "301-20-3030",
            "email": "sabiradil@gmail.com",


            "imageUrl": null,
            "activated": false,
            "langKey": null,
            "createdBy": null,
            "createdDate": null,
            "lastModifiedBy": null,
            "lastModifiedDate": null,
            "authorities": null
    }
*/

}
