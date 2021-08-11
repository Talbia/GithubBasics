## Synchronous vs Asynchronous JavaScript

```ssh
Synchronous JavaScript:
```
Synchronous JavaScript is a type of JavaScript where every statement of the code gets executed one by one. As the name suggests, Synchronous means to be in a sequence. So, a statement has to wait for the earlier statement to get executed. 

- Example: 
```sh
<script>
    document.write("Hi"); // First
    document.write("<br>");
 
    document.write("Talbia") ;// Second
    document.write("<br>");
   
    document.write("How are you?"); // Third
 </script>
```
- Output: 
```sh
	Hi
	Talbia
	How are you?
```

In the above code snippet, we can see the codes work in a sequence. The first line of the code Hi will be logged first then the second line Talbia will be logged and then after its completion, the third line would be logged How are you?
Every line of code waits for its previous one to get executed first and then the next.


```ssh
Asynchronous JavaScript:
```
Asynchronous code allows the program to be executed immediately whereas the synchronous code will block further execution of the remaining code until it finishes the current one. Functions running in parallel with other functions are called Asynchronous. For example, Email, Messages via any instant messaging app (e.g. WhatsApp messenger, RingCentral Message, Slack), Messaging via project management tools such as Basecamp, Trello etc.

A good example is JavaScript setTimeout(). 

- Example:
```sh
<script>
    document.write("Hi");
    document.write("<br>");
  
    setTimeout(() => {
        document.write("Let's see what happens");
    }, 2000);
  
    document.write("<br>");
    document.write("End");
    document.write("<br>");
</script>
```
- Output:
```sh
	Hi 
	End
	Let's see what happens
```
In the above code snippet, first it `logs in Hi` then rather than executing the setTimeout function it `logs in End` and then it `runs the setTimeout function.`

#### _JavaScript is always synchronous and single-threaded by default. If you're executing a JavaScript block of code on a page then no other JavaScript on that page will currently be executed. JavaScript is only asynchronous in the sense that it can make, for example, Ajax calls._
