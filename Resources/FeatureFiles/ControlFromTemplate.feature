Feature: Creating New Resource

@smoke
Scenario: Open Resources Page > Create Control From Resource
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on ProstooRes
	Then click on Controls
	And click on AddNew button
	Then click on Continue
	And click on Add
	Then Click on perform Control
	Then close browser
	
@smoke1 
Scenario: Open Resources Page > Edit Control Owner and Reviewer
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on ProstooRes
	Then click on Controls
	Then Click on perform Control
	Then click on Pencil to Edit control
	Then change key value to Non Key
	Then click on obejective and select objective
	Then select Reviewer
	And click on Update control
	Then close browser

@smoke2
Scenario: Open Resource Page > Attach Evidence to control
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then click on resources tab
	Then click on ProstooRes
	Then click on Controls
	Then Click on perform Control
	Then Go to Review tab and Click on it
	Then click on upload new evidence
	Then select compliance status and enter remarks
	Then upload Evidence
	Then click Submit
	Then close browser
	
@smoke3
Scenario: Open Resource Page >Verify attached evidence as reviewer
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "sandeep.akki@assystant.com" and password "San@3004"
	And click on LOGIN
	Then click on resources tab
	Then click on ProstooRes
	Then click on Controls
	Then Click on perform Control
	Then Go to Review tab and Click on it
	Then click on in progress state
	Then click on All attachments tab
	And click to download attachment
	And click to show all attachments as List view
	Then again click on file to download 
	Then click on Activity tab
	Then change the compliance state and enter description
	Then submit the form
	Then Mark as Done
	Then close browser
	

 	
	
	
	
	
	
	
	
	
	
	