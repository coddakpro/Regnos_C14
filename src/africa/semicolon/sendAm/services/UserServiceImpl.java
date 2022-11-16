package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.Controllers.FindUserResponse;
import africa.semicolon.sendAm.dto.request.RegisterUserResponse;
import africa.semicolon.sendAm.dto.response.RegisterUserRequest;

public class UserServiceImpl implements UserService {
    @Override
    public RegisterUserResponse register(RegisterUserRequest requestForm) {
        User setLastName = new User();
        RegisterUserRequest set = new RegisterUserRequest();
        set.setEmail(requestForm.getEmailAddress());
        set.setAddress(requestForm.getAddress());
        set.setEmailAddress(requestForm.getEmailAddress());
        set.setPhoneNumber(requestForm.setPhoneNumber());
        set.setFirstName(requestForm.setFirstName());
        set.setLastName(requestForm.setLastName());
        return null;
    }

    @Override
    public FindUserResponse findUserByEmail(String email) {
        return null;
    }


}
