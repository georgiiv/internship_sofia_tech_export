package intBlog.repository;

import intBlog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User  findByEmail(String email);
}

