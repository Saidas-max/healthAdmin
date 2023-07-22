@08AppointmentApiGet
Feature:Appointment Api Test
  Scenario: TC_03 Get Request
    Given User set the urlHA
    When Send a get request to get patient appointmentHA
    Then verify HTTP Status Code is 200 HA
    Then verify user get the appointment data as expectedHA
