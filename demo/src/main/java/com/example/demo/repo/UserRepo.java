package com.example.demo.repo;

import com.example.demo.model.Userc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Userc,Integer> {
}