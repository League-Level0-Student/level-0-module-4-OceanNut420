
void setup() {
  size(500,300);
  PImage minecraft = loadImage("yellowmom.jpg");
  minecraft.resize(500,300);
  background(minecraft);
  PImage creeper;
  creeper=loadImage("cousinisfat.png");
  creeper.resize(7,7);
  image(creeper,220,222);
}

void draw() {
  if(mousePressed){
    if(mouseX>209 && mouseX<226 && mouseY>211 && mouseY<228){
      fill(19,237,57);
      ellipse(mouseX, mouseY, 20,20);
    }
  }
  boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
}
