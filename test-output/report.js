$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium Training/Cucmber/CCMProject/CucumberSeleniumFramework/src/main/java/Features/Costmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "scipio"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "Description",
        "Fixed Cost",
        "Variable Cost",
        "Per Milli Second"
      ],
      "line": 15
    },
    {
      "cells": [
        "test",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test2",
        "54000",
        "55",
        "21"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CostMapStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 6632038474,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 15774006,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 456724117,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1387968216,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 6801514,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 1279890195,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 6036534138,
  "status": "passed"
});
formatter.match({
  "location": "CostMapStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 860199493,
  "status": "passed"
});
});