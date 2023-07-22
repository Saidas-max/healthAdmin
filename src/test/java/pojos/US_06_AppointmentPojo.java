package pojos;


//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_06_AppointmentPojo {
    private int id;
    private String status;
    private US_06_PatientPojo patientPojo;

    public US_06_AppointmentPojo(int id, String status, US_06_PatientPojo patientPojo) {
        this.id = id;
        this.status = status;
        this.patientPojo = patientPojo;
    }

    public US_06_AppointmentPojo() {
    }

    public int getId() {
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

    public US_06_PatientPojo getPatientPojo() {
        return patientPojo;
    }

    public void setPatientPojo(US_06_PatientPojo patientPojo) {
        this.patientPojo = patientPojo;
    }

    @Override
    public String toString() {
        return "US_06_AppointmentPojo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", patientPojo=" + patientPojo +
                '}';
    }
}
