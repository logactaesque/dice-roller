package uk.org.hexsaw.logactaesque;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


// @RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest(classes = DiceConfiguration.class)
@AutoConfigureMockMvc
@WebAppConfiguration 
public class DiceControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void canRollTheYellowDice() throws Exception {
        this.mockMvc.perform(get("/dice/yellow/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingYellowDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/yellow/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content = result.andReturn().getResponse().getContentAsString();

        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Yellow"));
    }

    @Test
    public void canRollTheGreenDice() throws Exception {
        this.mockMvc.perform(get("/dice/green/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingGreenDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/green/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2, 3, 4, 5)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Green"));
    }

    @Test
    public void canRollTheBrownDice() throws Exception {
        this.mockMvc.perform(get("/dice/brown/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingBrownDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/brown/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2, 4, 5)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Brown"));
    }


    @Test
    public void canRollTheBlueDice() throws Exception {
        this.mockMvc.perform(get("/dice/blue/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingBlueDiceReturnValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/blue/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2, 3, 4)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Blue"));
    }

    @Test
    public void canRollTheGreyDice() throws Exception {
        this.mockMvc.perform(get("/dice/grey/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingGreyDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/grey/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2, 3)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Grey"));
    }

    @Test
    public void canRollTheRedDice() throws Exception {
        this.mockMvc.perform(get("/dice/red/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingRedDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/red/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 1, 2, 3)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Red"));
    }

    @Test
    public void canRollTheBlackDice() throws Exception {
        this.mockMvc.perform(get("/dice/black/roll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void rollingBlackDiceReturnsValidNumbers() throws Exception {

        ResultActions result = this.mockMvc.perform(get("/dice/black/roll"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, is(oneOf(0, 2, 3)));

        String diceColour = JsonPath.read(content, "$.diceColour");
        assertThat(diceColour, equalTo("Black"));
    }

}