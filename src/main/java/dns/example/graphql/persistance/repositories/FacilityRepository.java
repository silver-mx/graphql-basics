package dns.example.graphql.persistance.repositories;

import dns.example.graphql.persistance.entities.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
}
