# SeleniumBootCamp
selenium4 locators-toLeftOf(),toRightOf(),above(),below(),near(): 
### 1)Difference between findElement() and findElements()
<br>On Zero Match : throws NoSuchElementException
<br>On One Match : returns WebElement
<br>On One+ Match : returns the first appearance in DOM 
findElements()

<br>On Zero Match : return an empty list
<br>On One Match : returns list of one WebElement only
<br>On One+ Match : returns list with all matching instance

### 2)Difference between a single and double slash used in XPath
Usually absolute xpath starts with single slash. When use use absolute xpath, you will be covering whole path to the element.

Relative xpath starts with double slash. In that case you will be first finding unique parent node and path from there to the element.
<br>Absolute xpath = /html/body/div[2]/div[1]/div[1]/a
<br>Relative xpath = //div[class="qa-logo"]/a

### 3)Running order of different annotations
<br>BeforeSuite-This will execute before the Test Suite
<br>BeforeTest-This will execute before the Test
<br>BeforeClass-This will run before the first test method in the current class is invoked.
<br>BeforeMethod-This will execute before every Method
<br>1)---Executing login test----
<br>AfterMethod-This will execute after every Method
<br>BeforeMethod-This will execute before every Method
<br>2)---Composing Email-----
<br>AfterMethod-This will execute after every Method
<br>BeforeMethod-This will execute before every Method
<br>3)---Checking inbox------
<br>AfterMethod-This will execute after every Method
<br>AfterClass-This will  run after the last test method in the current class is invoked.
<br>AfterTest-This will execute after the Test
<br>PASSED: doLogin
<br>PASSED: composeEmail
<br>PASSED: checkinbox
### Priority order of different annotations
-2,-1,no priority, 0 ,1,2


@optional
----------------
```
@Parameters({"Test3"})
 @Test
 public void Parameter3(@Optional("Optional Parameter") String Test3){
     System.out.println("Parameter is: "+Test3);
 }


<include name="Parameter3">
<!--     <parameter name="Test3" value="Third Parameter"/>     -->
</include>
```
### 4)What is difference between StaleElementReferenceException and NoSuchElementException and ElementNotVisibleException  ?

1. StaleElementReferenceException :- When Selenium trying to interact with an element at that time page got refreshed or ajax calls happened then selenium throw this exception.
(Internally when selenium interacting the element it creates a random ID by using this selenium interact with the element but if page got refreshed or ajax calls happened then ID is changed, now that ID is stale from the page, So selenium throw this exception.)

2. NoSuchElementException :- If element is not present in the DOM or we have given the the wrong locator of the element or element is present in any frame and we haven't switched that frame then selenium throw this exception.


3. ElementNotVisibleException :-
   
   1. If element is present in the DOM but visibility is off, It means element is hidden.
   2. If Duplicate Xpath is found by selenium. It means more than one elements has same      xpath.
   3. If synchronization problem(If selenium is faster than application or vice versa.) occur then this exception thrown.
 ### 5)How to run a method multiple times using testng 
   @Test(invocationCount = 10)
  ### 5)Selenium exceptions  
![seleniumexceptions](https://user-images.githubusercontent.com/24494133/52053575-b6108900-2527-11e9-9800-b84a8f379454.jpg)

 ### 6)FindBy,FindBys,FindAll  
```
//anyone is correct it will work	
	@FindBys({
	@FindBy(xpath=".//*[@id='wizard-tabs']/div[1]/ul"),
	@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
	})
	public WebElement flightTab;
	
	//within 1stfindby it will search second findby

@FindBy(xpath=".//li[@class='tab ']")
public List<WebElement> tabCount;

//anyone is correct it will work	
	@FindAll({
	@FindBy(xpath="//*[@id='gss-signin-submit1']"),
	@FindBy(id="gss-signin-submit")
	})
	public WebElement submit;

```
### 7)Property
 Properties prop = new Properties(); </br>
 FileInputStream file = new FileInputStream("path/to/config.properties"); </br>
 prop.load(file); </br>
 String browser = prop.getProperty("browser"); </br>
 
### 7)Javascript executor
Send text
---------
WebElement webl = driver.findElement(By.xpath(“xpath_expression”));
<br>JavascriptExecutor js = (JavascriptExecutor)driver;
<br>js.executeScript(“arguments[0].value=’selenium’;”, webl);

<br>js.executeScript(“document.getElementsById(‘some_id’).value=’selenium’;”);

click element
----------------------
WebElement nameInputField = driver.findElement(By.xpath(" "));
<br>JavascriptExecutor js = (JavascriptExecutor)driver;
<br>js.executeScript("arguments[0].click();", nameInputField);
<br>

<br>js.executeScript("document.getElementById('gbsa').click();");
### scroll
js.executeScript("window.scrollBy(0,1000)");
<br>je.executeScript("arguments[0].scrollIntoView(true);", element);


### shadow elements
<br> JavascriptExecutor js = (JavascriptExecutor) driver;
<br>WebElement shadowHost = driver.findElement(By.cssSelector("css-selector-of-shadow-host"));// get the shadow root
<br>WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);//access the element inside the shadow root
<br>WebElement shadowElement = shadowRoot.findElement(By.cssSelector("css-selector-inside-shadow-dom"));
<br>shadowElement.click();

### 8)Screenshot
TakesScreenshot ts = ((TakesScreenshot) driver);
<br>File scr = ts.getScreenshotAs(OutputType.FILE);
<br>FileUtils.copyFile(scr, new File("D//error.png")); </br>
down casting WebDriver to TakesScreenshot to use getScreenshotAs method.
points to consider while designing framework

### 8)Automation framework standards
```
Handle scripts and data separately
Create libraries
Follow coding standards
Offer high extensibility
Less maintenance
Script/Framework version control
Should have meaningful logging and reporting structure
```
### 8)Waits
```
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait wait = new WebDriverWait(driver,30);
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); //latest
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);
	
WebElement button = wait.until(new Function<WebDriver, WebElement>(){
	
		public WebElement apply(WebDriver driver ) {
			return driver.findElement(By.xpath(""));
		}
	});
	button.click();
```
### Database Connection
```
Connection con = DriverManager.getConnection(dbUrl,username,password);
Class.forName("com.mysql.jdbc.Driver");
Statement stmt = con.createStatement();	
stmt.executeQuery(select *  from employee;);
```
 #### Broken Links</br>
[Broken Links](https://www.toolsqa.com/selenium-webdriver/find-broken-links-in-selenium/)

 #### WebTable</br>
[WebTable](https://www.guru99.com/handling-dynamic-selenium-webdriver.html)
![image](https://user-images.githubusercontent.com/24494133/204199163-964d11a8-fdb8-42f7-bab3-3cd14c58275c.png)

### Iretry analyser
```
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}

<suite name="Suite">
    <listeners>
        <listener class-name="com.example.tests.RetryListener"/>
    </listeners>
    <test name="Test">
        <classes>
            <class name="com.example.tests.YourTestClass"/>
        </classes>
    </test>
</suite>
```

</br>



### Git stash and git rebase
```
git stash is used to temporarily save changes in your working directory without committing them.Run git stash apply to restore the stashed changes.
git rebase is used to reapply commits on top of another base commit. Instead of merging, which creates a new commit to combine changes from different branches, rebasing rewrites the commit history.

git cherry-pick is a Git command that allows you to apply a specific commit from one branch onto another branch. Instead of merging or rebasing entire branches, it enables you to take individual commits and add them to your current branch. This is useful when you want to introduce a specific feature, bug fix, or change from one branch without including all the other changes made in that branch.
If you have a commit with hash a1b2c3d on feature-branch and you want to apply it to your current branch (main):
git checkout main
git cherry-pick a1b2c3d


```
Interfaces-WebDriver ,Window,WebElement,TakesScreenshot,JavascriptExecutor,Alert   </br>
Classes- ChromeDriver,By ,ExpectedConditions ,Actions,WebDriverWait  </br>
Methods- getTitle() ,manage().window().maximize(),getCurrentUrl() ,click()  </br>



