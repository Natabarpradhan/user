package userinfo.service.impl;

import org.springframework.stereotype.Service;
import userinfo.entity.Address;
import userinfo.entity.User;
import userinfo.payload.UserDTO;
import userinfo.repository.AddressRepository;
import userinfo.repository.UserRepository;
import userinfo.service.UserService;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    private AddressRepository addressRepository;

    public UserServiceImpl(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());

        Address address = new Address();
        address.setUser(user);
        user.setAddress(address);
        User savedUser = userRepository.save(user);
UserDTO dto=new UserDTO();
dto.setId(savedUser.getId());
dto.setAddress(savedUser.getAddress());
dto.setUsername(savedUser.getUsername());
return dto;
    }


}