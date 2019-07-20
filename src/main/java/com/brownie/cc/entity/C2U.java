package com.brownie.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="c2u")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class C2U implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c2u_id")
    private long c2uId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "profile_image")
    private String profileImage;
}
