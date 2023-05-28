package com.hexas.goodgoott.question.controller;

import com.hexas.goodgoott.question.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private List<Question> questionList = new ArrayList<>();

    @GetMapping
    public List<Question> getQuestions() {
        return questionList;
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id) {
        return questionList.stream()
                .filter(question -> question.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Question postCreateQuestion(@RequestBody Question question) {
        questionList.add(question);
        return question;
    }

    @PutMapping("/{id}")
    public Question putUpdateQuestion(@PathVariable Long id, @RequestBody Question updatedQuestion) {
        Question question = questionList.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (question != null) {
            question.setTitle(updatedQuestion.getTitle());
            question.setContent(updatedQuestion.getContent());
        }

        return question;
    }

    @DeleteMapping("/{id}")
    public Question deleteQuestionById(@PathVariable Long id) {
        Question question = questionList.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (question != null) {
            questionList.remove(question);
        }

        return question;
    }
}
