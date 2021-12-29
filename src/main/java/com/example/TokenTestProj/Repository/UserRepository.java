package com.example.TokenTestProj.Repository;

import com.example.TokenTestProj.Model.Role;
import com.example.TokenTestProj.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);

}
