package uz.myproduct.appuser.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.boot.context.properties.bind.Name;

import javax.persistence.*;

@Entity(name = "myUser")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
}
