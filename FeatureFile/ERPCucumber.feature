@tag
Feature: Stock Accounting
 As i adim i want to test supplier and customer modules
@suppliers
Scenario Outline:validate supplier module
Given launch Browser
And launch Url
When wait for username with "id" and "username"
And enter username with "id" and "username" and "admin"
And enter password with "id" and "password" and "master"
And click Login Button with "id" and "btnsubmit"
And wait for logoutlink with "xpath" and "//a[@id='logout']"
And verify that page title with "Dashboard « Stock Accounting"
And wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
And click that supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
And wait for add btn with "xpath" and "(//span[@data-caption='Add'])[1]"
And click that add btn with "xpath" and "(//span[@data-caption='Add'])[1]"
And  wait for supplier number with "name" and "x_Supplier_Number"
And capture that supplier number with "name" and "x_Supplier_Number"
When Enter in "<supplierName>" with "xpath" and "//input[@name='x_Supplier_Name']"
When Enter in "<address>" with "xpath" and "//textarea[@name='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@name='x_City']"
When Enter in "<country>" with "xpath" and "//input[@name='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@name='x_Contact_Person']"
When Enter in "<pnum>" with "xpath" and "//input[@name='x_Phone_Number']"
When Enter in "<email>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<mnum>" with "xpath" and "//input[@name='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']"
When click add btn with "id" and "btnAction"
When  wait for confirm btn with "xpath" and "//button[text()='OK!']"
When  I click confrim btn with "xpath" and "//button[text()='OK!']"
When wait for alert btn with "xpath" and "//button[contains(@class,'ajs-button') and normalize-space()='OK']"
When i click alert btn with "xpath" and "//button[contains(@class,'ajs-button') and normalize-space()='OK']"
Then Verify supplier number
When Close app browser
Examples:
|supplierName|address|city|country|cperson|pnum|email|mnum|note|
|firstakhi1|kkpalli|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi2|kkpalli3|Ameerpet41|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi561|kkpalli|Ameerpet31|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi21|kkpalli3|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi12|kkpalli7|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|

@customers
Scenario Outline: validate customer module
Given launch Browser
And launch Url
When wait for username with "id" and "username"
And enter username with "id" and "username" and "admin"
And enter password with "id" and "password" and "master"
And click Login Button with "id" and "btnsubmit"
And wait for logoutlink with "xpath" and "//a[@id='logout']"
And verify that page title with "Dashboard « Stock Accounting"
And wait for customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
And click that customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
And wait for add btn with "xpath" and "(//span[@data-caption='Add'])[1]"
And click that add btn with "xpath" and "(//span[@data-caption='Add'])[1]"
And  wait for customer number with "name" and "x_Customer_Number"
And capture that customer number with "name" and "x_Customer_Number"
When Enter in "<CustomerName>" with "xpath" and "//input[@name='x_Customer_Name']"
When Enter in "<address>" with "xpath" and "//textarea[@name='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@name='x_City']"
When Enter in "<country>" with "xpath" and "//input[@name='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@name='x_Contact_Person']"
When Enter in "<pnum>" with "xpath" and "//input[@name='x_Phone_Number']"
When Enter in "<email>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<mnum>" with "xpath" and "//input[@name='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']"
When click add btn with "id" and "btnAction"
When  wait for confirm btn with "xpath" and "//button[text()='OK!']"
When  I click confrim btn with "xpath" and "//button[text()='OK!']"
When wait for alert btn with "xpath" and "//button[contains(@class,'ajs-button') and normalize-space()='OK']"
When i click alert btn with "xpath" and "//button[contains(@class,'ajs-button') and normalize-space()='OK']"
Then Verify customer number
When Close app browser
Examples:
|CustomerName|address|city|country|cperson|pnum|email|mnum|note|
|firstakhi1|kkpalli|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi2|kkpalli3|Ameerpet41|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi561|kkpalli|Ameerpet31|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi21|kkpalli3|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi12|kkpalli7|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|


 


