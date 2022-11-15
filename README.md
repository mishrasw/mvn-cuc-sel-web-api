# Test Automation Project for Web UI and REST API Using Selenium & Rest Assured

# Setup Instructions

* Install Java in the local machine . I have installed JDK-13.0.1
  Set JAVA_HOME variable as <JDK_path> (eg. JAVA_HOME="C:\Program Files\Java\jdk-13.0.1") Append Path variable as %PATH%;%JAVA_HOME%/bin
* Download Maven (e.g Apache Maven 3.3.9) 
  Set M2_HOME system environment variable as <maven_folder_path> (eg. M2_HOME="C:\Program Files\Apache\apache-maven-3.3.9"
* Clone the current git repository into local folder path.

# Execute from Command line

* Open Command Prompt
* navigate to Project directory (cd <local_project_path>\mvn-cuc-sel-web-api\selenium-cucumber-app)
* Execute maven command to run - **mvn clean install**

# Execute from Eclipse

* Install Eclipse IDE
* Select - File->Import->Maven Project
* Select Project directory. By default the POM.XML will be selected
* The project folder structure should be displayed on editor
* Right CLick on Pom.Xml -> Run As -> **Maven Clean**
* Right CLick on Pom.Xml -> Run As -> **Maven Install**

#Reports

* After Execution Extent report can be seen under below folder:  **<local_project_path>\mvn-cuc-sel-web-api\selenium-cucumber-app\test-output\SparkReporter**

