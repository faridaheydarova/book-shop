package az.developia.spring_book_shop_farida.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
@Id
@GeneratedValue
private Long id;
private String name;
private String username;
private String password;



}
