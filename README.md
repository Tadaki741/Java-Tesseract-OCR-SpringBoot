# Tesseract-OCR-Java-SpringBoot
 A SpringBoot server with OCR ability using Tesseract library



### This repository follow the tutorial
From: https://viblo.asia/p/su-dung-tesseract-tao-server-ocr-voi-spring-boot-bWrZnxAY5xw


## Basic step:

#### 1. Create a spring boot project with Web dependency
#### 2. Add Tesseract dependency
```
<dependency>
    <groupId>net.sourceforge.tess4j</groupId>
    <artifactId>tess4j</artifactId>
    <version>4.0.0</version>
</dependency>
```

#### 3. Go to the Tesseract trained data and download a zip file to your Download folder and extract it
Link: https://github.com/tesseract-ocr/tessdata


##### 4. Change the name of the Tesseract data folder to "tessdata"


#### 5. Copy that folder into the resource folder of SpringBoot project

#### 6. Create necessary classes like I did and on the SpringBoot application java file, at the @Bean, the "setDatapath" should lead to the "tessdata" folder that i mentioned earlier

#### 7. Run the SpringBoot project

#### 8. Use some images that I provided and test it with Postman file upload as a Body, choose "form-data", key is "file" and the value of the key is the file you want to upload.


*I am using Java 17.0.6, the Tesseract trained data version is for Tesseract 4.0.0 and above, so that's why i changed my "tess4j" dependency version to 4.0.0*

