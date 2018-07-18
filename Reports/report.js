$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Transavia Home Page",
  "description": "",
  "id": "transavia-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 19,
  "name": "Verify that user is able to navigate to login page from header login link",
  "description": "",
  "id": "transavia-home-page;verify-that-user-is-able-to-navigate-to-login-page-from-header-login-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user is on application home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is navigated to application logon page",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioTestSteps.invokeApplication()"
});
formatter.result({
  "duration": 17159654719,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTestSteps.clickLoginLink()"
});
formatter.result({
  "duration": 53966015274,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTestSteps.verifyText()"
});
