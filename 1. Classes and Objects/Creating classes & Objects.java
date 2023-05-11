/*
Author: Abhinav Pawar
Date: 07-05-2023
*/

/*
Creating Classes & Objects

Create a program to show loading message to your application users. 
Define a class Loading which has one public method called LoadingMessage(), 
which should print "Loading" when called.
 Create an object named loading and call that method.
Don't forget to use new keyword while creating an object.
*/

//Class: blueprint;.  Object: building
public class Main {
   public static void main(String[] args) {
       Loading loading = new Loading();
       //create a Loading object with the same name
       
       loading.LoadingMessage();
   }
}

class Loading {
     //complete the class, add LoadingMessage() method
     public void LoadingMessage(){
         System.out.println("Loading");
     }
}
