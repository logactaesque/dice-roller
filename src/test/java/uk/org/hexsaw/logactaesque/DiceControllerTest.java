package uk.org.hexsaw.logactaesque;

import com.jayway.jsonpath.JsonPath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DiceConfiguration.class)
@WebAppConfiguration
public class DiceControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @After
    public void tearDown() throws Exception {

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

        String content =  result.andReturn().getResponse().getContentAsString();
        Integer rolledNumber = JsonPath.read(content, "$.rolledNumber");
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2)));
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
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2), is(3), is(4), is(5)));
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
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2), is(4), is(5)));
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
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2), is(3), is(4)));
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
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2), is(3)));
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
        assertThat(rolledNumber, anyOf(is(0), is(1), is(2), is(3)));
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
        assertThat(rolledNumber, anyOf(is(0),  is(2), is(3)));
    }

}