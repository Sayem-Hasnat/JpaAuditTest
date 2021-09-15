package com.example.practise02_jpaaudit_restapitest.repository;

import com.example.practise02_jpaaudit_restapitest.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {

    List<Answer> findByQuestionId(Long questionId);
}
