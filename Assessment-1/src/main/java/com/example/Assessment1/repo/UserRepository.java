package com.example.Assessment1.repo;

import com.example.Assessment1.dto.UserDTO;
import com.example.Assessment1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT u.username, tm.userType FROM users u INNER JOIN type_master tm ON u.userType_id = tm.id WHERE u.active = true", nativeQuery = true)
    List<UserDTO> findAllActiveUsers();
}
