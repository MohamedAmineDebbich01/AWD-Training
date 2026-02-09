package esprit.candidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/candidature")
public class CandidatureResApi {
    @GetMapping
    public String sayhello(){
        return "Hello mic3";
    }
}
