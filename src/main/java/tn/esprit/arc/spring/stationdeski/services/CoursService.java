package tn.esprit.arc.spring.stationdeski.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arc.spring.stationdeski.entites.Cours;
import tn.esprit.arc.spring.stationdeski.entites.Skieur;
import tn.esprit.arc.spring.stationdeski.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursService implements  iCoursService {

    CoursRepository coursRepository;

    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours c) {
        coursRepository.save( c);
        return c;
    }

    @Override
    public Cours updateCours(Cours c) {
        coursRepository.save(c);
        return c;
    }

    @Override
    public Cours retrieveCours(Integer idCours) {
        return coursRepository.findById(idCours).get();

    }

    @Override
    public void deleteCours(Integer idCours) {
        coursRepository.deleteById(idCours);

    }
}
