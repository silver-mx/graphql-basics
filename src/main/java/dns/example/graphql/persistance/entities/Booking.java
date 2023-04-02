package dns.example.graphql.persistance.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.time.Instant;

@Entity
@Table(name = "bookings")
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Jacksonized
public class Booking {

    @Id
    @Column(name = "bookid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facid", referencedColumnName = "facid")
    private Facility facility;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memid", referencedColumnName = "memid")
    private Member member;

    @Column(name = "starttime")
    private Instant startTime;

    private Integer slots;
}
