package com.example.springSecurity.learnSec.Repo;

import com.example.springSecurity.learnSec.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<user, Integer> {

    user findByname(String name);

}
