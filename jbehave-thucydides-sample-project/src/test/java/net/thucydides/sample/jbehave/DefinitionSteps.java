package net.thucydides.sample.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.sample.steps.EndUserSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


/**
 * A description goes here.
 * User: johnsmart
 * Date: 25/07/12
 * Time: 7:03 AM
 */
public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the $word")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see a definition containing the $words")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String words) {
        endUser.should_see_definition_containing_words(words);
    }

}