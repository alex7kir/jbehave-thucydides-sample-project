package net.thucydides.sample.steps;
//#set( $symbol_pound = '#' )
//#set( $symbol_dollar = '$' )
//#set( $symbol_escape = '\' )
//package ${package}.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.sample.pages.DictionaryPage;
import net.thucydides.sample.pages.TopicPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//import ${package}.pages.DictionaryPage;

public class EndUserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EndUserSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void enters(String keyword) {
        onDictionaryPage().enter_keywords(keyword);
	}

    @Step
    public void starts_search() {
        onDictionaryPage().lookup_terms();
    }

    private DictionaryPage onDictionaryPage() {
        return getPages().currentPageAt(DictionaryPage.class);
    }

    private DictionaryPage DictionaryPage() {
        return getPages().currentPageAt(DictionaryPage.class);
    }

    @Step
	public void should_see_definition_containing_words(String terms) {
        assertThat(DictionaryPage().getDefinitions(), hasItem(containsString(terms)));
	}

    @Step
    public void is_the_home_page() {
        onDictionaryPage().open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
	public void is_on_topic_page() {
		TopicPage().open();
		System.out.println("test");
	}
		
	private TopicPage TopicPage() {
		return getPages().currentPageAt(TopicPage.class);
	}

	public void expands_a_topic_title() {
		TopicPage().expand_topic();
		
	}

	public void should_see_topic_content() {
		assertThat(TopicPage().numberOfTopicalCategories(), greaterThan(0));
		
	}
		
}
