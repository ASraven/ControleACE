package service.dtos;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private Date datePublication;
    private float price;
    private String resume;

}
