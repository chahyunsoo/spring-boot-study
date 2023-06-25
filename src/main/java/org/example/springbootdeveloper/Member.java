package org.example.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)  //기본 생성자
@AllArgsConstructor
@Getter
@Entity //엔티티로 지정

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //primary key 자동으로 1씩 증가
    @Column(name = "id",updatable = false)
    private Long id; //DB 테이블, 'id' column

    @Column(name = "name",nullable = false)  //'name' 이라는 not null 컬럼과 mapping
    private String name; //DB 테이블, 'name' column

}
