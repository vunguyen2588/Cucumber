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
  "name": "I create the new account form with the following data",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Phone No",
        "Password",
        "DOB Year",
        "Gender"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test FN",
        "Test LN",
        "0123123123",
        "Pass1234",
        "1990",
        "Male"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionGuru.createNewAccountWithFollowingData(DataTable)"
});
formatter.result({
  "duration": 170158423,
  "status": "passed"
});
});