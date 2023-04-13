package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // конструкторы, геттеры и сеттеры
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")

public class Order {
    // Заказ
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Address")
    private String address;
    @Column(name = "Pizza")
    private String pizza;
    @Column(name = "PizzaPhoto")
    private String pizzaPhoto;
}
