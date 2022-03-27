$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9414435400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "TC_001 user should be able to see the events",
  "description": "",
  "id": "home-page;tc-001-user-should-be-able-to-see-the-events",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mousehover on resources",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on events",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on innovate finance",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 217952400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMousehoverOnResources()"
});
formatter.result({
  "duration": 393009900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnEvents()"
});
formatter.result({
  "duration": 1471639800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnInnovateFinance()"
});
formatter.result({
  "duration": 1003683500,
  "status": "passed"
});
formatter.after({
  "duration": 1476452500,
  "status": "passed"
});
});