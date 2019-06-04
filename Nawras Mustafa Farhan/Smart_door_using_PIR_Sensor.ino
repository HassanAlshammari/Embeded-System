
#include <Servo.h>

Servo myservo;  

int pos = 0; 
 
 boolean x;
void setup() {
  myservo.attach(9); 
    pinMode(2, INPUT);
  pinMode(11, OUTPUT);

}

void loop() {
   x = digitalRead(12);
  
  if (11 == HIGH) {
    digitalWrite(11, HIGH);
    pos = 180;
    myservo.write(pos);  
    delay(50);
    
  } else {

    
       digitalWrite(11, LOW);
       pos = 0;
    myservo.write(pos);  
     delay(50);

  }
}
