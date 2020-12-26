package guru.springframework.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Data generates Gatters and setters, tostring ,
// and hashCode
@Data
public class User {

    @Id
    private Long id;
    private String firstName;
    private String email;
}
