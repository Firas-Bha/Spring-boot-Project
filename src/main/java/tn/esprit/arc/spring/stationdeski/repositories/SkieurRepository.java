package tn.esprit.arc.spring.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.arc.spring.stationdeski.entites.Abonnement;
import tn.esprit.arc.spring.stationdeski.entites.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Integer> {
    public Skieur findByNumSkieur( Long numSkieur);
 /*   @Query("SELECT s FROM Skieur s WHERE s.numSkieur =:numSkieur")
    Skieur GetSkieurByNum(@Param("numSkieur") String numSkieur);

    @Query("SELECT s FROM Skieur s WHERE s.abonnements =:abonnements")
    Skieur findbyIdAbon(@Param("abonnements") int id);*/

  //  List<Skieur> findByAbonnement(Abonnement abonnement);
}
