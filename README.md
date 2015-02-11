# integration-spec-sample

I created this simple project just to practice how to create a controller integration spec on grails-2.4.4

To create this project, I did the following:

1- grails create-app sample
2- grails create-domain-class Example
3- added a few attributes to Example
4- generated controllers for Example class using Intellij auto-generation features
5- created a test class under test/integration/sample/ExampleControllerSpec

Important things no notice:

1- to be able to debug your integration-test, you should do two things:
1.1- create a run/debug configuration on Intellij with command line = test-app integration: sample.*
1.2- modify BuildConfig.groovy and set grails.project.fork = [test: false, ....]

2- Bootstrap.groovy acts as the pre-existing database, by creating instances

3- Don't forget to add static responseFormats = ['json'] to your controller. Otherwise, you won't be able to read exampleController.response.json


