package kr.co.hanbit;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class RedirectFor301 {

    @RequestMapping("redirectfor301") // URL 경로 설정
    public ResponseEntity redirectdffffffffor301() { // 함수 이름이라 동일 하지 않아도 작동함
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/targetOfRedirect")); // 이동시킬 URL 경로

        return new ResponseEntity(headers, HttpStatus.MOVED_PERMANENTLY);
    }


    @RequestMapping("/targetOfRedirect") // 이동시킬 URL 경로 " " 로 지정
    public String targetOfRedirddddddddect() { // 이동하게 되면 실행시킬 함수
        return "This is Redirect!!!!!!!!"; // 출력 할 내용
    }

}
