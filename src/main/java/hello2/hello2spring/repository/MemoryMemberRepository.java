package hello2.hello2spring.repository;

import hello2.hello2spring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements  MemberRepository{

    private static Map<Long, Member> store = new HashMap<>(); // 회원정보를 private 으로 저장해놓기
    private static long sequence = 0L; // 키값을 임의로 생성하는 코드 ( 동시성 문제 고려하지 않음 )

    @Override
    public Member save(Member member) { // 회원정보를 저장하는 부분.
        member.setId(++sequence); // member 객체에 id 속성 부여
        store.put(member.getId(), member); //store 속성을 적용해서 member id 를 저장
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // 아이디로 회원찾기. 만약 아이디가 null 일때는 optional 로 감싸주기
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream() // 이름으로 찾기. 같은 이름 찾는 순간 (뒤에 더 안찾고) 바로 반환됨
                .filter(member -> member.getName().equals(name))
                .findAny();
    }
    @Override
    public List<Member> findAll() { // List:  실무에서 가장 많이 사용한다. (전체 회원 조회가 가능해서 )
        return new ArrayList<>(store.values());
    }
    public void clearStore() {
        store.clear();
    }
}
