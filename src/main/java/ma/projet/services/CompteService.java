package ma.projet.services;

import java.util.List;

import ma.projet.entities.Compte;
import ma.projet.repositories.CompteRepository;
import ma.projet.grpc.stubs.TypeCompte;

public class CompteService {

	private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }

    public List<Compte> findComptesByType(TypeCompte type) {
        return compteRepository.findByType(type);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }
}
