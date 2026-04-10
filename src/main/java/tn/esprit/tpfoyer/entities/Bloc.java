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

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour quelle incremente dans la base de données
    long idBloc;
    String nomBloc;
    long capaciteBloc;
    @ManyToOne(cascade = CascadeType.ALL)
    //@JsonIgnore
    foyer f;
    @ToString.Exclude
    @OneToMany(mappedBy = "b")
    @JsonIgnore
    Set<Chambre>chambres=new HashSet<>();

}
