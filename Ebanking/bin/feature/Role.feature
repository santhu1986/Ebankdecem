Feature: Role Creation

Scenario Outline: Role Creation with Multiple sets of data

Given Tester should on Ranford Home Page

When Tester Enters Username and Password

Then Tester click on Role button

When Tester Click on newRole button and enters "<RoleName>" and "<RoleType>"

Then Tester Close application

Examples:

    | RoleName | RoleType | 
    | Clerkhdf | E |
    |Pohdf | E |
    |Tellerhdf | E |
    