package tn.esprit.arc.spring.stationdeski.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private  long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @ManyToMany
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skieurs")
    private Set<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnements;

}
