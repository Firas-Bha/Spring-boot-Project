package tn.esprit.arc.spring.stationdeski.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

    @OneToMany
    private Set<Cours> cours;
}
