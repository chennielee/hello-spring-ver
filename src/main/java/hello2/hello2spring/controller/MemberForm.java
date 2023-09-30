package hello2.hello2spring.controller;

public class MemberForm { // 서버-클라이언트 끼리 정보 왔다갔다 하는 컨트롤러임. 따라서 , getter . setter 사용해야함
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}