package net.thucydides.sample.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.sample.steps.EndUserSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TopicSteps {

    @Steps
    EndUserSteps endUser;

    @Given("user is on the topic page")
    public void givenTheUserIsOnTopicPage() {
        endUser.is_on_topic_page();
    }

    @When("user expands a topic title")
    public void whenUserClicksOnTopicTitle() {
        endUser.expands_a_topic_title();
    }

    @Then("user should see the topic content")
    public void thenUserShouldSeeTopicContent() {
        endUser.should_see_topic_content();
    }

}
