package ge.btu.lecture10.controller;

import ge.btu.lecture10.DTO.role.AddRoleInput;
import ge.btu.lecture10.DTO.role.AddRoleOutput;
import ge.btu.lecture10.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/RoleController")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("addRole")
    public AddRoleOutput addRole(@RequestBody AddRoleInput addRoleInput) {
        return roleService.addRole(addRoleInput);
    }
}