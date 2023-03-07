package tn.esprit.arc.spring.stationdeski.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMoniteur")
    private Integer IdMoniteur;
    @Column(name = "numMoniteur")
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

    @OneToMany
    private Set<Cours> cours;



}
