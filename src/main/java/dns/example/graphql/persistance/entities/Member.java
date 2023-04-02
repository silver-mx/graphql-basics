package dns.example.graphql.persistance.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.time.Instant;

@Entity
@Table(name = "members")
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Jacksonized
public class Member {

    @Id
    @Column(name = "memid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String surname;
    private String firstname;
    private String address;
    private Integer zipcode;
    private String telephone;
    @Column(name = "recommendedby")
    private Integer recommendedBy;
    @Column(name = "joindate")
    private Instant joinDate;
}
