Feature: Creating New Resource

@smoke1
Scenario Outline: Open Resource Page > Go to Assessment > Publish Template
 Given user launch chrome browser
 When user opens url "<Url>"
 And user enters email "<email>" and password "<password>"
 And click on LOGIN
Then click on resources tab
Then click on any resource "<resource>"
And click on Assessments Tab
Then click on Publish Button
And Select Template from dropdown
Then click Next
And click Allow Editing
And click Allow Partial Save
Then click on Make Assessment Private
And Enter Limit No.of Days "<Days>"
Then click Next
Then enter Report Summary
Then click on show descriptions
Then click on show summary
Then click next steps in report
And click on heap map 
Then click super section
And click Next
And click Generate Executive report
Then select dropdown for radar or heatmap on executive
And click Publish assessment
Then user can see the successfully publish "<message>"
Then click on resources tab
Then click on any resource "<resource>"
And click on Assessments Tab
Then close browser

Examples:
         | Url | email | password | resource |Days|message|
         |https://dev-sa.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|2|Assessment Published Successfully|
         |https://sa.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|3|Assessment Published Successfully|
         |https://cyberpulse.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|1|Assessment Published Successfully|
         |https://vj.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|1|Assessment Published Successfully|
         |https://bigfour.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|1|Assessment Published Successfully|
         |https://client.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|2|Assessment Published Successfully|
         |https://knowit.aristiun.com/login|saket@travelder.com|dev_aristiun|Amazon|2|Assessment Published Successfully|
         
             