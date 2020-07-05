package ge.btu.lecture10.service;

import ge.btu.lecture10.DTO.appUser.AddUserInput;
import ge.btu.lecture10.DTO.appUser.AddUserOutput;

public interface AppUserService {
    AddUserOutput addUser(AddUserInput addUserInput);
}