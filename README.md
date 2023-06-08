# Calculator

## Overview
This is a simple Java application that, when run, performs a series of mathematical computations.  The purpose of this project is to demonstrate how to use GitHub Actions to build the application JAR artifact using Gradle and upload it as an artifact to the GitHub Action workflow instance.

## Requirements
* JDK 11
* Gradle 7

## Building the Artifact Using GitHub Actions

On the Actions tab in the GitHub repository, click the workflow job named *java-build* on the left.  

As this particular job is set up to handle the *workflow_dispatch* event, it can be run manually.  Therefore, in the table containing the workflow runs, click the *Run workflow* button.  In the dialog shown, select *main* as the branch and click the *Run workflow* button.

![image](https://github.com/gburgalum01/Calculator/assets/10605837/c7963faf-7a85-4d65-be68-e160427f4f54)

The instance of running job will display in the list.

![image](https://github.com/gburgalum01/Calculator/assets/10605837/821b7f17-7469-4880-a8ed-1c26cd9e35c8)

After a minute, the job will complete.  Click on the workflow run.  The artifacts section will contain the JAR artifact as well as the results of running the JUnit tests as part of the build.

![image](https://github.com/gburgalum01/Calculator/assets/10605837/9ea23d94-1a91-452a-a7dd-9896ac16f470)

