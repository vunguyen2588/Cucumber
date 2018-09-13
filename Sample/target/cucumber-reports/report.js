$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/sample/ReportSample.feature");
formatter.feature({
  "line": 1,
  "name": "Guru Testing",
  "description": "",
  "id": "guru-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "User login to Guru99",
  "id": "guru-testing;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the guru99",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login to the Guru99",
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
  "duration": 12557207837,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.iLoginGuru99()"
});
formatter.result({
  "duration": 4053707529,
  "status": "passed"
});
formatter.match({
  "location": "DefinitionGuru.close_browser()"
});
formatter.result({
  "duration": 900364402,
  "status": "passed"
});
});