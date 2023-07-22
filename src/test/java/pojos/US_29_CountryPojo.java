package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_29_CountryPojo {
    private int id;
    private String name;

    public US_29_CountryPojo(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public US_29_CountryPojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "US_29_CountryPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
