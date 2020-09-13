<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# qarkstaticanalysis
Static Analysis for Java source code and Android APK using QARK via Maven and Junit.

## Installation
Please follow this repository https://github.com/linkedin/qark for QARK installation.


## How to run the test
```
Sample for Java source code
$ mvn clean test -Dtest=QarkScannerTest#scanner -Dtype=java -Dpath=/home/okta/Documents/GitHub/testdatabuilderfortesting/src/main/java/

Sample for Android APK
$ mvn clean test -Dtest=QarkScannerTest#scanner -Dtype=apk -Dpath=/home/okta/Documents/GitHub/qarkstaticanalysis/src/main/resources/goatdroid.apk
```

## HTML Report
```
{your_project_path}/target/report.html
```


