package ge.btu.lecture10.DTO.appUser;

import ge.btu.lecture10.DTO.role.RoleDTO;
import lombok.Data;

import java.util.List;

@Data
public class AddUserInput {
    private String username;
    private String password;
    private List<RoleDTO> roles;
}