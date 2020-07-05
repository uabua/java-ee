package ge.btu.lecture10.service.impl;

import ge.btu.lecture10.DTO.role.AddRoleInput;
import ge.btu.lecture10.DTO.role.AddRoleOutput;
import ge.btu.lecture10.model.Role;
import ge.btu.lecture10.repository.RoleRepository;
import ge.btu.lecture10.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public AddRoleOutput addRole(AddRoleInput addRoleInput) {
        Role role = new Role();
        role.setName(addRoleInput.getName());
        roleRepository.save(role);
        AddRoleOutput addRoleOutput=new AddRoleOutput();
        addRoleOutput.setMsg("როლი წარმატებით დაემატა");
        return addRoleOutput;
    }
}
