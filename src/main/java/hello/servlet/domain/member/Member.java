package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id; //식별자 id 값
    private String username;
    private int age;


    //기본생성자
    public Member() {
    }

    //username,age를 가지는 생성자를 만듦
    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
