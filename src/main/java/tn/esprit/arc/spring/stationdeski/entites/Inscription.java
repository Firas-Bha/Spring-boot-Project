package tn.esprit.arc.spring.stationdeski.entites;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Insrcription")
public class Inscription  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private long numInscription;
    private int numSemaine;
}
