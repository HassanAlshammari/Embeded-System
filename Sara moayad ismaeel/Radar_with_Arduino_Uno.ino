
#include <Servo.h>

const int Buzzer = 6;
const int Buzzer_Voltage = 7;
const int trigPin = 9;
const int echoPin = 10;


long duration;
int distance;

Servo myServo;


void setup() {
  
  pinMode(Buzzer_Voltage, OUTPUT);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT); 
  
  Serial.begin(9600);
  myServo.attach(11); 
  
  pinMode(Buzzer, OUTPUT);
  digitalWrite(Buzzer_Voltage, HIGH); 
}
void loop() {
  
 
  for(int i=15;i<=165;i++){  
  myServo.write(i);
  distance = calculateDistance();
  
  if (distance < 40){
   digitalWrite(Buzzer, LOW);
   delay(50);   
   digitalWrite(Buzzer, HIGH);   
  }
  else{
     delay(50);   
  }
  Serial.print(i);
  Serial.print(","); 
  Serial.print(distance); 
  Serial.print("."); 

 
  if (i > 10){
  digitalWrite(Buzzer, HIGH);  
  } 
  
  }

  
  for(int i=165;i>15;i--){  
    myServo.write(i);
    distance = calculateDistance();
    if (distance < 40){
     digitalWrite(Buzzer, LOW);  
     delay(50);   
     digitalWrite(Buzzer, HIGH);   
    }else{
     delay(50);   
    }
    Serial.print(i);
    Serial.print(",");
    Serial.print(distance);
    Serial.print(".");
    if (i < 10){
      digitalWrite(Buzzer, LOW);                             
      }
  }



  
}

int calculateDistance(){ 
  
  digitalWrite(trigPin, LOW); 
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH); 
  delayMicroseconds(10);
   
  digitalWrite(trigPin, LOW);
  
  duration = pulseIn(echoPin, HIGH); 
  
  distance= duration*0.034/2;
  return distance;
}
