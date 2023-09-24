package hello2.hello2spring.repository;

import hello2.hello2spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);  // 가지고 오려는데 값이 null 일떄, null 을 반환하지 않고 optional 로 감싸서 반환한다.
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 지금까지 저장된 파일의 리스트들을 전부 반환한다.
}
