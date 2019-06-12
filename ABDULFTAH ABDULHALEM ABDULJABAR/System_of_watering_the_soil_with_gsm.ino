#include <SoftwareSerial.h>
SoftwareSerial SIM900A(10,11);//y-tx b-rx

int val; 
void setup()
{
   pinMode(13,OUTPUT); //motor
   pinMode(12,OUTPUT); //led off
   pinMode(9,OUTPUT);// led send
   pinMode(8,INPUT); //sensor
   SIM900A.begin(9600);    
   Serial.begin(9600);    
   Serial.println ("SIM900A Ready");
   delay(100);
   Serial.println ("Type s to send message or r to receive message");
}
void loop()
{


 val = digitalRead(8);  
  if(val == LOW) 
  {

    digitalWrite(13,HIGH);
    digitalWrite(9,HIGH);
    digitalWrite(12,LOW);

  callSomeone();
  delay(1000);
 
  }
  else
  {
  
    
      digitalWrite(12,HIGH);
      digitalWrite(13,LOW);
      digitalWrite(9,LOW); 
 
 
   }
  delay(400);
     
 
}

void callSomeone() {
  // REPLACE THE X's WITH THE NUMER YOU WANT TO DIAL
  // USE INTERNATIONAL FORMAT CODE FOR MOBILE NUMBERS
  SIM900.println("ATD + +9647718746048;");
  delay(100);
  SIM900.println();
  
 // In this example, the call only last 30 seconds
 // You can edit the phone call duration in the delay time
  delay(20000);
  // AT command to hang up
  SIM900.println("ATH"); // hang up
}
