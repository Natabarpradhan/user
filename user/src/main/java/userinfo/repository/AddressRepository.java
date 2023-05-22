package userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import userinfo.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
