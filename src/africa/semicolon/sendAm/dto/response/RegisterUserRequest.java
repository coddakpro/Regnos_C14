package africa.semicolon.sendAm.dto.response;

public class RegisterUserRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String emailAddress;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String setFirstName() {
        return null;
    }

    public String setPhoneNumber() {
        return null;
    }

    public String setLastName() {
        return null;
    }

    public void setEmail(String emailAddress) {

        this.emailAddress = emailAddress;
    }
}
