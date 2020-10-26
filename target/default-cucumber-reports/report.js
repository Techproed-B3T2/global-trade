$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US-2%20User%20can%20use%20all%20of%20the%20language%20options.feature");
formatter.feature({
  "name": "US-2 User_can_use_all_of_the_language_options",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.scenario({
  "name": "TC02_Testing_the_language_portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "name": "user is on the global trader page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LanguagePortalStepsDefinitions.user_is_on_the_global_trader_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Language Portal",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LanguagePortalStepsDefinitions.user_click_on_the_Language_Portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the Norwegian language",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LanguagePortalStepsDefinitions.user_select_the_Norwegian_language()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify on the language portal box and language is selected Norwegian",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LanguagePortalStepsDefinitions.verify_on_the_language_portal_box_and_language_is_selected_Norwegian()"
});
formatter.result({
  "status": "passed"
});
});