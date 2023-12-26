package dao.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
    private int id_book;
    private String titre;
    private String publisher;
    private Date datePublication;
    private float price;
    private String resume;
}
