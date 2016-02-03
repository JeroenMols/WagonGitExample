# WagonGitExample
Script and sample project to use BitBucket as a private Maven repository.

Please find more details in [this blogpost](http://jeroenmols.com/blog/2016/02/10/wagongit/) and see below to learn how to run the sample.

## Usage
1. Add the following plugin to the top of the [build.gradle](https://github.com/JeroenMols/WagonGitExample/blob/master/library/build.gradle) file in your library folder

  ```groovy
  apply from: 'publish-bitbucket.gradle'
  ```

2. Create a [gradle.properties](https://github.com/JeroenMols/WagonGitExample/blob/master/library/gradle.properties) file within your library folder with the following parameters:

  ```groovy
  ARTIFACT_VERSION=<version_here>
  ARTIFACT_NAME=<libraryname_here>
  ARTIFACT_PACKAGE=<packagename_here>
  ARTIFACT_PACKAGING=aar //You could also use jar

  COMPANY=<bitbucket_team/company_here> //Simply your username if you're not part of a team
  REPOSITORY_NAME=<bitbucket_reponame_here>
  ```

3. Create a [gradle.properties](https://github.com/JeroenMols/WagonGitExample/blob/master/gradle.properties) file in the root of your project (or better in the global `.gradle` folder on your system) with the following parameters

  ```groovy
  USERNAME=<username_here>
  PASSWORD=<password_here>
  ```

4. Run the following command to upload a version to your Maven repository.

  ```bash
  ./gradlew uploadArchives
  ```

## How to run the sample
In order to test out this project, first ensure that you have a `maven_repository` configured in your BitBucket account, which uses `releases` as its default branch. Next configure the project:

1. Checkout the example source

    ```bash
    git clone git@github.com:JeroenMols/WagonGitExample.git
    ```

2. Fill in your BitBucket username and password in the root level [gradle.properties](https://github.com/JeroenMols/WagonGitExample/blob/master/gradle.properties) file

  ```groovy
  USERNAME=<username_here>
  PASSWORD=<password_here>
  ```

3. Optionally configure the other parameters in the [gradle.properties](https://github.com/JeroenMols/WagonGitExample/blob/master/library/gradle.properties) file within the library project.

  ```groovy
  ARTIFACT_VERSION=1.0.0
  ARTIFACT_NAME=awesomelibrary
  ARTIFACT_PACKAGE=com.jeroenmols.awesomelibrary
  ARTIFACT_PACKAGING=aar

  COMPANY=jeroenmols   // the name of your team/company in BitBucket
  REPOSITORY_NAME=maven_repository
  ```

4. Run the following command to upload a version to your Maven repository.

  ```bash
  ./gradlew uploadArchives
  ```

Note: Don't commit the root level [gradle.properties](https://github.com/JeroenMols/WagonGitExample/blob/master/gradle.properties) back to version control as this would expose your password! Check [this blogpost](http://localhost:4000/blog/2015/08/13/artifactory2/) password to securely provide your username and password.



## Questions
@molsjeroen
