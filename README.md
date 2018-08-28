# SeleniumBootCamp

### 1)Difference between findElement() and findElements()
<br>On Zero Match : throws NoSuchElementException
<br>On One Match : returns WebElement
<br>On One+ Match : returns the first appearance in DOM 
findElements()

<br>On Zero Match : return an empty list
<br>On One Match : returns list of one WebElement only
<br>On One+ Match : returns list with all matching instance
