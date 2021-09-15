package com.example.practise02_jpaaudit_restapitest.controller;

import com.example.practise02_jpaaudit_restapitest.entity.Answer;
import com.example.practise02_jpaaudit_restapitest.repository.AnswerRepository;
import com.example.practise02_jpaaudit_restapitest.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepo;
    @Autowired
    private QuestionRepository questionRepo;

@GetMapping("/questions/{questionId}/answers")
    public List<Answer> getAnswersByQuestionId(@PathVariable Long questionId) {
        return answerRepo.findByQuestionId(questionId);
    }



}
