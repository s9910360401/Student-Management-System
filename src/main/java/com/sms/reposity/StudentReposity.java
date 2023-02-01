package com.sms.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.Student;

@Repository
public interface StudentReposity extends JpaRepository<Student, Integer>{

}
