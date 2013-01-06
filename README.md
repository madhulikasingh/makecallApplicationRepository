makecallApplicationRepository
=============================

This project takes input from a JSP from users and reads them through a servlet and with those parameters generates 
the answer url and makes call. To Run the project Directly move to (Steps to run) as for this server everything is put in place. 

How to Run
-----------
This repository has only got the source code and the webcontent checked in , The complete project can be run by starting the 
Apache tomcat server at home/madhulika

Prerequisite to Run (All the below prerequisite is already done, need not be done if running on the same server)
-------------------
1) create a tomcat deployable WAR file 

2) to generate the answer URL xml you need an Apache HTTP server.

3) you need the supporting Jars in the web-INF/lib folder inside the war

steps to run
--------------

1) Go to home/madhulika/bin> 

2) run home/madhulika/bin>./catalina.sh stop

3) home/madhulika/bin>./catalina.sh start

4)on your Web browser fire this URL: http://174.129.157.75:8080/test/redirect.jsp

5)fill the form that is rendered in the browser: from is the caller ID 
							To is the number you want to call
							your number is as it says your own phone number
click submit

6)And the call be initiated

7) you can check the answer url XML at the below URL

   http://174.129.157.75:8090/plivo/plivocall1.xml

---------------------

Content of the Repository:
--------------------------

makecallservlet.java: is a simple servlet
 1) which takes input from them JSP 
 2) Creates a dynamic XML from the inputs
 3) writes an xml on the Apache2 http server and hosts the Xml as an URL
 4) through RestAPI makes the call

/home/madhulika/RepositoryForMakeCallApllication/makecallApplicationRepository/WebContent/resource/js----has application.js 
   which has validation function for the form

/home/madhulika/RepositoryForMakeCallApllication/makecallApplicationRepository/WebContent/pages---has
1) index.jsp ---the main JSP page which takes user inputs
2) error.jsp

/home/madhulika/RepositoryForMakeCallApllication/makecallApplicationRepository/WebContent/WEB-INF/lib--has
supporting jars for runtime

/home/madhulika/RepositoryForMakeCallApllication/makecallApplicationRepository/WebContent/WEB-INF/--has
web.xml for servlet and JSP mapping

-----------------------------------------------------------------------------------------------------------