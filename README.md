# MyLib
Make Android easy to develop.
Write Less do More
Get IMEI and ReadMore with in 1 line of code.
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
	        implementation 'com.github.9306488494:MyLib:1.6'
	}
  
  ------------------------------------
  Now use the code to display IMEI no
  
  Libs.IMEI(getApplicationContext())
  
  and use will be as 
  
  Toast.makeText(this, Libs.IMEI(getApplicationContext()), Toast.LENGTH_SHORT).show();
  
  --------------------------------
  Readmore for TextView
  use this parameters:
  Libs.readMore(data,no_of digits);
  ex: Libs.ReadMore(Desc,"5");
  here : data : string variable which have data in string
		digits: how many no of digits wanna show in Textview
		use of this:
		    Toast.makeText(this,ReadMore(Desc,"5"), Toast.LENGTH_SHORT).show();
	Implementation with TextView in Android:
	 txtDesc.setText(Libs.ReadMore(Desc,"5"));
			
		
		
