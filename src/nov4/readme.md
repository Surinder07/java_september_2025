## Recap 

1. Exception handling 
2. Custom exceptions 
3. Generics 
4. intro to collections
5. Wrapper classes 
6. Type casting 


throw vs throws 

type safety , working with any type of data in collections

## Immutability 

 make all the variables as private and final
 do not provide any setter methods 
 make the class as final 

## packages 
1. inbuilt
lang, util, io, sql etc

2. user defined 
we created oct2, oct4




## Collection 
framework provided by Java to store and manipulate group of objects 
1. Generics 
   2. Wrapper classes , no primitives allowed 
      3. Objects 

                             Iterable [I]                               Map<k,v> [I] 
                                |                                              |
                            Collection [I]                                 HashMap
          |                     |                     |
        List [I]              Set [I]                 Queue [I]
         |
      ArrayList [C]        HashSet [C]                  Deque[I]
      LinkedList[C]       LinkedHashSet[C]             PriorityQueue[C]
                            TreeSet[C]
        |
      Stack  [C]



## List [I]
 ordered collection 
1. ArrayList      2. LinkedList


array : size is fixed 
arrayList : size can be changed or vary or dynamic
Java 7 
ArrayList<Integer> list = new ArrayList();  , 75% full , size = 10

n + n/2 + 1                 10 + 10/2 + 1 = 16


Java 8
ArrayList<Integer> list = new ArrayList();
size = 0 
when you insert the first element, then the size = 10 array will be created












