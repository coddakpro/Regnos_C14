package africa.semicolon.sendAm.Controllers;

import africa.semicolon.sendAm.dto.request.RegisterUserResponse;
import africa.semicolon.sendAm.dto.response.RegisterUserRequest;
import africa.semicolon.sendAm.services.UserService;
import africa.semicolon.sendAm.services.UserServiceImpl;

public class UserControllers {
    @RequestMapping()
    @RestController
    public static class UserController {
        private final UserService userService = new UserServiceImpl();
        private final Object String;

        public UserController(Object string, Object string1) {
            String = string1;

        }


        @PostMapping()
        public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest registerUserRequest) {
            RegisterUserRequest request = new RegisterUserRequest();
            return userService.register(request);
        }

        @GetMapping()
        public FindUserResponse getUserByEmail(@RequestBody FindUserResponse findUserResponse) {
            return getUserByEmail((java.lang.String) String);
        }

        @GetMapping()
        public FindUserResponse getUserByEmail(@PathVariable  String email) {
            return userService.findUserByEmail(email); }
    }
}
