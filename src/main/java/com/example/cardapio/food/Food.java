package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name ="foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of ="id")

public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // identificar que ela representa o id e é gerada automaticamente
    private String title;
    private String image; // url
    private Integer price;

    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}