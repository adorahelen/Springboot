package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerError {
    @RequestMapping ("/throwServerError")
    public void ThrowSeverError() {
        throw new RuntimeException();
    }

}
