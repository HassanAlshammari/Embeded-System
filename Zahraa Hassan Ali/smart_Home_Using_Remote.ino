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

  if (irrecv.decode(&results))
  {
        switch (results.value)
        {
            case 0xFF6897: 
            //0
                for(int i=0;i<10;i++)
                {
                  digitalWrite(led[i],LOW);
                };
            break ;
            
            case 0xFF30CF:
            //1
                 digitalWrite(led[0],HIGH);
                 delay(1000);
            break ;
            
            case 0xFF18E7: 
            //2
                digitalWrite(led[1],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF7A85:
            //3
                 digitalWrite(led[2],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF10EF:
            //4 
                digitalWrite(led[3],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF38C7:
            //5
                 digitalWrite(led[4],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF5AA5:
            //6 
                digitalWrite(led[5],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF42BD:
            //7
                 digitalWrite(led[6],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF4AB5: 
            //8
                digitalWrite(led[7],HIGH);
                  delay(1000);
            break ;
            
            case 0xFF52AD:
            //9
                 digitalWrite(led[8],HIGH);
                  delay(1000);
            break ;
           
            
      
         }
            irrecv.resume();
            delay(100);
    }
 }
  
