#include <Wire.h> 
#include <LiquidCrystal_I2C.h>
#include <NewPing.h>

#define TRIGGER_PIN  2  // Arduino pin tied to trigger pin on the ultrasonic sensor.
#define ECHO_PIN     3  // Arduino pin tied to echo pin on the ultrasonic sensor.

NewPing sonar(TRIGGER_PIN, ECHO_PIN); // NewPing setup of pins and maximum distance.
LiquidCrystal_I2C lcd(0x27,16,2);  // set the LCD address to 0x27 for a 16 chars and 2 line display


void setup() {
  lcd.init();
  lcd.backlight();
  Serial.begin(9600); // Open serial monitor at 9600 baud to see ping results.
    
  lcd.setCursor(0 ,0);
  lcd.print("Salam 3alaikom");
  delay (2000);
}

void loop() {

  lcd.setCursor(0,0);
  lcd.print("destance =  ");
  lcd.print(sonar.ping_cm());// Send ping, get distance in cm and print result (0 = outside set distance range)_
  lcd.print("cm ");
  lcd.setCursor(0,1);
  lcd.print("By MohammedBaqer");
  
  
 Serial.print("destance");
 Serial.print(sonar.ping_cm()); // Send ping, get distance in cm and print result (0 = outside set distance range)
 Serial.println("cm");
 Serial.println("By MohammedBaqer");

}
