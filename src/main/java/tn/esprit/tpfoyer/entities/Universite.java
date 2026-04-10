package tn.esprit.tpfoyer.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour quelle incremente dans la base de données
    long idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne
    @JsonIgnore
    foyer foyer;
}
