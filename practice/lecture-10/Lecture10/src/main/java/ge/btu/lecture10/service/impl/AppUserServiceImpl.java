package ge.btu.lecture10.service.impl;

import ge.btu.lecture10.DTO.appUser.AddUserInput;
import ge.btu.lecture10.DTO.appUser.AddUserOutput;
import ge.btu.lecture10.DTO.role.RoleDTO;
import ge.btu.lecture10.model.AppUser;
import ge.btu.lecture10.model.Role;
import ge.btu.lecture10.repository.AppUserRepository;
import ge.btu.lecture10.repository.RoleRepository;
import ge.btu.lecture10.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public AddUserOutput addUser(AddUserInput addUserInput) {
        AppUser appUser = new AppUser();
        appUser.setUsername(addUserInput.getUsername());
        appUser.setPassword(encoder.encode(addUserInput.getPassword())); // პაროლის შიფრაცია

        // როლების მინიჭება იუზერისთვის
        List<Role> roles = new ArrayList<>();
        for (RoleDTO roleDTO : addUserInput.getRoles()) {
            Role role=roleRepository.getOne(roleDTO.getId()); // აქ შეიძლება როლითაც მოიძებნოს
            roles.add(role);
        }
        appUser.setRoles(roles);

        appUserRepository.save(appUser);
        AddUserOutput addUserOutput = new AddUserOutput();
        addUserOutput.setMsg("იუზერი წარმატებით დაემატა");
        return addUserOutput;
    }
}