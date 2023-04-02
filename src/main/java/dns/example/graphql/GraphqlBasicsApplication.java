package dns.example.graphql;

import dns.example.graphql.persistance.repositories.BookingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlBasicsApplication.class, args);
    }

    @Bean
    public CommandLineRunner testData(BookingRepository bookingRepository) {
        return (args) -> {
            bookingRepository.findAll().forEach(booking ->
                    System.out.println("booking = " + booking));
        };
    }

}
