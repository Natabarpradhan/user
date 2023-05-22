package userinfo.payload;

import lombok.Data;
import userinfo.entity.Address;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private Address address;


}
