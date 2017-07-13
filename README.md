# EasyLogger
Easy Log it can log your debug and error logs
You can also save your log in a file 

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Gradle

Add it in your root build.gradle at the end of repositories:
	
	allprojects {

		repositories {

			maven { url 'https://jitpack.io' }
		
		}
	
	}
  
  
  Step 2. Add the dependency
  
  	dependencies {
	
	        compile 'com.github.surveshoeb:EasyLogger:0.1.0'
	
	}

  #How to use:
  
  TO Log Debug
  
  log.d("Message");
  
  TO Log Error
  
  log.e("Message");
  
  TO Log Debug and Save in file
  
  log.d("Message",true);
