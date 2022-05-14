$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("movie.feature");
formatter.feature({
  "line": 2,
  "name": "To validate country name and release date of a movie",
  "description": "",
  "id": "to-validate-country-name-and-release-date-of-a-movie",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WikiImdb"
    }
  ]
});
formatter.before({
  "duration": 7096528300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Extract country name and release date of a movie from Wikipedia and Imdb",
  "description": "",
  "id": "to-validate-country-name-and-release-date-of-a-movie;extract-country-name-and-release-date-of-a-movie-from-wikipedia-and-imdb",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to launch both the websites",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I extract country name and release date",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the country name and result date",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_want_to_launch_both_the_websites()"
});
formatter.result({
  "duration": 20846301800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_extract_country_name_and_release_date()"
});
formatter.result({
  "duration": 197800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_validate_the_country_name_and_result_date()"
});
formatter.result({
  "duration": 3435300,
  "status": "passed"
});
formatter.after({
  "duration": 1102183600,
  "status": "passed"
});
});