$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/sample/Demo.feature");
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
  "name": "I create a new account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I deposit to new account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionGuru.iNavigateGuru99()"
});
formatter.result({
  "duration": 26527877917,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iLoginGuru99()"
});
formatter.result({
  "duration": 2908397603,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iCreateNewCustomer()"
});
formatter.result({
  "duration": 5114749040,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iCreateNewAccount()"
});
formatter.result({
  "duration": 5291328959,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iDepositToNewAccount()"
});
formatter.result({
  "duration": 13396988845,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.close_browser()"
});
formatter.result({
  "duration": 991741041,
  "status": "passed"
});
});