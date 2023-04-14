Feature: This is alibaba search features
@Alibaba
Scenario: verify books  result page is displayed 
Given launch application  URL 
Then type books in the search fieldve
Then Click search button 
And  verify books  result page is displayed 
