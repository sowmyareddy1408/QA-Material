@todoApp
Feature: As a ToDo App user, I should be able to create a task and its sub tasks, So I can manage my tasks.
    
Scenario Outline: As a ToDo App user, I should be able to create a task, So I can manage my tasks
Given the user is on ToDo App login page
When I login with <username> and <password> to ToDo App
Then I should be able to see and click 'My Tasks' link
And I should be redirected to users tasks page
And I should see appropriate user message
And I create new task by hitting enter or clicking on the add task button
And I should enter atleast three characters for creating new task
And the task can't have more than 250 characters
And task should be appended on the list of created tasks when added.


Examples:
		|username | password |
		|sowmya7817@gmail.com | Sowmya@7817|
		
Scenario Outline: As a ToDo App user, I should be able to create a subtask, So I can break down my tasks in smaller pieces
Given the user is on ToDo App login page
When I login with <username> and <password> to ToDo App
Then I should be able to see and click 'My Tasks' link
And I should be redirected to users tasks page
And I create new task by hitting enter or clicking on the add task button
Then I should see a button labelled as 'Manage Subtasks' 
And I should see number of subtasks created on 'Manage Subtasks' button
And clicking on  'Manage Subtasks' opens a modal dialog
And this popup should have readonly task id and task description
And I should see a form to enter subtask description and subtask due date
And I enter subtask description(250 charatcters) and subtask due date(MM/dd/yyyy format) which are required feilds
And I click on add button to add the subtask
And the subtasks should be appended at the bottom of the modal dailog


Examples:
		|username | password |
		|sowmya7817@gmail.com | Sowmya@7817|

