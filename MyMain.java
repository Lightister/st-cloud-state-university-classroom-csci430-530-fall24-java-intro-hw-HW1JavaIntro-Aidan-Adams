public class Person {
  private String Firstname;
  private String Lasttname;
  private String ID;


public Person(String FirstName, String Lastname, String ID){
  this.Firstname = Firstname;
  this.Lastname = Lastname;
  this.ID = Id;

Public String getFirst() {
  return Firstname;
}
Public String getLast() {
  return Lastname;
}
Public String getID() {
  return ID;
}
@override
public String toString() {
  return 'Person{Firstname='" + Firstname + "', Lastname=" + Lastname + "', ID =" + ID + "}:;

}



  public class MyMain {


    staticvoid display(<output stream>, <linked list>){
      for( int i = 0; i <= list.size(); i++){
        string entry = Personlist.get(i);
        println /// add print here
      }
    }

    staticvoid find(<string target>,<linked list>){
      bool found = false;
    for( int i = 0; i <= list.size(); found== false i++){
        Current_Person entry = Personlist.get(i);
        if(entry.getFirst() == target)
          found = true;
      else if(entry.getLast() == target)
          found = true;
      else if(entry.getID() == target)
          found = true;
      if(found)
        print
      }

    }



    
}
