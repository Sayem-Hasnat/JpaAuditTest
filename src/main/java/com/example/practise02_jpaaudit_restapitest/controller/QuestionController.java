package com.example.practise02_jpaaudit_restapitest.controller;

import com.example.practise02_jpaaudit_restapitest.entity.Question;
import com.example.practise02_jpaaudit_restapitest.exception.ResourceNotFoundException;
import com.example.practise02_jpaaudit_restapitest.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepo;

    @GetMapping("/questions")
    public Page<Question> getQuestions(Pageable pageable) {
        return questionRepo.findAll(pageable);
    }

    @PostMapping("/questions")
    public Question createQuestion(@Valid @RequestBody Question question) {
        return questionRepo.save(question);
    }

    @PutMapping("/questions/{questionId}")
    public Question updateQuestion(@PathVariable Long questionId,
                                   @Valid @RequestBody Question questionRequest) {




        return questionRepo.findById(questionId).map(question -> {
                    question.setTitle(questionRequest.getTitle());
                    question.setDescription(questionRequest.getDescription());
                    return questionRepo.save(question);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));


    }

    @DeleteMapping("/questions/{questionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
        return questionRepo.findById(questionId)
                .map(question -> {
                    questionRepo.delete(question);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }

}
