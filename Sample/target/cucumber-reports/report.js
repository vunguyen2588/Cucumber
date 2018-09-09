$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/sample/Demo.feature");
formatter.feature({
  "line": 1,
  "name": "Guru Testing",
  "description": "",
  "id": "guru-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Scenario:"
    },
    {
      "line": 3,
      "value": "#User login to Guru99"
    },
    {
      "line": 4,
      "value": "#Given I navigate to the guru99"
    },
    {
      "line": 5,
      "value": "#And I login to the Guru99"
    },
    {
      "line": 6,
      "value": "#And I create a new customer"
    },
    {
      "line": 7,
      "value": "#And I create a new account"
    },
    {
      "line": 8,
      "value": "#And I deposit to new account"
    },
    {
      "line": 9,
      "value": "#Then I close the browser"
    }
  ],
  "line": 10,
  "name": "Testing",
  "description": "",
  "id": "guru-testing;testing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I login with user abc and password 123456",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 18
    },
    {
      "val": "123456",
      "offset": 35
    }
  ],
  "location": "DefinitionGuru.loginToSystem(String,String)"
});
formatter.result({
  "duration": 156150335,
  "status": "passed"
});
});