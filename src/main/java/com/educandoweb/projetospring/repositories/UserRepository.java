package com.educandoweb.projetospring.repositories;

import com.educandoweb.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
