package tn.esprit.tpfoyer.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour quelle incremente dans la base de données
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    @ToString.Exclude
    @JsonIgnore
    @OneToOne(mappedBy = "foyer")
    Universite universite;
    @OneToMany(mappedBy = "f")
    @ToString.Exclude
    @JsonIgnore
    Set<Bloc>blocs=new HashSet<Bloc>();

}

