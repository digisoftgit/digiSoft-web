package com.digisoft.com.digisoftitweb.security.repository;


import com.digisoft.com.digisoftitweb.security.entity.webuser.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WebUserRepository extends JpaRepository<WebUser,Long> {

    Optional<WebUser> findByEmail(String email);
    Boolean existsByEmail(String email);

}
