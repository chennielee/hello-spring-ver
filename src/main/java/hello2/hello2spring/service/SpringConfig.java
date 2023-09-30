package hello2.hello2spring.service;

import hello2.hello2spring.repository.MemberRepository;
import hello2.hello2spring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());  //스프링 빈에 등록할 객체 생성해서 반환
    }
    @Bean // 위의 memberservice 객체를 만들기 위해 필요한 객체인 memberRepository 객체 생성
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
