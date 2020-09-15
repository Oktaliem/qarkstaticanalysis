<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# qarkstaticanalysis
Static Analysis for Java source code and Android APK using QARK via Maven and Junit.

## Installation
Please follow this repository https://github.com/linkedin/qark for QARK installation.


## How to run static analysis via Maven and Junit
```
Download this repository and run this syntax

$ mvn clean test -Dtest=QarkScannerTest#scanner -Dtype=${file_type} -Dpath=${path_to_apk or path_to_java_source_code}

Sample for Java source code
$ mvn clean test -Dtest=QarkScannerTest#scanner -Dtype=java -Dpath=/home/okta/Documents/GitHub/qarkstaticanalysis/src/main/java/

Sample for Android APK
$ mvn clean test -Dtest=QarkScannerTest#scanner -Dtype=apk -Dpath=/home/okta/Documents/GitHub/qarkstaticanalysis/src/main/resources/goatdroid.apk
```

## Run static analysis via executable jar
```
Download this repository and run this syntax

$ java -jar qarkstaticanalysis-1.0-SNAPSHOT.jar [file_type] [path_to_apk or path_to_java_source_code]

Sample for Android APK
$ java -jar qarkstaticanalysis-1.0-SNAPSHOT.jar apk /home/okta/Documents/GitHub/qarkstaticanalysis/src/main/resources/goatdroid.apk

Sample for Java source code
$ java -jar qarkstaticanalysis-1.0-SNAPSHOT.jar java /home/okta/Documents/GitHub/qarkstaticanalysis/src/main/java/
```

## HTML Report
```
{your_project_path or your_jar_folder}/report.html
```

## How to create executable jar
```
$ mvn clean package -Dtest=QarkScannerTest#scanner -Dtype=apk -Dpath=/home/okta/Documents/GitHub/qarkstaticanalysis/src/main/resources/goatdroid.apk
```
