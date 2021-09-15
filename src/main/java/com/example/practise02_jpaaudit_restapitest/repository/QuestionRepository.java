package com.example.practise02_jpaaudit_restapitest.repository;

import com.example.practise02_jpaaudit_restapitest.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

}
