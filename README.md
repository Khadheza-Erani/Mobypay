# MobyPay_Project_With Selenium

## How to run this project
- Clone this project
- Open with IntelliJ IDEA Community Edition / Command Shell
- Run Command:  
```console 
mvn test
mvn test -Dbrowser="chrome"
mvn test -Dbrowser="chrome" -DxmlFileName="testing.xml"
mvn test -Dbrowser="chrom" -DtestClassName="testcase which you want to run"
```console
allure generate ./allure-results --clean

```console 
allure open ./allure-report

## Technology used:
- IntelliJ 
- Allure
- Apache

## Prerequisite:
- IntelliJ IDEA Community Edition 2023.2.5
- Jdk
- Apache-maven-3.9.4
- Node.js v20.11.0.
- Goole Chrome
- Firefox
- Edge
- Allure-2.24.1

## Prerequisite Dependencies:
- Selenium-java 4.13.0
- TestNG 7.8.0
- Allure-testng 2.24.0
_io.github.bonigarcia 5.3.1

## Installation Process:
- Download;
  1.> IntelliJ IDEA Community Edition 2023.2.5
  2.> Jdk
  3.> Apache-maven-3.9.4
  4.> Node.js v20.11.0 
- Go to the bin folder copy the path for each download folder.
- Open edit system variable from pc/laptop.
- Paste the copied path and save variable name.

## Automation Documentation:
-https://demoqa.com/automation-practice-form

## Test case list:
1. ### Test With Valid Credentials
	> Create Data Sets with valid credentials.
2. ### Test With InValid Credentials
	> Create Data Sets with Invalid credentials.


3. ### Verify with Different Browser
       1. > Google Chrome
 	2. > Firefox
	3. > Edge

4. ### Verify with Different Devices
       1. > IPhone



## Allure Report Summary:
![Allure Summary](file:///C:/Users/Tech%20Land/Desktop/MobyPayProject/MobyPayProject/allure-report/index.html)









