#include <SoftwareSerial.h>

SoftwareSerial BT(7, 8); //TX, RX respetively
String device;

void setup() {
 BT.begin(9600);
 Serial.begin(9600);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
 
  pinMode(9, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);


}
//-----------------------------------------------------------------------// 
void loop() {
  while (BT.available()){  //Check if there is an available byte to read
  delay(10); //Delay added to make thing stable
  char c = BT.read(); //Conduct a serial read
  device += c; //build the string.
  } 
  if (device.length() > 0) {
    Serial.println(device);

  if(device == "1")
  {
    digitalWrite(3, HIGH);
     digitalWrite(4, HIGH);
     delay(250);
        digitalWrite(3, LOW);
digitalWrite(4, LOW);
       
  }

  else if(device == "2")
  {
    digitalWrite(4, HIGH);
     delay(250);
        digitalWrite(4, LOW);

    
  }

  else if (device == "3")
  {
    digitalWrite(3, HIGH);
     delay(250);
        digitalWrite(3, LOW);

  }
  
 else if ( device == "4")
 {digitalWrite (5,HIGH);
   digitalWrite (6, HIGH);
    delay(250);
        digitalWrite(6, LOW);
digitalWrite(5, LOW);
 }

  
   
device="";}} //Reset the variable
