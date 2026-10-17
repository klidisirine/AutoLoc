package tn.esprit.tpautoloc.service;

import java.util.List;
import tn.esprit.tpautoloc.domain.Client;

public interface IClientService {

    Client create(Client entite);

    Client findById(Long id);

    List<Client> findAll();

    Client update(Long id, Client entite);

    void deleteById(Long id);
}