package com.example.demo.sts.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {


}