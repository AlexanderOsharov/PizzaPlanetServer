package model;

import lombok.*;

import javax.persistence.*;

@Data // конструкторы, геттеры и сеттеры
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity // таблица, столбцы - поля
@Table(name = "Users")

public class User {
    // Пользователь
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // стратегия генерации
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Photo")
    private String photoUrl;
}