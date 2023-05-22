package userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import userinfo.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
