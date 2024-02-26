# Project Notes

## Command Mode
- a design pattern
- idea: wrap commands as objects (something can be "stored/retrieved"), and put them in a queue
  - easier management (add / modify / revert / reorder)
  - decouple client and server (maintenance and scalability)
- Three agents
  - receiver, caller, client
  - like TV: TV can be turned on / off (receiver action), we (client) use TV controller buttons (caller) to control TV (receiver)

## Runnable and Callable<V>
- Both can be used for multi-threaded program
- They are different at *return value handling* and *Exception handling*
  - Return value: 
    - Runnable does not return values or take arguments
    - Callable<V> return value of type T, but doesn't take arguments either
  - Exception
    - Runnable doesn't throw Exceptions
    - Callable can throw Exceptions