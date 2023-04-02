package tn.esprit.arc.spring.stationdeski.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.arc.spring.stationdeski.entites.Abonnement;
import tn.esprit.arc.spring.stationdeski.entites.TypeAbonnement;

import java.util.Set;


public interface AbonnementRepository extends CrudRepository<Abonnement,Integer> {
    @Query("SELECT a FROM Abonnement a WHERE a.typeAbon =:typeAbon")
    Set<Abonnement> getAbonByType(@Param("typeAbon") TypeAbonnement typeAbon);
}
