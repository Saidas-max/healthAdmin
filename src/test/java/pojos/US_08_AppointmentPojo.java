package pojos;

public class US_08_AppointmentPojo {
    private Integer id;
    private String status;
    private US_08_PatientPojo us_08_patientPojo;

    public US_08_AppointmentPojo(Integer id, String status, US_08_PatientPojo us_08_patientPojo) {
        this.id = id;
        this.status = status;
        this.us_08_patientPojo = us_08_patientPojo;
    }

    public US_08_AppointmentPojo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public US_08_PatientPojo getUs_08_patientPojo() {
        return us_08_patientPojo;
    }

    public void setUs_08_patientPojo(US_08_PatientPojo us_08_patientPojo) {
        this.us_08_patientPojo = us_08_patientPojo;
    }

    @Override
    public String toString() {
        return "US_08_AppointmentPojo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", us_08_patientPojo=" + us_08_patientPojo +
                '}';
    }
}
