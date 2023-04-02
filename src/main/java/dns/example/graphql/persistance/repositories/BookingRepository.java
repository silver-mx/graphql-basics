package dns.example.graphql.persistance.repositories;

import dns.example.graphql.persistance.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
