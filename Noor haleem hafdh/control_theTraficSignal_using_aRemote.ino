   #include <IRremote.h>

int RECV_PIN = A0;
int led[]={2,3,4,5,6,7,8,9,10};

IRrecv irrecv(RECV_PIN);
decode_results results;

void setup()
{
  Serial.begin(9600);
  
  for(int i=0;i<10;i++)
  {
     pinMode(led[i],OUTPUT);
  };
  
  irrecv.enableIRIn(); 
}

void loop() {




                 digitalWrite(led[0],HIGH);
                 delay(1000);
                 digitalWrite(led[0],LOW);
                 delay(10);

          xx();
                digitalWrite(led[1],HIGH);
                  delay(1000);
                            digitalWrite(led[1],LOW);
                 delay(10);

                     xx();

                 digitalWrite(led[2],HIGH);
                  delay(1000);
              digitalWrite(led[2],LOW);
                 delay(10);
           xx();

 }
  void xx()
  {
     if (irrecv.decode(&results))
  {
        switch (results.value)
        {
           
            
            case 0xFF52AD:
            //9
               
                 digitalWrite(led[0],HIGH);
                 delay(5000);
                 digitalWrite(led[0],LOW);
                 delay(10);

          
            break ;
            
           
         }
            irrecv.resume();
            delay(100);
    }}
