#include <SPI.h>
#include <DMD2.h>
SoftDMD dmd(2,1);
#include <fonts/SystemFont5x7.h>
void setup() {
  Serial.begin(9600);
  dmd.setBrightness(255);
  dmd.selectFont(SystemFont5x7);
  dmd.begin();}
  void loop()
  {
    boolean pixls[16][64];
    byte serialData[17];
    if (Serial.available()>0)
    {Serial.readBytes(serialData,17);
    if(serialData[0]==1)
    {for(int i=0;i<16;i++)
    {pixls[i][0]=serialData[i+1];}
    for (int k=64; k>0;k--){
      for(int i=0; i<16 ;i++){
        pixls[i][k]=pixls[i][k-1];
        }}}
        if(serialData[0]==0){
          for(int i=0;i<16;i++)
          {pixls[i][63]=serialData[i+1];}
          for(int k=0;k<64;k++){
            for(int i=0;i<16;i++){
              pixls[i][k]=pixls[i][k+1];
              }}}
              for(int i=0;i<64;i++){
                for(int j=0;j<16;j++){
                  dmd.setPixel(i,j,(pixls[j][i]==1)? GRAPHICS_ON: GRAPHICS_OFF);}}}
                  else{
                    for(int h=0;h<10;h++){delay(10);
                    if(Serial.available()>0){break;}
                    if (h==9){
                      while(!Serial.available()){
                        dmd.drawString(0,0,"");
                        dmd.drawString(0,8,serialData);
                        if (Serial.available ()>0)
                        {break;}
                        }}}}}
