#Proxy
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

##Problem
Why would you want to control access to an object? Here is an example: you have a massive object that consumes a vast amount of system resources. You need it from time to time, but not always.

![](../../../../../../resources/img/problem-proxy.png)

You could implement lazy initialization: create this object only when it’s actually needed. All of the object’s clients would need to execute some deferred initialization code. Unfortunately, this would probably cause a lot of code duplication.

In an ideal world, we’d want to put this code directly into our object’s class, but that isn’t always possible. For instance, the class may be part of a closed 3rd-party library.

##Solution
The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object. Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.

![](../../../../../../resources/img/problem-proxy2.png)
>The proxy disguises itself as a database object. It can handle lazy initialization and result caching without the client or the real database object even knowing.

But what’s the benefit? If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class. Since the proxy implements the same interface as the original class, it can be passed to any client that expects a real service object.

##Structure

![](../../../../../../resources/img/structure-proxy.png)

- The Service Interface declares the interface of the Service. The proxy must follow this interface to be able to disguise itself as a service object.
- The Service is a class that provides some useful business logic.
- The Proxy class has a reference field that points to a service object. After the proxy finishes its processing (e.g., lazy initialization, logging, access control, caching, etc.), it passes the request to the service object.
  
    Usually, proxies manage the full lifecycle of their service objects.

- The Client should work with both services and proxies via the same interface. This way you can pass a proxy into any code that expects a service object.

##Applicability

**Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.**

>Instead of creating the object when the app launches, you can delay the object’s initialization to a time when it’s really needed.

**Access control (protection proxy). This is when you want only specific clients to be able to use the service object; for instance, when your objects are crucial parts of an operating system and clients are various launched applications (including malicious ones).**

>The proxy can pass the request to the service object only if the client’s credentials match some criteria.

**Local execution of a remote service (remote proxy). This is when the service object is located on a remote server.**

>In this case, the proxy passes the client request over the network, handling all the nasty details of working with the network.

**Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.**

>The proxy can log each request before passing it to the service.

**Caching request results (caching proxy). This is when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.**

>The proxy can implement caching for recurring requests that always yield the same results. The proxy may use the parameters of requests as the cache keys.

**Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.**

>The proxy can keep track of clients that obtained a reference to the service object or its results. From time to time, the proxy may go over the clients and check whether they are still active. If the client list gets empty, the proxy might dismiss the service object and free the underlying system resources.

>The proxy can also track whether the client had modified the service object. Then the unchanged objects may be reused by other clients.

## Pros and Cons

:heavy_check_mark: You can control the service object without clients knowing about it.
:heavy_check_mark: You can manage the lifecycle of the service object when clients don’t care about it.
:heavy_check_mark: The proxy works even if the service object isn’t ready or is not available.
:heavy_check_mark: Open/Closed Principle. You can introduce new proxies without changing the service or clients.
:x: The code may become more complicated since you need to introduce a lot of new classes.
:x: The response from the service might get delayed.

## Relations with Other Patterns

- Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator provides it with an enhanced interface.

- Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own. Unlike Facade, Proxy has the same interface as its service object, which makes them interchangeable.

- Decorator and Proxy have similar structures, but very different intents. Both patterns are built on the composition principle, where one object is supposed to delegate some of the work to another. The difference is that a Proxy usually manages the life cycle of its service object on its own, whereas the composition of Decorators is always controlled by the client.

##Usage of the pattern in Java

Usage examples: While the Proxy pattern isn’t a frequent guest in most Java applications, it’s still very handy in some special cases. It’s irreplaceable when you want to add some additional behaviors to an object of some existing class without changing the client code.

Some examples of proxies in standard Java libraries:

- java.lang.reflect.Proxy
- java.rmi.*
- javax.ejb.EJB
- javax.inject.Inject
- javax.persistence.PersistenceContext


