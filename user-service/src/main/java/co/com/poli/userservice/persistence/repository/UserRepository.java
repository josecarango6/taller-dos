package co.com.poli.userservice.persistence.repository;

import co.com.poli.userservice.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
