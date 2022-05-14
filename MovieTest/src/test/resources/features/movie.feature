@WikiImdb
Feature: To validate country name and release date of a movie
  
  Scenario: Extract country name and release date of a movie from Wikipedia and Imdb
    Given I want to launch both the websites
    When I extract country name and release date
    Then I validate the country name and result date 

    
        
