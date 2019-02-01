# SeleniumBootCamp

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
