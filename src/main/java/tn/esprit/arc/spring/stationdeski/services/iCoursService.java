package tn.esprit.arc.spring.stationdeski.services;

import tn.esprit.arc.spring.stationdeski.entites.Cours;

import java.util.List;

public interface iCoursService {

    List<Cours> retrieveAllCours();

    Cours addCours(Cours c);

    Cours updateCours (Cours c);

    Cours retrieveCours (Integer idCours);

    void deleteCours( Integer idCours);
}

