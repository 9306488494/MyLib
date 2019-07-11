# MyLib
Make Library easy to use
How to get Device Uinique ID IMEI in a single line of code

First:- place the Dependency :
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  second :-
  
  dependencies {
	        implementation 'com.github.9306488494:MyLib:1.0'
	}
  
  ------------------------------------
  Now use the code to display IMEI no
  
  Libs.IMEI(getApplicationContext())
  
  and use will be as 
  
  Toast.makeText(this, Libs.IMEI(getApplicationContext()), Toast.LENGTH_SHORT).show();
