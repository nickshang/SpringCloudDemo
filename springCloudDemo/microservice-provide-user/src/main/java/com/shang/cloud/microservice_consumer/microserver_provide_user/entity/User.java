package com.shang.cloud.microservice_consumer.microserver_provide_user.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Think on 2017/5/30.
 */
@Entity
//@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @lombok.Setter
//    @lombok.Getter
    private Long id;

    @Column
//    @lombok.Setter
//    @lombok.Getter
    private String username;

    @Column
//    @lombok.Setter
//    @lombok.Getter
    private String name;

    @Column
//    @lombok.Setter
//    @lombok.Getter
    private Short age;

    @Column
//    @lombok.Setter
//    @lombok.Getter
    private BigDecimal balance;

    public User(){
    }

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
