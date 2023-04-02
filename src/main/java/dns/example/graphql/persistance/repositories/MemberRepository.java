package dns.example.graphql.persistance.repositories;

import dns.example.graphql.persistance.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
