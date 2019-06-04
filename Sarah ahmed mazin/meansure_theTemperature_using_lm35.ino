
#include <LiquidCrystal.h>
#define sensor A0
int value=0;
 float volt=0;
 int temp=0;
LiquidCrystal lcd(12,11,5,4,3,2);


void setup() {
  lcd.begin(16, 2);
  lcd.print("temp=  ");
}
void loop() {
  value=analogRead(sensor);
  volt=(5.0/1023.0)* value;
  temp=volt/0.01; //temp=(volt/10mv)
  delay(500);
  lcd.setCursor(6,0);
  lcd.print(temp);
  lcd.print("  C");
  
  
}
