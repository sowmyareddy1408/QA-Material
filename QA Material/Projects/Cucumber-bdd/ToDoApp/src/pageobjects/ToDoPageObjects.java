package pageobjects;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class ToDoPageObjects {
	
	private static WebDriver driver = null;
	
	@FindBy(xpath = "html/body/div[1]/div[1]/div/div[2]/ul[2]/li[1]/a")
	private WebElement signInLink;
	
	@FindBy(id = "user_email")
	private WebElement email;
	
	@FindBy(id = "user_password")
	private WebElement password;
	
	@FindBy(xpath = ".//*[@id='new_user']/input")
	private WebElement signInBtn;
	
	public void getWebDriver(){
		//Invoking the browser
		System.setProperty("webdriver.chrome.driver", "lib/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website
        driver.get("http://qa-test.avenuecode.com/");

	}
	
	public void quitWebDriver(){
		driver.quit();
	}
	
	
	public void login(){
		WebElement signIn = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/ul[2]/li[1]/a"));
		signIn.click();
		WebElement email = driver.findElement(By.id("user_email"));
		email.sendKeys("sowmya7817@gmail.com");
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys("Sowmya@7817");
		WebElement signInBtn = driver.findElement(By.xpath(".//*[@id='new_user']/input"));
		signInBtn.click();
		
	}
	
	public void validateMyTasks(){
		WebElement myTasksLink = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/ul[1]/li[2]/a"));
		myTasksLink.click();
	}

	public void validateTasksTable() {

		WebElement myTaskstable = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div"));
		if (!myTaskstable.isDisplayed()) {
			Assert.assertTrue("Tasks table is not displayed", false);
		}

	}
	


	public void validateUserMessage(){
		WebElement userMessage = driver.findElement(By.xpath("html/body/div[1]/h1"));
		String userMessageFormat = "Hey Sowmya, this is your todo list for today:";
		if(userMessage.getText().equals(userMessageFormat)){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue("User message incorrect format", false);
		}
	}
	
	public void createNewTasks(){
		WebElement newTasktf = driver.findElement(By.id("new_task"));
		newTasktf.sendKeys("newTask1");
		newTasktf.sendKeys(Keys.ENTER);
		WebElement removeNewTask1 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[2]/td[5]/button"));
		removeNewTask1.click();
		
		
		newTasktf.sendKeys("newTask2");
		WebElement addbtn = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[2]/span"));
		addbtn.click();
		WebElement removeNewTask2 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
		removeNewTask2.click();
		
		
		
	}
	
	public void validateTaskNameCharacters(){
		WebElement newTasktf = driver.findElement(By.id("new_task"));
		newTasktf.sendKeys("ne");
		newTasktf.sendKeys(Keys.ENTER);
		
		WebElement newTaskinlist = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/a"));
		if(newTaskinlist.getText().equals("ne")){
			WebElement removeNewTask = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
			removeNewTask.click();
			Assert.assertTrue("task created using less than 3 characters", false);
		}
	}
	
	public void validateEmptyTaskName(){
		WebElement addbtn = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[2]/span"));
		addbtn.click();
															
		WebElement emptyTaskName = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/a"));
		if(emptyTaskName.getText().equals("empty")){
			WebElement removeNewTask = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
			removeNewTask.click();
			Assert.assertTrue("task created using empty string", false);
		}
	}
	
	public void validateLargeCharacters(){
		WebElement newTasktf = driver.findElement(By.id("new_task"));
		String largeChars = "hjdwi bjnjn jjnkj hijknk inkjn ikn  nknliuhnohinjnilnjhiun hihiohoi knihnjhuj ugbjbiulh nhuh jbliu nbijkn kbkjnkj inkjnj njk knjnknknkn knkn nkjnkn;okl knklmlk nknkn; nk.knlknl kbjbjb jhbkjbkk. bjbkjj bknkjhghjbhjkhjhjjkjkkjkljklkllkkljkjjkjkjkhjhjjhjkkjk";
		newTasktf.sendKeys(largeChars);
		newTasktf.sendKeys(Keys.ENTER);
		WebElement largeCharTaskName = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/a"));
		if(largeCharTaskName.getText().equals(largeChars)){
			WebElement removeNewTask = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
			removeNewTask.click();
			Assert.assertTrue("task created using more than 250 characters", false);
		}
	}
	
	public void validateTaskList(){
		WebElement newTasktf = driver.findElement(By.id("new_task"));
		newTasktf.sendKeys("newtask");
		newTasktf.sendKeys(Keys.ENTER);
		
		WebElement newTaskinlist = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/a"));
		if(newTaskinlist.getText().equals("newtask")){
			WebElement removeNewTask = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
			removeNewTask.click();
			
		}else{
			Assert.assertTrue("task not appended to the task list", false);
		}
	}
	
	public void validateManageSubTasks(){
		WebElement newTasktf = driver.findElement(By.id("new_task"));
		newTasktf.sendKeys("newtask");
		newTasktf.sendKeys(Keys.ENTER);

		WebElement manageSubTasksbtn = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/button"));
		
		if(!manageSubTasksbtn.isDisplayed()){
			Assert.assertTrue("Manage sub tasks button is not displayed", false);
		}

	}
	
	public void validateNumberOfSubtasks(){
		WebElement manageSubTasksbtn = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/button"));
		String NumberOfSubtasks = manageSubTasksbtn.getText().substring(1, 2);
		if(!NumberOfSubtasks.equals("0")){
			Assert.assertTrue("Manage sub tasks button does not display number of sub tasks", false);
		}
		
		WebElement removeNewTask = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/button"));
		removeNewTask.click();
	}
	
	public void clickManageSubTasks(){
		WebElement manageSubTasksbtn = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/button"));
		manageSubTasksbtn.click();
		
		WebElement subTasksPopup = driver.findElement(By.className("modal-dialog"));
		if(!subTasksPopup.isDisplayed()){
			Assert.assertTrue("Sub tasks modal dailog is not displayed ", false);
		}
		
		
		
	}
	
	public void validateSubTaskidAndDesc(){
		
		WebElement subTaskHeading = driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/h3"));
		if(!subTaskHeading.getText().contains("newtask")){
			Assert.assertTrue("Task modal dailog does not contain task description ", false);
		}
	}
	
	public void isSubTaskFormPresent(){
		WebElement subTaskDesc = driver.findElement(By.id("new_sub_task"));
		WebElement subTaskDueDate = driver.findElement(By.id("dueDate"));
		
		if(!(subTaskDesc.isDisplayed() && subTaskDueDate.isDisplayed())){
			Assert.assertTrue("Sub task form does not display subtask description or subtask due date ", false);
		}
	}
	
	public void validateSubTaskForm(){
		WebElement subTaskDesc = driver.findElement(By.id("new_sub_task"));
		subTaskDesc.sendKeys(" ");
		
		WebElement subTaskDueDate = driver.findElement(By.id("dueDate"));
		subTaskDueDate.sendKeys("20/20/2017");
		
		WebElement addSubTask = driver.findElement(By.id("add-subtask"));
		addSubTask.click();
		
		
		WebElement emptySubtask = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/a"));
		if(emptySubtask.getText().equals("empty")){
			WebElement removeSubtask = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[3]/button"));
			removeSubtask.click();
			Assert.assertTrue("subtask description or subtask due date does not follow intended characters and date format", false);
		}

	}
	
	public void createNewSubTask(){
		WebElement subTaskDesc = driver.findElement(By.id("new_sub_task"));
		subTaskDesc.sendKeys("subtask1");
		
		WebElement subTaskDueDate = driver.findElement(By.id("dueDate"));
		subTaskDueDate.sendKeys("07/16/2017");
		
		WebElement addSubTask = driver.findElement(By.id("add-subtask"));
		addSubTask.click();
		
	}

	public void validateSubtaskList(){
		WebElement newSubtask = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/a"));
		if(!newSubtask.getText().equals("subtask1")){
			Assert.assertTrue("the subtasks are not appended at the bottom of the modal dailog", false);
		}
	}
}
