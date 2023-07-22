@Appointment_Get_Request
Feature: Appointment_Get_Request

  Scenario:TC_12_Verify Appointment by sending get request
    Given user set the urlYA
    When user send GET request to see the appointmentYA
    Then verify HTTP Status is 200 YA
    Then verify user get the appointment data as expectedYA


