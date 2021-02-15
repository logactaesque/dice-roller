package uk.org.hexsaw.logactaesque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.org.hexsaw.logactaesque.model.DiceRoll;
import uk.org.hexsaw.logactaesque.model.Rollable;

@Controller
public class DiceController {

    @Autowired(required = true)
    private Rollable greenDice;

    @Autowired(required = true)
    private Rollable yellowDice;

    @Autowired(required = true)
    private Rollable brownDice;

    @Autowired(required = true)
    private Rollable blueDice;

    @Autowired(required = true)
    private Rollable greyDice;

    @Autowired(required = true)
    private Rollable redDice;

    @Autowired(required = true)
    private Rollable blackDice;

    @GetMapping("/dice/yellow/roll")
    public @ResponseBody DiceRoll yellowDiceRoll() {
        return DiceRoll.invoke("Yellow", yellowDice.roll());
    }

    @GetMapping("/dice/green/roll")
    public @ResponseBody DiceRoll greenDiceRoll() {
        return DiceRoll.invoke("Green", greenDice.roll());
    }

    @GetMapping("/dice/brown/roll")
    public @ResponseBody DiceRoll brownDiceRoll() {
        return DiceRoll.invoke("Brown", brownDice.roll());
    }

    @GetMapping("/dice/blue/roll")
    public @ResponseBody DiceRoll blueDiceRoll() {
        return DiceRoll.invoke("Blue", blueDice.roll());
    }

    @GetMapping("/dice/grey/roll")
    public @ResponseBody DiceRoll greyDiceRoll() {
        return DiceRoll.invoke("Grey", greyDice.roll());
    }

    @GetMapping("/dice/red/roll")
    public @ResponseBody DiceRoll redDiceRoll() {
        return DiceRoll.invoke("Red", redDice.roll());
    }

    @GetMapping("/dice/black/roll")
    public @ResponseBody DiceRoll blackDiceRoll() {
        return DiceRoll.invoke("Black", blackDice.roll());
    }

}
