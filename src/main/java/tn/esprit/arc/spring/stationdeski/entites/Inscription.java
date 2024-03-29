package tn.esprit.arc.spring.stationdeski.entites;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Inscription")
public class Inscription  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInscription")
    private Integer IdInscription;

    private long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieurs;

    @ManyToOne
    private Cours cours;

    public void setCours(Cours cours) {
    }
}
