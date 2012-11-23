//#set( $symbol_pound = '#' )
//#set( $symbol_dollar = '$' )
//#set( $symbol_escape = '\' )
//package ${package}.pages;
package net.thucydides.sample.pages;

import java.util.List;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Topics")
public class TopicPage extends PageObject {

    @FindBy(css = "div.NavHead")
    private WebElement topicTitle;
    
    @FindBy(css = "div.NavContent")
    private WebElement topicContent;
    
    @FindBy(css = "div.CategoryTreeSection")
    public List<WebElement> topicalCategories;

    public TopicPage(WebDriver driver) {
        super(driver);
    }

	public void expand_topic() {
		clickOn(topicTitle);
		element(topicContent).waitUntilVisible();
	}
	
	public int numberOfTopicalCategories() {
		return topicalCategories.size();
	}

}


