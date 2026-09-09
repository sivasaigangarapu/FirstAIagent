package Spring_AI.practice.Service;

import Spring_AI.practice.Model.ExplanationRequest;
import Spring_AI.practice.Model.ExplanationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
//argumented
@RequiredArgsConstructor
public class ExplanationService {
    private final ChatClient.Builder chatbuilder;
   //class ir responsible for request and response validation
    public ExplanationResponse explainservice(ExplanationRequest request) {
        ChatClient chatClient = chatbuilder.build();

        String result = chatClient
                .prompt()
                .system("Act like java mentor and explain the input provided")
                .user("Explain this code:\n\n" + request.getCode() + "")
                .call()
                .content();

        return ExplanationResponse.builder()
                .response(result)
                .build();
    }
}
