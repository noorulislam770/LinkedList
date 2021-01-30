

class SLL 
{
    Node head;
    int numNodes;
    SLL()
    {
        head = null;
        numNodes = 0;
    }
    
    void AppendNode(int d)                     
    {                                       
        Node temp = new Node(d);                                                   
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node travler = null;
            travler = head;
            while(travler.next != null)
                travler = travler.next;
            travler.next = temp;
        }
        numNodes++;
        
        
    }
    
    void InsertAtStart(int d)
    {                                   // Insertion at Start
        Node temp = new Node(d);        // 1. Our List is Empty
                                        // 2. Our List is Non-Empty
        if(head == null)
        {
            head = temp;
            numNodes++;
        }
        else
        {
            temp.next = head;
            head = temp;
            numNodes++;
        }
    }
    
    void InsertAfter(int key, int d)
    {
        Node temp = new Node(d); 
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node tr = head;
            while(tr.data != key && tr != null)
                tr = tr.next;
            
            if(tr != null)
            {
                temp.next = tr.next;
                tr.next = temp;
            }
            else
                System.out.println("The Key "+key+" is not in the List");
        }
    }
    
    void InsertBefore(int key, int d)
    {
        //Write the Code for This Tpe Insertion
    }
    
    void DeleteNode(int key)
    {
      Node temp1 = head;
      Node temp2 = null;
      
      while(temp1.data!=key&temp1!=null){
          temp2 = temp1;
          temp1 = temp1.next;
      }
      
      if(temp1==null){
          System.out.println("Key did not exist!");
      }
//Task      
      else{
          //first node
          if(temp1==head){
              if(temp1.next==null){
                  head=null;
              }
              else{
                  head = head.next;
              }
          }
          //Other than first node
          else{
              //Last node
              if(temp1.next==null){
                  temp2.next=null;
              }
              //Other than last node
              else{
                  temp2  = temp1.next;
              }
          }
      }
      
    }
    void DisplayList()
    {
        Node t = head;
        System.out.println("\nTotal Number of Nodes : "+ numNodes);
        
        while(t != null)
        {
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("NULL");
    }
    
}
