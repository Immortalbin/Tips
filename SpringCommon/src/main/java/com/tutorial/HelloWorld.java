package com.tutorial;

public class HelloWorld {
   private String message;
   private int id;

   public void setMessage(String message){
      this.message  = message;
   }
   public String getMessage(){
      return "Your Message : " + message;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
}