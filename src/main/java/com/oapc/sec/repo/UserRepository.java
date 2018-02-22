package com.oapc.sec.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oapc.sec.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}

