package com.example.student.management.stystem.Student.mangament.system.repository;

import com.example.student.management.stystem.Student.mangament.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
