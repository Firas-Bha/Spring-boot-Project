package tn.esprit.arc.spring.stationdeski.services;

import tn.esprit.arc.spring.stationdeski.entites.Moniteur;

import java.util.List;

public interface iMoniteurService {

    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Integer idMoniteur);

    void deleteMoniteur( Integer idMoniteur);
}
