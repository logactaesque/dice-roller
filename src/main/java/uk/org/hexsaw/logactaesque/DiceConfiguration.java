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

    @Bean(name = "greenDice")
    public Rollable greenDice() {
        return new Dice(new Integer[]{0, 1, 2, 3, 4, 5});
    }

    @Bean(name = "yellowDice")
    public Rollable yellowDice() {
        return new Dice(new Integer[]{0, 0, 1, 1, 1, 2});
    }

    @Bean(name = "brownDice")
    public Rollable brownDice() {
        return new Dice(new Integer[]{0, 1, 1, 2, 4, 5});
    }

    @Bean(name = "blueDice")
    public Rollable blueDice() {
        return new Dice(new Integer[]{0, 1, 1, 2, 3, 4});
    }

    @Bean(name = "greyDice")
    public Rollable greyDice() {
        return new Dice(new Integer[]{0, 0, 1, 1, 2, 3});
    }

    @Bean(name = "redDice")
    public Rollable redDice() {
        return new Dice(new Integer[]{0, 1, 1, 2, 2, 3});
    }

    @Bean(name = "blackDice")
    public Rollable blackDice() {
        return new Dice(new Integer[]{0, 0, 2, 2, 2, 3});
    }

}
