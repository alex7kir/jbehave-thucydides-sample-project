// test
package net.thucydides.sample;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTest extends ThucydidesJUnitStories {
	public AcceptanceTest() {
		
//		Parallezizing using JBehave threads - it works, but Thucydides has problems with screenshoting in this case
//		configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(true)
//        .doIgnoreFailureInView(true).doVerboseFiltering(true).useThreads(2).useStoryTimeoutInSecs(2);

//		How to run a single story
//		findStoriesCalled("**/topics/*.story");
	}
}
