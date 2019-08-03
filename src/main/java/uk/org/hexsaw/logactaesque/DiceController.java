package uk.org.hexsaw.logactaesque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.org.hexsaw.logactaesque.model.DiceFace;
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

    @RequestMapping(path = "/dice/yellow/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll yellowDiceRoll() {
        return DiceRoll.invoke("Yellow", yellowDice.roll());
    }

    @RequestMapping(path = "/dice/green/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll greenDiceRoll() {
        return DiceRoll.invoke("Green", greenDice.roll());
    }

    @RequestMapping(path = "/dice/brown/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll brownDiceRoll() {
        return DiceRoll.invoke("Brown", brownDice.roll());
    }

    @RequestMapping(path = "/dice/blue/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll blueDiceRoll() {
        return DiceRoll.invoke("Blue", blueDice.roll());
    }

    @RequestMapping(path = "/dice/grey/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll greyDiceRoll() {
        return DiceRoll.invoke("Grey", greyDice.roll());
    }

    @RequestMapping(path = "/dice/red/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll redDiceRoll() {
        return DiceRoll.invoke("Red", redDice.roll());
    }

    @RequestMapping(path = "/dice/black/roll", method = RequestMethod.GET)
    public @ResponseBody DiceRoll blackDiceRoll() {
        return DiceRoll.invoke("Black", blackDice.roll());
    }

}
