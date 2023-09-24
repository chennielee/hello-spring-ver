package hello2.hello2spring.domain;

public class Member {
    private Long id; // 회원이 작성한 정보가 아니라 컴퓨터가 자체적으로 부여한 고유값
    private String name;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
