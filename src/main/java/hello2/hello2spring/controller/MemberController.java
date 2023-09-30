package hello2.hello2spring.controller;

import hello2.hello2spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //컨트롤러 annotation 이 있을 경우 해당 객체를 생성해서 스프링에서 관리를 한다.=> 스프링 컨테이너에서 스프링 빈이 관리된다. 라고 표현함
public class MemberController {
    // 객체를 new  하면 계속 객체를 만드는거라 비효율적임. => spring 컨테이너에 등록해놓고 재사용가능
    private final MemberService memberService;
    @Autowired   // "생성자" 에 AutoWired 라는 어노테이션이 붙어있을 시 스프링 컨테이너에 있는 객체를 가져다가 연결해줌.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}