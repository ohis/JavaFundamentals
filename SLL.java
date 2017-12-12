public class SLL{
    public Node head;
    public SLL(){
        this.head = null;
    }

   // Node newNode = new Node(8);

   public void add(int value){
       Node newNode = new Node(value);
       if(head == null){
           head = newNode;
       } else{
           Node current = head;
           while(current.next != null){
               current = current.next;
           }
           current.next = newNode;
       }
   }
   
   public void remove(){
       Node current = this.head;
       Node runner = current.next;
       while(runner.next != null){
           runner = runner.next;
           current = current.next;
       }
       current.next = null;
       //current = current.next;
   }
   public int size(){
       int count = 0;
       if(head == null){
           return count;
       }

       Node currentNode = this.head;
       count+=1;
       while(currentNode.next != null){
        count++;
           currentNode = currentNode.next;
          
       }
       return count;
   }

   public void printValues(){

      Node current = head;
      while(current != null){
          System.out.println(current.value);
          current = current.next;
      }
   }
   public Node find(int val){
       if(head == null){
           return null;
       }
       Node current = this.head;
       while(current.next != null){
           if(current.value == val){
               return current;
           }
           current = current.next;
       }

       return null;
   }

}