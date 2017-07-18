# astro
Astro Assignment
The entire automation has been divided into two projects i.e "Mobile" for mobile cases and "myAutomation" for web cases.

I have tried to design a simple framework based on the assignment requirement.

Here i have used a Pom model i.e segeregate the locators with the test case. I have used page factory to initialize the objects.
I have followed a key word driven approach to seperate the buisness logic with the test case.
I have also tried to use Data driven for data inputs eg: login, password, url etc. I am reading these from a config file. This allows easier maintenance of the code.

Below are the file structure.

Mobile Cases:

mobile/src/test/java - contains all the logic methods, test cases, locators.
mobile/src/test/resources - contains my config file from where we can populate data for tests.


Web Cases:
Myautomation/src/test/java - contains all the logic methods, test cases, locators.
Myautomation/src/test -> resources - contains my config file from where we can populate data for tests.
