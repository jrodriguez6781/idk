// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.


public class TextLab02st
{
	public static void main(String args[])
	{
		System.out.println("TextLab02, 80 Point Version\n");
		int sec = 10001; //sets the beginning number of seconds 
	
		System.out.println("beginning Seconds:     " + sec); //Displays the number of seconds 
		
		int hours = sec / (60*60); 
		System.out.println("number of hours:       " + hours);
		sec = sec % (60*60); 
		
		int min = sec / 60; 
		System.out.println("number of minutes     " + min);
		sec = sec % 60;
		System.out.println("Remaining seconds     " + sec);
	}
	

}

			 