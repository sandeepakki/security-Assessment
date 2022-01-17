Feature: Creating New Resource

@smoke
Scenario: Open Resources Page > Create Resource
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on create resource
	Then click select type and click on website option
	Then click on user circle
	Then select user from dropdown
	Then Enter Name of Website
	Then Enter URL of Website
	Then Select state of website from dropdown as In Use
	Then select protocol as https from dropdown
	Then select environment as Production from dropdown
	Then Enter Description of the website
	Then click on createBtn
	Then user can view Resource Created msg "New Resource added successfully"
	Then close browser
	
@smoke1
Scenario: Open Resources Page > Create Sub Resource
Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on create resource
	Then click select type and click on website option
	Then Enter Name of Website
	Then Enter URL of Website
	Then Select state of website from dropdown as In Use
	Then select protocol as https from dropdown
	Then select environment as Production from dropdown
	Then Enter Description of the website
	Then select Parent from dropdown
	Then click on createBtn
	Then user can view Resource Created msg "New Resource added successfully"
	Then close browser
	
	@smoke2
	Scenario: Open Resources Page > Edit Prostoo Resource
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on Prostoo Resource
	Then click on Edit button
	Then Remove existing user and add new user
	Then Edit Name, State
	Then click on Update
	Then user can see updated msg "Resource updated successfully"
	Then close browser
	
	@smoke3
	Scenario: Open Resources Page > Delete Resource
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on Resource
	Then click on delete button
	Then Click on yes,delete
	Then user can see deleted msg "Deleting Resource"
	Then close browser
	
	@smoke4
	Scenario: Open Resources Page > Delete Resource
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on bulk checkbox to delete resource
	
	Then close browser