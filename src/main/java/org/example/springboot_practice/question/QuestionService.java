package org.example.springboot_practice.question;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

import org.example.springboot_practice.DataNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> Question = this.questionRepository.findById(id);
        if(Question.isPresent()) {
            return Question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }
}
