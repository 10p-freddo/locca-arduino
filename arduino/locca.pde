const int transistorBasePin = 2;

void triggerRemote() {
  digitalWrite(transistorBasePin, HIGH);
  delay(2000);
  digitalWrite(transistorBasePin, LOW);
}

void setup() {
  pinMode(transistorBasePin, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  if (Serial.available() > 0) {
    Serial.read();
    triggerRemote();
  }
}
