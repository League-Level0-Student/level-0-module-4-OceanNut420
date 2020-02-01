
void setup() {
  size(640,360);
  PImage face = loadImage("mom.jpg");
  background(face);
}

void draw() {
  fill(255,255,255);
  ellipse(322,178,90,90);
  ellipse(390,178,90,90);
if(mouseX>302 && mouseX<342 && mouseY>158 && mouseY<198){
 fill(3,3,3);
 ellipse(mouseX, mouseY, 35,35);
 ellipse(mouseX+68,mouseY,35,35);
}
else{
  fill(3,3,3);
  ellipse(322,178,35,35);
  ellipse(390,178,35,35);
}
}
