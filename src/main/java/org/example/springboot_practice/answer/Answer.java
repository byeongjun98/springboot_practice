package org.example.springboot_practice.answer;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.springboot_practice.question.Question;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @ManyToOne
    private Question question;
}
