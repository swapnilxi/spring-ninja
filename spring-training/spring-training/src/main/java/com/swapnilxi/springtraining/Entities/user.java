package com.swapnilxi.springtraining.Entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

public class user {

@Data
@Entity(name = "USER")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "ID")
  private Long id;
  @Column(name = "USER_NAME")
  private String userName;
  //@JsonIgnore
  @Column(name = "PASSWORD")
  private String password;
//   @Temporal(value = TemporalType.TIMESTAMP)
//   @Column(name = "CREATED_TIME")
//   private Date creationTime;
//   @Temporal(value = TemporalType.TIMESTAMP)
//   @Column(name = "UPDATED_TIME")
//   private Date updatedTime;
//   @Temporal(value = TemporalType.DATE)
//   @Column(name = "DOB")
//   private Date dateofBirth;
//   @Enumerated(value = EnumType.STRING)
//   @Column(name = "USER_TYPE")
//   private UserType userType;
//   @Transient
//   private String dateOfBirthString;
//         // Setters and Getters
}
    
}
