package uk.org.hexsaw.logactaesque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uk.org.hexsaw.logactaesque.model.Dice;
import uk.org.hexsaw.logactaesque.model.Rollable;

@SpringBootApplication
public class DiceConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(DiceConfiguration.class, args);
    }

    @Bean(name = "sevenSidedDice")
    public Rollable sevenSidedDice() {
        return new Dice(new Integer[]{0, 1, 2, 3, 4, 5, 6});
    }

}
