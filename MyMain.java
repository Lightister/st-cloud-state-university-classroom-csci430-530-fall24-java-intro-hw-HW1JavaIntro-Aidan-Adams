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

    store(<input stream>, <linked list>){
      File dataFile1 = "StudentList.txt";
    boolean hasNext = true;
    Scanner fileScanner1 = new Scanner(dataFile1);
      string item1 = fileScanner1.nextString();
      string item2 = fileScanner1.nextString();
      string item3 = fileScanner1.nextString();
      while(Next){
      
        Person temp = Person( item1, item2, item3);
        list.add(temp);
       if (fileScanner1.hasNext()) {
				 string item1 = fileScanner1.nextString();
         string item2 = fileScanner1.nextString();
         string item3 = fileScanner1.nextString();
			    } else {
				    Next = false;
     
			          }
      }
      
    }


    staticvoid display(<output stream>, <linked list>){
      for( int i = 0; i <= list.size(); i++){
        person entry = Personlist.get(i);
       System.out.println(entry.toString);
      }
    }

    staticvoid find(string sid,<linked list>){
      bool found = false;
    for( int i = 0; i <= list.size(); found== false i++){
        Current_Person entry = Personlist.get(i);
        if(entry.getFirst() == sid)
          found = true;
      else if(entry.getLast() == sid)
          found = true;
      else if(entry.getID() == sid)
          found = true;
      if(found)
        System.out.println("Entry found at index" + i);
        return i;
      }
      if(!found){
        System.out.println("Not found");
        return -1;
      }

    }


fileScanner1.close();
    
}
