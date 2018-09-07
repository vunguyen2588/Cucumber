$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Project/Sample/Demo.feature");
formatter.feature({
  "line": 1,
  "name": "Guru Testing",
  "description": "",
  "id": "guru-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User login to Guru99",
  "description": "",
  "id": "guru-testing;user-login-to-guru99",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I navigate to the guru99",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I login to the Guru99",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I create a new customer",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionGuru.iNavigateGuru99()"
});
formatter.result({
  "duration": 14556671678,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iLoginGuru99()"
});
formatter.result({
  "duration": 3333513615,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iCreateNewCustomer()"
});
formatter.result({
  "duration": 5707255732,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.close_browser()"
});
formatter.result({
  "duration": 950295476,
  "status": "passed"
});
});