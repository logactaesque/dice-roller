package uk.org.hexsaw.logactaesque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.org.hexsaw.logactaesque.model.DiceFace;
import uk.org.hexsaw.logactaesque.model.Rollable;

@Controller
public class DiceController {

    @Autowired(required = true)
    private Rollable sevenSidedDice;

    @RequestMapping(path = "/dice/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace roll() {
        return new DiceFace(sevenSidedDice.roll());
    }
}
