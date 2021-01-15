package com.frankmoley.security.app.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Frank P. Moley III.
 */
@Getter
@Setter
public class Guest {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;
}
