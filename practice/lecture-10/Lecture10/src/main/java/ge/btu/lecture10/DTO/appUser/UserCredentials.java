package ge.btu.lecture10.DTO.appUser;

import lombok.Data;

// მოდელი ავტორიზაციისთვის
@Data
public class UserCredentials {
    private String username;
    private String password;
}
