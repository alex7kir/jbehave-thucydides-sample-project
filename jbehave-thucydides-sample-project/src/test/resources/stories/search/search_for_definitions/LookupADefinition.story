Narrative:
In order to find the definitions I am interested in
As a user
I want to be able to look up the definition of a word

Scenario: Looking up the definition
Given the user is on the Wikionary home page
When the user looks up the definition of the word
Then they should see a definition containing the words

Examples:
|word|words|
|apple|A common, round fruit|
|banana|An elongated curved fruit|