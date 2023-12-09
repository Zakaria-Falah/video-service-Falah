package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor

@Builder
@Entity
@Data
public class Video {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  Long id ;
    public String name,url,description,datepublication;
    @ManyToOne
 private   Creator c ;
}
