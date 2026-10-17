package tn.esprit.tpautoloc.service;

import java.util.List;
import tn.esprit.tpautoloc.domain.Vehicule;

public interface IVehiculeService {

    Vehicule create(Vehicule entite);

    Vehicule findById(Long id);

    List<Vehicule> findAll();

    Vehicule update(Long id, Vehicule entite);

    void deleteById(Long id);
}