# Welcome to your CDK Java project!

This is a blank project for CDK development with Java.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation


## Project Commands

* `cdk deploy Vpc Cluster --require-approval never --parameters  Rds:databasePassword=matilde123456 Rds Sns Ddb Service01 Service02 InvoiceApp`
* `cdk deploy --all --require-approval never --parameters Rds:databasePassword=matilde123456`

* `cdk destroy --require-approval never  Vpc Cluster Rds Sns Ddb Service01 Service02 InvoiceApp`


Enjoy!
