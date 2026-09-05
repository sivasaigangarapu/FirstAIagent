package Spring_AI.practice.Controller;


import Spring_AI.practice.Model.ExplanationRequest;
import Spring_AI.practice.Model.ExplanationResponse;
import Spring_AI.practice.Service.ExplanationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExplanationController {




        private final ExplanationService explainService;

        @PostMapping("/explain")
        public ResponseEntity<ExplanationResponse> explain(@RequestBody ExplanationRequest request) {
            return ResponseEntity.ok(explainService.explainservice(request));
        }
    }

