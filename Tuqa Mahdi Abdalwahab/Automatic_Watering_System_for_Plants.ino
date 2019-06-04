
int motor=13; //define the pin of water pump
int sensor=8; //define the pin of moisture sensor
int val; //variable that stores the value received from soil sensor

void setup() {
  // put your setup code here, to run once:
  
pinmode(13,OUTPUT); //set pin 13 as output pin(to motor)
pinmode(8,INPUT); //set pin 8 as input pin (from sensor)

}

void loop() {
  // put your main code here, to run repeatedly:
val==digitalRead(8); //read data from moisture sensor
if(val==LOW){digitalWrite(13,LOW);}  //if the sensor send low value then send low value to relay
else {digitalWrite(8,HIGH);} //if the sensor send high value then send high value to relay
delay(400); //wait for little while then continue the loop
}
