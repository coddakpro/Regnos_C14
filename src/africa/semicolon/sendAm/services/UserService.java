package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.Controllers.FindUserResponse;
import africa.semicolon.sendAm.dto.request.RegisterUserResponse;
import africa.semicolon.sendAm.dto.response.RegisterUserRequest;

public interface UserService {
    RegisterUserResponse register(RegisterUserRequest requestForm);

    FindUserResponse findUserByEmail(String email);
}
