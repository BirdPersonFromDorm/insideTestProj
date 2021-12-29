package com.example.TokenTestProj.Repository;

import com.example.TokenTestProj.Model.MessageBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageBoxRepository extends JpaRepository<MessageBox, Integer> {

}
