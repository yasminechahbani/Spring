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


public class Reservation {
    @Id
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;
    @JsonIgnore
    @ToString.Exclude
    @ManyToMany
    Set<Etudiant> etudiants = new HashSet<Etudiant>();



}
