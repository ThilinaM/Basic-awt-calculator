import java.awt.*;// Import java Awt all classes
import java.awt.event.*;// Import all awt.event...
class Calculater extends Frame implements ActionListener {
//Create button variables
Button comminas;
Button comdivide;
Button comequal;
Button comclear;
Button complas;
Button commulti;
Button commc;
Button comMplas;
Button comMminas;
Button mula;
Button exiter;
Button memo;
Button dasama;
Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
Button num00;
//make a text object...
TextField t = new TextField("", 35);
String st; //Variable for add a numer
String st1 = "";//variable which display in text feilds.
double make1, make2, answer;
String operation, no1, no2, totel, madd;
//Code for create the Frame
Calculater() { //call the constractor.
setTitle("My Calculator");//give name for the calculater Form.
setSize(300, 440); // Make the size of the Frame
setBackground(Color.blue);
;// Add colour to the background of the Frame...
setVisible(true);//Code for display the form which we created above.
Panel p1 = new Panel();// make a new panel
add(p1, BorderLayout.NORTH);//add panel to the Form in north side
p1.add(t); //add our text feild to the panel
//Make Buttons object
commc = new Button("MC");// Memory Clear
comMplas = new Button("M+");//Memory add
comMminas = new Button("M-");//Memory remove
memo = new Button("MR");//Memory Recall
comclear = new Button("CE");// clear every thing.
comdivide = new Button("/");
commulti = new Button("*");
num7 = new Button("7");
num8 = new Button("8");
num9 = new Button("9");
comminas = new Button("-");
num4 = new Button("4");
num5 = new Button("5");
num6 = new Button("6");
complas = new Button("+");
num1 = new Button("1");
num2 = new Button("2");
num3 = new Button("3");
comequal = new Button("=");
num0 = new Button("0");
num00 = new Button("00");
dasama = new Button(".");
exiter = new Button("Help");// add help button to the panel....
mula = new Button("V");
//Create a panel
Panel p = new Panel();
//Place the panel on Frame.
add(p, BorderLayout.CENTER);
//Add buttons to the Panel.
p.add(commc);
p.add(comMplas);
p.add(comMminas);
p.add(memo);
p.add(comclear);
p.add(mula);
p.add(comdivide);
p.add(commulti);
p.add(num7);
p.add(num8);
p.add(num9);
p.add(comminas);
p.add(num4);
p.add(num5);
p.add(num6);
p.add(complas);
p.add(num1);
p.add(num2);
p.add(num3);
p.add(comequal);
p.add(num0);
p.add(num00);
p.add(dasama);
p.add(exiter);
//Use action lisner....
num1.addActionListener(this);
num2.addActionListener(this);
num3.addActionListener(this);
num4.addActionListener(this);
num5.addActionListener(this);
num6.addActionListener(this);
num7.addActionListener(this);
num8.addActionListener(this);
num9.addActionListener(this);
num0.addActionListener(this);
num00.addActionListener(this);
dasama.addActionListener(this);
comminas.addActionListener(this);
complas.addActionListener(this);
comequal.addActionListener(this);
comdivide.addActionListener(this);
commulti.addActionListener(this);
comMplas.addActionListener(this);
comMminas.addActionListener(this);
memo.addActionListener(this);
comclear.addActionListener(this);
exiter.addActionListener(this);
addWindowListener(new WindowAdapter() {// Add WindowListener to the Frame,
public void windowClosing(WindowEvent we) // Make a method for closing window .
{
System.exit(3);// Exit from the window (add int value to parameter list);
}
});
//create a grid Layout
GridLayout g = new GridLayout(0, 4, 2, 2);
//add grid lay out to the panael
p.setLayout(g);
}
public static void main(String args[]) {//main method..
new Calculater(); //call the constractor.
}
//create an action Performed
public void actionPerformed(ActionEvent e) {
Object o = e.getSource(); //make a object for recognized buttons
// number 1 click
if (o.equals(num1)) {
st = num1.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 2 click..
if (o.equals(num2)) {
st = num2.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 3 click..
if (o.equals(num3)) {
st = num3.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 4 click..
if (o.equals(num4)) {
st = num4.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 5 click..
if (o.equals(num5)) {
st = num5.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 6 click..
if (o.equals(num6)) {
st = num6.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 7 click..
if (o.equals(num7)) {
st = num7.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 8 click..
if (o.equals(num8)) {
st = num8.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 9 click..
if (o.equals(num9)) {
st = num9.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 0 click..
if (o.equals(num0)) {
st = num0.getLabel();
st1 = st1 + st;
t.setText(st1);
}
//if number 00 click..
if (o.equals(num00)) {
st = num00.getLabel();
st1 = st1 + st;
t.setText(st1);
}//if number . click..
if (o.equals(dasama)) {
st = dasama.getLabel();
st1 = st1 + st;
t.setText(st1);
}
// if enter the + mark//
if (o.equals(complas)) {
no1 = t.getText();
make1 = Double.parseDouble(no1);
operation = complas.getLabel();
t.setText("");
makesero();
}
// if enter the - mark//
if (o.equals(comminas)) {
no1 = t.getText();
make1 = Double.parseDouble(no1);
operation = comminas.getLabel();
t.setText("");
makesero();
}
// if enter the / mark//
if (o.equals(comdivide)) {
no1 = t.getText();
make1 = Double.parseDouble(no1);
operation = comdivide.getLabel();
t.setText("");
makesero();
}
// if enter the * mark//
if (o.equals(commulti)) {
no1 = t.getText();
make1 = Double.parseDouble(no1);
operation = commulti.getLabel();
t.setText("");
makesero();
}
// if enter the M+ mark//
if (o.equals(comMplas)) {
madd = t.getText();// Add text to memmory..
}
// if enter the M- mark//
if (o.equals(comMminas)) {
madd = "";
}
// number MR click
if (o.equals(memo)) {
st = madd;
st1 = st1 + st;
t.setText(st1);
}
// if enter the CE mark (clear every thing);
if (o.equals(comclear)) {
st = "";
st1 = "";
t.setText("");
}
// if enter the Help mark (clear every thing);
if (o.equals(exiter)) {
//Create a panel
Panel h1 = new Panel();
//Place the panel on Frame.
add(h1, BorderLayout.SOUTH);
//Make labels .
Label label1 = new Label("MC:Memory Clear..M+:Memory Add.. ", Label.CENTER);
Label label2 = new Label("M-:Memory Clear.. MR:Memory Recall", Label.LEFT);
h1.add(label1);//add label to panel
h1.add(label2);
//250,340(300, 540);// Resize the calculater.....
}
// if enter the = mark//
if (o.equals(comequal)) {
no2 = t.getText();//take the value of text.
make2 = Double.parseDouble(no2);//convert the value as a double number.
if (operation == "+") {//if add a + mark button.
add();//call the add methord.
}
if (operation == "-") {
minas();//call the minas methord .
}
if (operation == "/") {
devide();//call the devide methord.
}
if (operation == "*") {//call the * methord.
multifly();
}
}
}
void add() {//create a methord for making addition.
answer = make1 + make2;
totel = String.valueOf(answer);
t.setText(totel);
makesero();
}
void minas() {//create a methord for minas.
answer = make1 - make2;
totel = String.valueOf(answer);
t.setText(totel);
makesero();
}
void devide() {//create a methord for devide.
answer = make1 / make2;
totel = String.valueOf(answer);
t.setText(totel);
makesero();
}
void multifly() {//create a methord for *.
answer = make1 * make2;
totel = String.valueOf(answer);
t.setText(totel);
makesero();
}
//make st1 and st make 0;
void makesero() {
st1 = "";
st = "";
}
}