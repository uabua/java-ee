package ge.btu.lecture10.service;

import ge.btu.lecture10.DTO.role.AddRoleInput;
import ge.btu.lecture10.DTO.role.AddRoleOutput;

public interface RoleService {
    AddRoleOutput addRole(AddRoleInput addRoleInput);
}
