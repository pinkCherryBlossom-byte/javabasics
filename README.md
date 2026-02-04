# javabasics

-------------------------------------------------------------------------------------------------------------
Java Reflection :
--------------------------------------------------------------------------------------------------------------
Java Reflection is nothing but metadata of the class and using reflection we are modifier the actual values.
Java Reflection covers invoking and viewing :
0. how to create a Reflection (3 ways )
1. class and its modifier
2. methods public and private
3. fields public and private
4. changing value of public and private field
5. viewing constructor (this literally breaks singleton class as we can view and modify private constructor)

-----------------------------------------------------------------------------------------------------------------
Switch Case :
-----------------------------------------------------------------------------------------------------------------
1. Case N ->
   if you want to return a value in switch case use case N :
    int a = 1;
    String output = switch(a) {
     case 1-> "one";
     case 2-> "two";
     default-> "none";
    };

2. In case you want to write block of code and then return a value then you can use yield statement
   int a = 1;
   String output = switch(a) {
     case 1-> {
         //some logic here
         yield "one";
       }
     case 2-> "two";
     default-> "none";
   };

----------------------------------------------------------------------------------------------------------------
Collections
----------------------------------------------------------------------------------------------------------------
1. PriorityQueue by default saves the data in ascending order. 
   Internally it uses min heap.
    
    Time complexity:
   - Add and offer -> O(log n)
   - peek -> O(1)
   - poll and remove head element -> O(log n)
   - remove arbitrary element ->O(n)
   
2. Internally Arrays.sort(arr) uses quicksort mechanism to sort

3. Deque stands for double ended queue
   
   Time complexity:
   - Insertion -> O(1) but after resizing its O(n)
   - Deletion -> O(1)
   - Search -> O(1)

4. Both ArrayDeque and PriorityQueue is not threadSafe
    for PriorityQueue -> threadsafe is -> PriorityBlockingQueue
    for ArrayDeque -> threadsafe is -> ConcurrentLinkedDeque

5. Vector is exact same as arrayList but vector is thread safe.

6. You can also use copyOnWriteArrayList in list to make it thread safe.

7. Stack is thread safe. 