package ma.projet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entities.Compte;
import ma.projet.grpc.stubs.TypeCompte;

public interface CompteRepository extends JpaRepository<Compte, String> {
    // Méthode pour trouver des comptes par type
    List<Compte> findByType(TypeCompte type);

    // Méthode pour supprimer un compte par son identifiant
    void deleteById(String id);

}
