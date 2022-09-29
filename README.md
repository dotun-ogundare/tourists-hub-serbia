# tourists-hub-serbia
TOURISTS-HUB-SERBIA
WEB APPLICATION

[Adedotun Olasunkanmi Ogundare](https://github.com/dotun-ogundare) and Kshitij Verma

<h1>Project Description</h1>

This is a project conducted by foreign students (2021/2022 academic year) enrolled in masters of Software Engineering & Information Technologies at the Faculty of Technical Sciences of the University of Novi Sad. The project is the practical requirement for the Software Configuration Management [Course](https://github.com/vladaindjic/SCM-exchange-students#the-project-specification) which has exposed the students to the essential tools, concepts and state-of-art technologies for maintaining web application life cycle especially for a cloud-native application. This project is named the ‘Serbia-tourist-hub’ and it is an online platform where tourists in Serbia can visit and see all the tourist attractions and events around them. This helps to solve the curiosity that lies within people who arrive in Serbia in their first week. The developers, being foreigners in Serbia, had a fair share of same curiosity in their first week at Novi Sad in their attempts to explore the ‘European Capital of Culture.’ As such, they grapple with the plethora of generic and hackneyed information that internet offers. Away from the cliché of asking native Serbians around, the project is motivated by the need to build a solution that will guide tourists in Serbia. As such, it is optimized for Serbia with the goal of showcasing an exhaustive tourist documentation of arts, culture and tourism in the country. Aside being at the centerpiece of the two world wars, Serbia is a country of rich culture and heritage with significant historical relevance to global politics and scramble for political power. The [Serbia-tourist-hub](https://github.com/vladaindjic/SCM-exchange-students/blob/master/SPEC.md) will be a go-to platform for anybody arriving Serbia as educationist, researcher, student, or tourist. 

The project is being supervised by [Vladimir Inđić](https://github.com/vladaindjic) under the ultimate supervision and control of Prof. [Igor Dejanovic](https://github.com/igordejanovic)

Technical Overview
 
Release Plan
-	Release 1.0
o	Show list of Tourist Attractions and Events
-	Release 2.0
o	Users can mark places to visit in their account
o	Purchase tickets to visit attraction sites and Events 
-	Release 3.0
o	Users’ login/logout security 
o	Track previous places visited by users

The project is implemented using automated workflows. The backend is designed using spring boot while the front end is built with Angular framework. The front end and backend are bundled into a jar and built into a docker image which is pushed into docker hub.  The docker-compose.yml file references the particular repository of the image. The docker-compose file is uploaded to AWS Elastic Beanstalk making it accessible over the internet. This whole process is repeated every time a major updated is made on the system that warrants a change/update in the behavior of the application. This warrants a full automation of the build and deployment process using CICD pipelines. 

CICD
Github is used as the Version Control System for managing updates and versioning of the application the application

GIT WORKFLOW
In following best practices and conventions, the git project default is the main branch instead of master branch. The actions defined in the build and deploy configuration files conforms to the CICD pipelines.
1.	New branches are used to commit changes, which triggers a pull request at every instance of pushing an update to remote repository. 
2.	As soon as a pull request is made, certain actions are triggered to ensure the build and test is successful without an error. These actions are defined in the build.yml configuration file.
3.	If the build actions is successful, then a merge can be made. After merging, the deploy.yml configuration is triggered which performs the following 
a.	Triggers message to slack to inform team that a deployment process is ongoing
b.	Build a new jar file by bundling the front end with backend into jar
c.	Updating the image in docker repository 
d.	Uploading the latest docker image to ElasticBeanstalk 
After every successful and completed merging, users can see the updates that has been made immediately using the AWS [link](http://softwareconfigurationmgt-env.eba-2afqrkze.us-east-2.elasticbeanstalk.com/)

 
![diagram_1](https://user-images.githubusercontent.com/50335434/156457209-4a85e650-74bb-4be1-a603-b3dcf400e985.png)

