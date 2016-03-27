package uk.org.hexsaw.logactaeasque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uk.org.hexsaw.logactaeasque.uk.org.hexsaw.logactaesque.model.Rollable;
import uk.org.hexsaw.logactaeasque.uk.org.hexsaw.logactaesque.model.SevenSidedDice;

@SpringBootApplication
public class DiceConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(DiceConfiguration.class, args);
    }

    @Bean(name="sevenSidedDice")
    public Rollable sevenSidedDice() {
        return new SevenSidedDice();
    }

}
