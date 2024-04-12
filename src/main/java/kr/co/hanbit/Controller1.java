package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {

    @RequestMapping("/article")
    public String createArticle(
            @RequestParam("title") String title,
            @RequestParam("content") String content


    ) {
        return String.format("%s / %s", title, content);
    }
    // 경로로 요청이 들어온 경우 Hello 라는 문자열이 반환되도록 작성했다.

    @RequestMapping("/bye")
    public String bye(){
        return "backend.html";
    }

}

/* URL 을 통한 접속은 "GET" method 를 사용한다.

- form 태그를 이용하는 접속 "POST" 메소드/ GET 도 가능) 를 사용한다. (ID/PW 입력 로그인 창)

- XHR 을 사용한 AJAX 요청 (새로고침 없이 서버와 통신이 가능) * 위에 2 방식은 새로고침 필요

- 위에 3개는 전부 "클라이언트만 정보 교환 시작 가능" => "웹 소켓 : 양방향 시작 가능 "
 */
