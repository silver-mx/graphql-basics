package dns.example.graphql.persistance.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

@Entity
@Table(name = "facilities")
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Jacksonized
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "facid")
    private Integer id;

    private String name;
    @Column(name = "membercost")
    private BigDecimal memberCost;
    @Column(name = "guestcost")
    private BigDecimal guestCost;
    @Column(name = "initialoutlay")
    private BigDecimal initialOutlay;
    @Column(name = "monthlymaintenance")
    private BigDecimal monthlyMaintenance;

}
