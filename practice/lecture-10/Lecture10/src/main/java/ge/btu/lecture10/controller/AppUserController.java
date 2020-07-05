package ge.btu.lecture10.controller;

import ge.btu.lecture10.DTO.appUser.AddUserInput;
import ge.btu.lecture10.DTO.appUser.AddUserOutput;
import ge.btu.lecture10.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/AppUserController")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    @PostMapping("addUser")
    public AddUserOutput addUser(@RequestBody AddUserInput addUserInput) {
        return appUserService.addUser(addUserInput);
    }
}