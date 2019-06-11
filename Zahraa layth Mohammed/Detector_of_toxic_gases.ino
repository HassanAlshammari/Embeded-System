int val;
int red=5;
int green=6;
int buzzer=7;
#include <LiquidCrystal.h>
const int rs = 12, en = 11, d4 = 13, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
void setup() { 
  lcd.begin(16, 2);
pinMode(red,OUTPUT);
pinMode(green,OUTPUT);
pinMode(buzzer,OUTPUT);
Serial.begin(9600);
}

void loop() { // put your main code here, to run repeatedly:
val=analogRead(A0);
 lcd.setCursor(0, 0);
  lcd.print("the gas sensor= ");
   lcd.setCursor(0, 0);
  lcd.print(val);
    Serial.print("val=");
  Serial.println(val);
  delay(1000);
if (val>200)
{
  digitalWrite(red,HIGH);
  digitalWrite(green,LOW);
  digitalWrite(buzzer,HIGH);

}
else
{
  digitalWrite(green,HIGH);
  digitalWrite(green,LOW);
}

}
