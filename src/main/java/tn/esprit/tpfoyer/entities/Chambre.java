package tn.esprit.tpfoyer.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour quelle incremente dans la base de données
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING) //for any enumeration this must be added , so twali enregistre string moch int
    TypeChambre typeC;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    Bloc b;
    //@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations = new HashSet<>();

}
