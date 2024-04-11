package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
    // 경로로 요청이 들어온 경우 Hello 라는 문자열이 반환되도록 작성했다.

    @RequestMapping("/bye")
    public String bye(){
        return "backend.html";
    }

}
