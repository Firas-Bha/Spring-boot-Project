package tn.esprit.arc.spring.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.arc.spring.stationdeski.entites.Piste;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
    public Piste findByNumPiste(long numPiste);

    @Query("SELECT p FROM Piste p WHERE p.numPiste =:numPiste")
    Piste GetPisteByNum(@Param("numPiste") String numPiste);
}