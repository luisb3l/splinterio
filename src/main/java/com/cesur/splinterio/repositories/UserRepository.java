package com.cesur.splinterio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cesur.splinterio.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
