## FAQ
1. What is a Formatter and Why it is required?
   - A formatter is a component or utility in programming used to convert an object or data into a specific, readable, or required format, and vice versa.
   - It ensures that data is displayed, inputted, or stored in a consistent and expected format, which is particularly important in user interfaces, APIs, or when dealing with data exchange between systems.
  
2. Explain Binding Result?
  - In the context of Spring MVC, BindingResult is an interface used to capture and manage the result of validation.
  -  It holds the outcome of binding input data to an object and provides access to validation errors if any constraints are violated.

## Annotations
1. Components - create the object and registers that object in Spring IOC container
2. ComponentScan - Scans the base packages and if Component annotation is found it creates and registers the object in the IOC container
3. Configuration - Marks that particular class as a configuration file where the container reads the file and creates, registers, and manages spring beans
4. Bean - This annotation is used to create spring bean
5. Autowired - automatically wires the vales to their respective dependencies, automatic dependency injection
6. Value - This annotation is used to inject values into fields, method parameters, and constructor arguments
7. Primary - designates a bean as the default candidate when there are multiple beans of the same type exist
8. Qualifier - Provides more granular control by specifying which bean should be implemented when multiple beans are available. Qualifier > Primary
9. PropertySource - used in the config file to provide the location of the properties file
10. Required - when the field is marked as required, we need to provide the value otherwise it throws an exception
11. PostConstruct - Runs after the bean is created and dependencies are injected.Used to perform any initialization tasks (e.g., setting up resources).Example: Connecting to a database after the bean is ready.
12. PreDestroy - Runs before the bean is destroyed.Used to perform cleanup tasks (e.g., closing connections or releasing resources).Example: Closing a database connection before shutting down.
13. Controller - Creates the bean of that particular class and stores in the container also indicates that the particular class is a controller.
14. RequestMapping - We Annotate the handler method with this annotation, used to map web requests to specific controller methods. It defines how URLs are handled by the application. Connects HTTP requests (like GET, POST) to specific Java methods in a controller.
Handles requests based on the URL, HTTP method, headers, and more.
15. ResponseBody - Spring annotation that tells the framework to send the method's return value directly in the HTTP response body, instead of rendering a view (like a JSP or HTML page). Converts the return value to a web-friendly format (like JSON, XML, or plain text).
Commonly used for building RESTful APIs where data is sent instead of web pages.
16. RequestParam - helps us to bind our form parameters to variables.
17. ModelAttribute - It helps in binding HTTP request parameters (such as form fields) to a Java object. Method-level: Can be used on a method to add an attribute to the model that will be available to all handler methods.Parameter-level: Can be used on a method parameter to automatically bind form data to a Java object.
18. Valid - the @Valid annotation is used to trigger validation for a bean or object based on the constraints defined in the bean's class. It is part of the BeanValidation API (JSR 303 and JSR 380).

## Spring DataBinding
1. What is data binding in the context of Spring MVC? Why is it important?

2. How does Spring bind HTTP request parameters to method arguments in a controller?

3. What is the purpose of the @ModelAttribute annotation? How does it assist in data binding?

4. Explain how to use the @RequestParam annotation for binding query parameters or form data. Provide an example.

5. What is the difference between @RequestParam and @PathVariable in data binding?

6. How does Spring handle binding data to complex objects, such as a custom Java class?

7. What is the purpose of the BindingResult interface in Spring MVC? How is it used?

8. What happens if there is a type mismatch during data binding? How can you handle such errors?

9. How can you configure custom property editors in Spring for specific data types?

10. What is the role of the @InitBinder annotation in Spring MVC? Provide an example of its usage.

11. Explain the use of @Validated or @Valid annotations in the context of data binding. How do they integrate with the BindingResult?

12. How does Spring MVC handle form backing objects for binding and validation?

13. What is the role of the ConversionService in data binding? How do you register custom converters?

14. How can you handle date and time formatting during data binding in Spring MVC?

15. What are default property editors provided by Spring, and when would you need to override them?

16. How can you bind a list or a map from the request to a model attribute in Spring MVC?

17. What is the purpose of the WebDataBinder class in Spring MVC?

18. Explain how Spring Formatter differs from PropertyEditor in data binding.

19. How can you customize error messages for binding and validation failures?

20. What is the difference between server-side and client-side data binding in the context of a Spring application?

## Spring-MVC
1. What is the role of the DispatcherServlet in Spring MVC?

2. Explain the typical workflow of a Spring MVC request.

3. How do you define a controller in Spring MVC? Provide an example.

4. What is the difference between @Controller and @RestController annotations?

5. How does Spring handle URL mapping to controller methods?

6. What is the purpose of the @RequestMapping annotation? How does it differ from @GetMapping and @PostMapping?

7. How can you handle form data submission in Spring MVC?

8. Explain how model data is passed from a controller to the view.

9. What is the use of the Model, ModelMap, and ModelAndView objects in Spring MVC?

10. How can you handle exceptions in Spring MVC?

11. What is the role of the ViewResolver in Spring MVC?

12. Explain how to configure a view technology (e.g., JSP, Thymeleaf) in a Spring MVC application.

13. What is the difference between RedirectView and forward in Spring MVC?

14. How do you handle file uploads in Spring MVC?

15. What is the use of the @PathVariable and @RequestParam annotations? Provide examples.

16. How can you validate form input in Spring MVC?

17. Explain the purpose of HandlerInterceptor in Spring MVC.

18. How do you implement RESTful web services using Spring MVC?

19. What is content negotiation in Spring MVC? How is it configured?

20. How can you secure a Spring MVC application?



## Spring-core
1. What is Inversion of Control (IoC) in Spring, and why is it important?

2. What is the role of the Spring IoC container in an application?

3. What are the two types of Spring IoC containers?

4. Explain the difference between ApplicationContext and BeanFactory.

5. How do you define a bean in a Spring application? Provide an example of a basic XML or annotation-based configuration.

6. What is the purpose of the @Component, @Service, @Repository, and @Controller annotations in Spring?

7. What is the default scope of a bean in Spring? How can you change it?

8. What is dependency injection (DI), and what are the different ways to implement it in Spring?

9. What is the difference between setter injection and constructor injection? Which one would you prefer and why?

10. How does Spring IoC handle circular dependencies between beans?

11. What is the role of the @Qualifier annotation in Spring? How does it work with @Autowired?

12. Can a Spring bean be lazy-initialized? How do you configure it?

13. What is the use of the @PostConstruct and @PreDestroy annotations in a Spring bean?

14. How do you define and use custom initialization and destruction methods for a bean?

15. What is the difference between a prototype-scoped bean and a singleton-scoped bean in Spring?

16. Explain the concept of BeanPostProcessor and its use cases.

17. What is the purpose of the @Configuration annotation in Spring? How does it differ from the traditional XML-based configuration?

18. How can you externalize configuration in Spring applications using properties files?

19. What is the purpose of the @Value annotation in Spring? Provide an example.

20. How does the @Primary annotation help resolve bean conflicts in Spring?
