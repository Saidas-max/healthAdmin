package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_06_UserPojo {
    private String login;
    private String ssn;

    public US_06_UserPojo(String login, String ssn) {
        this.login = login;
        this.ssn = ssn;
    }

    public US_06_UserPojo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_06_UserPojo{" +
                "login='" + login + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}