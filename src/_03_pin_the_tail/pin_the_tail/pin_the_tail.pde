PImage donkey;
PImage tail;
void setup() {
  size(130,236);
  donkey = loadImage("deadpoohole.png");
 tail = loadImage("crustymom.png");
tail.resize(40,60);
}

void draw() {
  background(donkey);
  if(mousePressed){
   if(mouseX>111 && mouseX<131 && mouseY>209 && mouseY<229){
     image(tail,95,195);
   }
  }
}
