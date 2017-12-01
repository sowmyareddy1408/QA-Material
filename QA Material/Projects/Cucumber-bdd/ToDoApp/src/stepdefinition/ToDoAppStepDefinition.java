package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ToDoPageObjects;

public class ToDoAppStepDefinition {
	
	@Given("^the user is on ToDo App login page$")
	public void the_user_is_on_ToDo_App_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects loginPageObjects = new ToDoPageObjects();
		loginPageObjects.getWebDriver();
	}

	@When("^I login with sowmya(\\d+)@gmail\\.com and Sowmya@(\\d+) to ToDo App$")
	public void i_login_with_sowmya_gmail_com_and_Sowmya_to_ToDo_App(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects loginPageObjects = new ToDoPageObjects();
		loginPageObjects.login();
	}

	@Then("^I should be able to see and click 'My Tasks' link$")
	public void i_should_be_able_to_see_and_click_My_Tasks_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects homePageObjects = new ToDoPageObjects();
		homePageObjects.validateMyTasks();
	}

	@Then("^I should be redirected to users tasks page$")
	public void i_should_be_redirected_to_users_tasks_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.validateTasksTable();
	}

	@Then("^I should see appropriate user message$")
	public void i_should_see_appropriate_user_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		//myTasksPageObjects.validateUserMessage();;
	    
	}

	@Then("^I create new task by hitting enter or clicking on the add task button$")
	public void i_create_new_task_by_hitting_enter_or_clicking_on_the_add_task_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.createNewTasks();
	}

	@Then("^I should enter atleast three characters for creating new task$")
	public void i_should_enter_atleast_three_characters_for_creating_new_task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		//myTasksPageObjects.validateTaskNameCharacters();
		//myTasksPageObjects.validateEmptyTaskName();
	}

	@Then("^the task can't have more than (\\d+) characters$")
	public void the_task_can_t_have_more_than_characters(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		//myTasksPageObjects.validateLargeCharacters();
	}

	@Then("^task should be appended on the list of created tasks when added\\.$")
	public void task_should_be_appended_on_the_list_of_created_tasks_when_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.validateTaskList();
		myTasksPageObjects.quitWebDriver();
	}

	@Then("^I should see a button labelled as 'Manage Subtasks'$")
	public void i_should_see_a_button_labelled_as_Manage_Subtasks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.validateManageSubTasks();
	}

	@Then("^I should see number of subtasks created on 'Manage Subtasks' button$")
	public void i_should_see_number_of_subtasks_created_on_Manage_Subtasks_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.validateNumberOfSubtasks();;
	}

	@Then("^clicking on  'Manage Subtasks' opens a modal dialog$")
	public void clicking_on_Manage_Subtasks_opens_a_modal_dialog() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		manageSubTaskPageObjects.clickManageSubTasks();
	}

	@Then("^this popup should have readonly task id and task description$")
	public void this_popup_should_have_readonly_task_id_and_task_description() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		//manageSubTaskPageObjects.validateSubTaskidAndDesc();
	}

	@Then("^I should see a form to enter subtask description and subtask due date$")
	public void i_should_see_a_form_to_enter_subtask_description_and_subtask_due_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		manageSubTaskPageObjects.isSubTaskFormPresent();
	}

	@Then("^I enter subtask description\\((\\d+) charatcters\\) and subtask due date\\(MM/dd/yyyy format\\) which are required feilds$")
	public void i_enter_subtask_description_charatcters_and_subtask_due_date_MM_dd_yyyy_format_which_are_required_feilds(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		//manageSubTaskPageObjects.validateSubTaskForm();
	}

	@Then("^I click on add button to add the subtask$")
	public void i_click_on_add_button_to_add_the_subtask() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		manageSubTaskPageObjects.createNewSubTask();
	}

	@Then("^the subtasks should be appended at the bottom of the modal dailog$")
	public void the_subtasks_should_be_appended_at_the_bottom_of_the_modal_dailog() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ToDoPageObjects manageSubTaskPageObjects = new ToDoPageObjects();
		manageSubTaskPageObjects.validateSubtaskList();
	}

	@After
	public void quitWebDriver(){
		ToDoPageObjects myTasksPageObjects = new ToDoPageObjects();
		myTasksPageObjects.quitWebDriver();;
	}


}
