package uz.myproduct.appuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.myproduct.appuser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
