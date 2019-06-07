#include "DHT.h"

#define DHTPIN 2
#define DHTTYPE DHT11  // DHT 11

DHT dht(DHTPIN, DHTTYPE);

void setup() {
 Serial.begin(9600);
 pinMode(12, OUTPUT);
 dht.begin();
}

void loop() {
  delay(2000);
  float h = dht.readHumidity();
  // Read temperature as Celsius (the default)
  float t = dht.readTemperature();
  if(t>=33)
    digitalWrite(12, HIGH);
  else
    digitalWrite(12, LOW);

    Serial.print(("Humidity: "));
    Serial.print(h);
    Serial.print((" Temperature: "));
    Serial.print(t);
    Serial.println(("c "));
}
