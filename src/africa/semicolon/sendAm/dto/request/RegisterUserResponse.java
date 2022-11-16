package africa.semicolon.sendAm.dto.request;

import africa.semicolon.sendAm.dto.response.RegisterUserRequest;
import africa.semicolon.sendAm.services.User;

public class RegisterUserResponse {
    public void register(RegisterUserRequest requestForm) {
        String email = requestForm.getEmailAddress();
        User user = new User();
    }
}
