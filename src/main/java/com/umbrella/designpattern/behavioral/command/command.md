#Command

##
Command Pattern is one of the Behavioral Design Pattern. Command design pattern is used to implement loose coupling in a request-response model.


In command pattern, the request is sent to the invoker and invoker pass it to the encapsulated command object.

Command object passes the request to the appropriate method of Receiver to perform the specific action.

The client program create the receiver object and then attach it to the Command. Then it creates the invoker object and attach the command object to perform an action.

Now when client program executes the action, it’s processed based on the command and receiver object.

##Command Design Pattern Example

We will look at a real life scenario where we can implement Command pattern. Let’s say we want to provide a File System utility with methods to open, write and close file. This file system utility should support multiple operating systems such as Windows and Unix.

To implement our File System utility, first of all we need to create the receiver classes that will actually do all the work.

Since we code in terms of interface in java, we can have FileSystemReceiver interface and it’s implementation classes for different operating system flavors such as Windows, Unix, Solaris etc.

##Command Pattern Important Points
- Command is the core of command design pattern that defines the contract for implementation.
- Receiver implementation is separate from command implementation.
- Command implementation classes chose the method to invoke on receiver object, for every method in receiver there will be a command implementation. It works as a bridge between receiver and action methods.
- Invoker class just forward the request from client to the command object.
- Client is responsible to instantiate appropriate command and receiver implementation and then associate them together.
- Client is also responsible for instantiating invoker object and associating command object with it and execute the action method.
- Command design pattern is easily extendible, we can add new action methods in receivers and create new Command implementations without changing the client code.
- The drawback with Command design pattern is that the code gets huge and confusing with high number of action methods and because of so many associations.

##Applicability

**Use the Command pattern when you want to parametrize objects with operations.**

The Command pattern can turn a specific method call into a stand-alone object. This change opens up a lot of interesting uses: you can pass commands as method arguments, store them inside other objects, switch linked commands at runtime, etc.

`Here’s an example: you’re developing a GUI component such as a context menu, and you want your users to be able to configure menu items that trigger operations when an end user clicks an item.
`
**Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.**

As with any other object, a command can be serialized, which means converting it to a string that can be easily written to a file or a database. Later, the string can be restored as the initial command object. Thus, you can delay and schedule command execution. But there’s even more! In the same way, you can queue, log or send commands over the network.

**Use the Command pattern when you want to implement reversible operations.**

Although there are many ways to implement undo/redo, the Command pattern is perhaps the most popular of all.

To be able to revert operations, you need to implement the history of performed operations. The command history is a stack that contains all executed command objects along with related backups of the application’s state.

This method has two drawbacks. First, it isn’t that easy to save an application’s state because some of it can be private. This problem can be mitigated with the Memento pattern.

Second, the state backups may consume quite a lot of RAM. Therefore, sometimes you can resort to an alternative implementation: instead of restoring the past state, the command performs the inverse operation. The reverse operation also has a price: it may turn out to be hard or even impossible to implement.

## Pros and Cons

:heavy_check_mark: Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
:heavy_check_mark: Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
:heavy_check_mark: You can implement undo/redo.
:heavy_check_mark: You can implement deferred execution of operations.
:heavy_check_mark: You can assemble a set of simple commands into a complex one.
:x: The code may become more complicated since you’re introducing a whole new layer between senders and receivers.







