package az.developia.spring_book_shop_farida.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class BookEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String username;
}
