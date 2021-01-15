package com.frankmoley.security.app.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name="USER_ID")
    private long id;

    @Column(name="USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;
}
