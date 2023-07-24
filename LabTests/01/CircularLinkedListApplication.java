//STUDENT NAME: Ahmed Adel Al-Khawahir
//STUDENT ID: 201949310			Sec:55


public class CircularLinkedListApplication {
   public static void main(String[] args) {
     CLL<Integer> circularList = new CLL<Integer>();
     CLL<String> emptyList = new CLL<String>();
     
     circularList.addToEnd(100);
     circularList.addToEnd(5);
     circularList.addToEnd(8);
     circularList.addToEnd(10);
     
     circularList.printTheList();
     
     //Test Code
     System.out.println("The length of the above list is>> " + circularList.lengthOfTheList());
     System.out.println("The length of the empty list is>> " + emptyList.lengthOfTheList());
     
     System.out.println("We delete the first element which is>> " + circularList.deleteFromBeginning());
     System.out.println("And now the list is ");
     circularList.printTheList();
     
     System.out.println("We delete the first element from an empty list>> " + emptyList.deleteFromBeginning());
     System.out.println("This should print null. And now the list is ");
     emptyList.printTheList();  
     
     
   }
}