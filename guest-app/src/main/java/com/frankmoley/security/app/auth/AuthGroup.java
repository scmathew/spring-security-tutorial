package com.frankmoley.security.app.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_USER_GROUP")
@Getter
@Setter
@ToString
public class AuthGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AUTH_USER_GROUP_ID")
    private long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "AUTH_GROUP")
    private String authGroup;
}
