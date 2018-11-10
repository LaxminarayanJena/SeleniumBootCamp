# SeleniumBootCamp

### 1)Difference between findElement() and findElements()
<br>On Zero Match : throws NoSuchElementException
<br>On One Match : returns WebElement
<br>On One+ Match : returns the first appearance in DOM 
findElements()

<br>On Zero Match : return an empty list
<br>On One Match : returns list of one WebElement only
<br>On One+ Match : returns list with all matching instance

### 1)Difference between a single and double slash used in XPath
Usually absolute xpath starts with single slash. When use use absolute xpath, you will be covering whole path to the element.

Relative xpath starts with double slash. In that case you will be first finding unique parent node and path from there to the element.
<br>Absolute xpath = /html/body/div[2]/div[1]/div[1]/a
<br>Relative xpath = //div[class="qa-logo"]/a
