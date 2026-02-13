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

8. There are 2 points to consider:
    a. If obj1==obj2 then their hash value has to be same.
    b. If the hash value of obj1 and obj2 is same it doesnt mean their values are going 
        to be same obj1.equals(obj2) can be false.

9. HashMap: Doesn't maintain order, and is not thread safe
   HashTable: Synchronized version of HashMap
   LinkedHashMap: Maintains insertion order
   TreeMap: Sorts data internally

10. In LinkedHashMap, it should always show insertion order but if we make access order as true then the most frequently accessed element will be printed at last.
     Refer main3 example in collections, mapExample.

11. while you are iterating a set, if you are trying to add element into the set, then it will throw concurrentModificationException. Hence, you should always use threadSafe.
    Refer collections, setExample, Main2 class.

12. In LinkedHashSet, insertion order is maintained but access order is not maintained. Even if we pass true it will not be passed further.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
MultiThreading
------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Daemon Thread, is any thread running in async manner. All thread we create are user thread.
   Daemon Thread is alive until its user thread is alive.

2. Garbage collector is good example of daemon thread.

3. Synchronize is used to provide lock. This is monitor lock.(which is applicable during sharing resources).
   Synchronize adds lock to every object.

4. There are other types of lock that do not acquire lock on object, they completely lock the method.
   a. Reentrant lock
   b. readWrite lock
   c. Stamped lock
   d. Semaphore

5. When a thread has shared lock, then any thread can take shared lock and can read, but no thread can provide exclusive lock to it.
   But if the thread has exclusive lock than no thread can have permission to read or write. 

6. Semaphore is used when at a same time if you want multiple threads to acquire locks.

7. Lock free mechanism also exits (it is called CAS, compare and swap)  used to achieve concurrency:
   a. AtomicInteger
   b. AtomicBoolean
   c. AtomicLong
   d. AtomicReference

8. Optimistic Read, when I am trying to update value of row where row version is version, since my query has row 
   version as 1. I will be able to update the row. Once the row is updated now the row has updated value and row 
   version as 2. If somebody else is try to update same value but they are saying it ll update value with row version as 1
   it will not be allowed. They will have to read the row again, get latest row version and then only they can update.

9. Cas solving goes like, cas(memory value,expected value,new value)
   step 1 : get the memory value
   step 2 : compare memory value with expected value
   step 3 : update the new value if expected value is same as memory value

10. CAS faces ABA issue, where when we are trying to update the value say the value was first 10(which I wanted to update) 
   then it got updated to 12 then again it become 10. So even though I am comparing with latest 10, I was not suppose to
   update this 10. This issue is resolved by using row version or by timestamp comparison.

11. Volatile keyword makes sure that read/write operation should directly happen into the memory and not from CPU's L1 cache or L2 cache.

12. Runnable and callable represents a task that needs to be executed but only difference is runnable doesn't 
    return anything and callable returns object.

13. CompletableFuture is advanced version of Future. It provides chaining. It was introduced in java 8.

14. when I say executor.submit() -> it creates new thread and does the task. Again here we are saying how many threads we need.

15. In completableFuture.supplyAsync() -> it also creates new thread for me. If along with supplier if I am not passing executor than it will
    use default Fork-Join pool executor.

16. In CompletableFuture to continue chaining there are 2 methods thenApply() and thenApplyAsync()
    after execution of the current task by supplyAsync,
    thenApply() -> current thread will continue the execution (synchronous)
    thenApplyAsync() -> new thread will be created to execute this task (Asynchronous), order is not guaranteed.

17. As thenApplyAsync() is independent task and i want to bring some ordering say, one async starting depends on previous
    async result then we can use thenCompose(). It maintains ordering for me.If I use thenComposeAsync then new thread will maintain
    all ordering for me but with thenCompose, previous thread will be used.

18. theAccept() is end of chain operations, in completable future.

19. thenCombine() is used to compare result of 2 comparableFuture.

20. Use newFixedPoolSize when you know exact amount of task needed to be completed.

21. newCachedThreadPool is used when you have to create thread pool dynamically. It is majorly used when there are a lot
    of short-lived tasks.

22. ForkAndJoinPool is nothing but, there is a big task and it will further be divided into subtasks. Once all the task is completed they will be joined back.
    There is a concept of workStealing here,
      If there is 2 thread, each working on 1 task, every thread will have its own workStealing queue. If any task can be divided, then the thread divides the 
    task into subtasks and places it into work stealing queue. If all the task is completed by the other thread, it will check its own work stealing queue, if it
    is empty, then it will check normal(submission) queue. If this queue is also empty, then it will check busy thread's work stealing queue and picks that task.

23. ThreadLocal holds the value of Thread-Local variable which is individual to every thread

24. Virtual Thread was introduced to provide higher throughput and no latency. (High throughput means able to do more tasks in same time)

25. When we create a thread (normal thread also called platform thread), jvm ask CPU to create OS thread, and platform thread is just 
    a wrapper around OS thread. Here JVM is maintaining the platform thread and we interact with platform thread but in actual we are interacting 
    with OS thread.
    Disadvantage : Its slow, this is why we are using threadPoolExceutor. (because thread creation takes time).
                   If we have to do DB call and it is taking more time than OS thread will be idle until the db call is completed.

26. The concept of virtual Thread is that, JVM will create lot of virtual thread and they will be attached to OS only if they have to run.
    In case it has to wait than it will detach itself and some other virtual thread that has to run will attach itself to OS thread.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
java 14
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. In switch case instead of giving case every line, we can use comma separated case, if there is same working for all.
2. In Switch, by mistake if i missed break then it will fall through next case. but here it doesn't all we have to do is use case ->, no need to add break here.
3. Using switch, now we can even return value, but we will have to use yield, to return.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
java 17
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Sealed Classes were introduced, so that we can have control over who can implement and cannot implement interfaces.
    If we make interface as sealed than we have to make sure, only the permitted ones can implement the interface, also the
    class has limitation it should be either final or non-sealed.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Java 21
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. In java 21, Sequenced Collection,Sequenced Map, Sequenced Set was introduced, because all the collection's classes have different method to get the first element to
   get the last element or to reverse the collection. To have common method so that it is easy to maintain and work with.

