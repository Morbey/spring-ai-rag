package guru.springframework.springairag.controller;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import guru.springframework.springairag.service.OpenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    @PostMapping("/question")
    public Answer getAnswer(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
