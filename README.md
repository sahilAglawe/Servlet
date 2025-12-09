# Servlet – Complete Notes

## 1. List of Servers
Servers are applications that host and run web applications. In Java, common servers are:

- **Apache Tomcat** – Most popular servlet container  
- **Jetty** – Lightweight and embeddable  
- **GlassFish** – Full Java EE server  
- **WildFly / JBoss** – Enterprise-level Java server  
- **WebLogic** – Oracle enterprise server  
- **WebSphere** – IBM enterprise server  

---

## 2. Types of Servers
Servers are mainly classified into:

### **a. Web Server**
Handles only HTTP requests.  
Examples: Tomcat, Jetty

### **b. Application Server**
Supports full Java EE/Jakarta EE functionality (EJB, JMS, JPA).  
Examples: GlassFish, WildFly, WebLogic, WebSphere

---

## 3. Servlet API Architecture
The Servlet API follows a layered architecture:

Servlet (Interface)
↑
GenericServlet (Abstract Class)
↑
HttpServlet (Abstract Class)
↑
Your Custom Servlet Class

markdown
Copy code

### Key Packages:
- `jakarta.servlet.*`
- `jakarta.servlet.http.*`

---

## 4. Interface: Servlet
Base interface for all servlets. It defines 5 methods:

- `init(ServletConfig config)`  
- `service(ServletRequest req, ServletResponse res)`  
- `destroy()`  
- `getServletConfig()`  
- `getServletInfo()`

Most developers extend **HttpServlet** instead of implementing Servlet manually.

---

## 5. ServletConfig
Object used to pass **initialization parameters** to a servlet.

### Features:
- One `ServletConfig` per servlet
- Reads `<init-param>` from `web.xml`
- Used for servlet-specific data

### Methods:
- `getInitParameter(String name)`
- `getInitParameterNames()`
- `getServletName()`
- `getServletContext()`

---

## 6. ServletContext
Application-level object shared by **all servlets** in the project.

### Features:
- Global initialization parameters
- Used to share data across servlets
- Provides application-wide information

### Methods:
- `getInitParameter()`
- `setAttribute()`, `getAttribute()`
- `getRealPath()`

---

## 7. Scopes in Java Servlet
Servlets support four scopes:

| Scope | Object | Lifetime |
|-------|---------|-----------|
| **Request** | `HttpServletRequest` | One HTTP request |
| **Session** | `HttpSession` | User session |
| **Application** | `ServletContext` | Entire application |

---

## 8. RequestDispatcher
Used for **request forwarding** and **including resources**.

### Methods:
- `forward(request, response)` – Forward request internally  
- `include(request, response)` – Include output of another resource

Cannot redirect to external website.

---

## 9. Session Tracking System
Used to maintain user identity across multiple requests.

### Techniques:
- **Cookies**
- **URL Rewriting**
- **Hidden Form Fields**
- **HttpSession**
- **SSL Session Tracking**

---

## 10. Filter
Filters intercept requests before they reach the servlet.

### Uses:
- Authentication  
- Logging  
- Input validation  
- Compression  
- CORS handling  

### Methods:
- `init()`
- `doFilter()`
- `destroy()`

