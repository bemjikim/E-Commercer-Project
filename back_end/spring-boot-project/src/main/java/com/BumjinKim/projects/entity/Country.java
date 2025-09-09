package com.BumjinKim.projects.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="country")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name="name")
    private String name;

    // TODO: Set up one-to-many with states
    @OneToMany(mappedBy = "country")
    // 직렬화 시 해당 필드를 포함시키고 싶지 않을 때 선언하는 어노테이션 -> 불필요한 state의 출력을 자제시킴
    @JsonIgnore
    private List<State> states;

}
