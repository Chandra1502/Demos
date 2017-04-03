class Person
 {
 private String name;
 private int age;



 public Person(String nm, int ag) { name = nm; age = ag; }
 
 void showDetails(){
	 System.out.println(name+"\t"+age);
 }
 }


 class BaseballPlayer extends Person
  {
  private int homeruns;
  private double bat_avg;


  

  BaseballPlayer(String name, int age, int hr, double bavg)
  {
  super(name, age); // THIS CAUSES AN ERROR. I DON'T KNOW WHY
  homeruns = hr;
  bat_avg = bavg;
  }
  
  public static void main(String a[]) {
		Person p = new BaseballPlayer("Chandra",23,12,20.3);
		p.showDetails();
		
	}
  
 } 
