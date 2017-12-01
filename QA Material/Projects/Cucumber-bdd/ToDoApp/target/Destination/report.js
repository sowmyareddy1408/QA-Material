$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("todoapp.feature");
formatter.feature({
  "line": 2,
  "name": "As a ToDo App user, I should be able to create a task and its sub tasks, So I can manage my tasks.",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@todoApp"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "As a ToDo App user, I should be able to create a task, So I can manage my tasks",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-task,-so-i-can-manage-my-tasks",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user is on ToDo App login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with \u003cusername\u003e and \u003cpassword\u003e to ToDo App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see and click \u0027My Tasks\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should be redirected to users tasks page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see appropriate user message",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I create new task by hitting enter or clicking on the add task button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should enter atleast three characters for creating new task",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the task can\u0027t have more than 250 characters",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "task should be appended on the list of created tasks when added.",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-task,-so-i-can-manage-my-tasks;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-task,-so-i-can-manage-my-tasks;;1"
    },
    {
      "cells": [
        "sowmya7817@gmail.com",
        "Sowmya@7817"
      ],
      "line": 18,
      "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-task,-so-i-can-manage-my-tasks;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "As a ToDo App user, I should be able to create a task, So I can manage my tasks",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-task,-so-i-can-manage-my-tasks;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@todoApp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on ToDo App login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with sowmya7817@gmail.com and Sowmya@7817 to ToDo App",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see and click \u0027My Tasks\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should be redirected to users tasks page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see appropriate user message",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I create new task by hitting enter or clicking on the add task button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should enter atleast three characters for creating new task",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the task can\u0027t have more than 250 characters",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "task should be appended on the list of created tasks when added.",
  "keyword": "And "
});
formatter.match({
  "location": "ToDoAppStepDefinition.the_user_is_on_ToDo_App_login_page()"
});
formatter.result({
  "duration": 4442956514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7817",
      "offset": 19
    },
    {
      "val": "7817",
      "offset": 45
    }
  ],
  "location": "ToDoAppStepDefinition.i_login_with_sowmya_gmail_com_and_Sowmya_to_ToDo_App(int,int)"
});
formatter.result({
  "duration": 1495044047,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_be_able_to_see_and_click_My_Tasks_link()"
});
formatter.result({
  "duration": 490578548,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_be_redirected_to_users_tasks_page()"
});
formatter.result({
  "duration": 77879993,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_see_appropriate_user_message()"
});
formatter.result({
  "duration": 23466,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_create_new_task_by_hitting_enter_or_clicking_on_the_add_task_button()"
});
formatter.result({
  "duration": 549383956,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_enter_atleast_three_characters_for_creating_new_task()"
});
formatter.result({
  "duration": 41813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 30
    }
  ],
  "location": "ToDoAppStepDefinition.the_task_can_t_have_more_than_characters(int)"
});
formatter.result({
  "duration": 100267,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.task_should_be_appended_on_the_list_of_created_tasks_when_added()"
});
formatter.result({
  "duration": 1348543593,
  "status": "passed"
});
formatter.after({
  "duration": 45227,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "As a ToDo App user, I should be able to create a subtask, So I can break down my tasks in smaller pieces",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-subtask,-so-i-can-break-down-my-tasks-in-smaller-pieces",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "the user is on ToDo App login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I login with \u003cusername\u003e and \u003cpassword\u003e to ToDo App",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see and click \u0027My Tasks\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I should be redirected to users tasks page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I create new task by hitting enter or clicking on the add task button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see a button labelled as \u0027Manage Subtasks\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I should see number of subtasks created on \u0027Manage Subtasks\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "clicking on  \u0027Manage Subtasks\u0027 opens a modal dialog",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "this popup should have readonly task id and task description",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I should see a form to enter subtask description and subtask due date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter subtask description(250 charatcters) and subtask due date(MM/dd/yyyy format) which are required feilds",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on add button to add the subtask",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the subtasks should be appended at the bottom of the modal dailog",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-subtask,-so-i-can-break-down-my-tasks-in-smaller-pieces;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 37,
      "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-subtask,-so-i-can-break-down-my-tasks-in-smaller-pieces;;1"
    },
    {
      "cells": [
        "sowmya7817@gmail.com",
        "Sowmya@7817"
      ],
      "line": 38,
      "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-subtask,-so-i-can-break-down-my-tasks-in-smaller-pieces;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "As a ToDo App user, I should be able to create a subtask, So I can break down my tasks in smaller pieces",
  "description": "",
  "id": "as-a-todo-app-user,-i-should-be-able-to-create-a-task-and-its-sub-tasks,-so-i-can-manage-my-tasks.;as-a-todo-app-user,-i-should-be-able-to-create-a-subtask,-so-i-can-break-down-my-tasks-in-smaller-pieces;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@todoApp"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user is on ToDo App login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I login with sowmya7817@gmail.com and Sowmya@7817 to ToDo App",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see and click \u0027My Tasks\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I should be redirected to users tasks page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I create new task by hitting enter or clicking on the add task button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see a button labelled as \u0027Manage Subtasks\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I should see number of subtasks created on \u0027Manage Subtasks\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "clicking on  \u0027Manage Subtasks\u0027 opens a modal dialog",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "this popup should have readonly task id and task description",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I should see a form to enter subtask description and subtask due date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter subtask description(250 charatcters) and subtask due date(MM/dd/yyyy format) which are required feilds",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on add button to add the subtask",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the subtasks should be appended at the bottom of the modal dailog",
  "keyword": "And "
});
formatter.match({
  "location": "ToDoAppStepDefinition.the_user_is_on_ToDo_App_login_page()"
});
formatter.result({
  "duration": 3369897860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7817",
      "offset": 19
    },
    {
      "val": "7817",
      "offset": 45
    }
  ],
  "location": "ToDoAppStepDefinition.i_login_with_sowmya_gmail_com_and_Sowmya_to_ToDo_App(int,int)"
});
formatter.result({
  "duration": 1518030316,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_be_able_to_see_and_click_My_Tasks_link()"
});
formatter.result({
  "duration": 484853101,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_be_redirected_to_users_tasks_page()"
});
formatter.result({
  "duration": 77926500,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_create_new_task_by_hitting_enter_or_clicking_on_the_add_task_button()"
});
formatter.result({
  "duration": 499223252,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_see_a_button_labelled_as_Manage_Subtasks()"
});
formatter.result({
  "duration": 138574684,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_see_number_of_subtasks_created_on_Manage_Subtasks_button()"
});
formatter.result({
  "duration": 122391623,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.clicking_on_Manage_Subtasks_opens_a_modal_dialog()"
});
formatter.result({
  "duration": 178709135,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.this_popup_should_have_readonly_task_id_and_task_description()"
});
formatter.result({
  "duration": 33280,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_should_see_a_form_to_enter_subtask_description_and_subtask_due_date()"
});
formatter.result({
  "duration": 129984167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 28
    }
  ],
  "location": "ToDoAppStepDefinition.i_enter_subtask_description_charatcters_and_subtask_due_date_MM_dd_yyyy_format_which_are_required_feilds(int)"
});
formatter.result({
  "duration": 150187,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.i_click_on_add_button_to_add_the_subtask()"
});
formatter.result({
  "duration": 314943123,
  "status": "passed"
});
formatter.match({
  "location": "ToDoAppStepDefinition.the_subtasks_should_be_appended_at_the_bottom_of_the_modal_dailog()"
});
formatter.result({
  "duration": 65433257,
  "status": "passed"
});
formatter.after({
  "duration": 914614078,
  "status": "passed"
});
});