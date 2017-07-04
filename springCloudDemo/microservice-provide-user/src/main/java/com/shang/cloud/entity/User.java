package com.shang.cloud.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Think on 2017/5/30.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @lombok.Setter
    @lombok.Getter
    private Long id;

    @Column
    @lombok.Setter
    @lombok.Getter
    @Size(max = 30, min = 6, message = "用户名长度必须大于6，小于30")
    private String username;

    @Column
    @lombok.Setter
    @lombok.Getter
    private String name;

    @Column
    @lombok.Setter
    @lombok.Getter
    private Short age;

    @Column
    @lombok.Setter
    @lombok.Getter
    private BigDecimal balance;

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }


}
