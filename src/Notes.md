## Selenium Waits 
### Implicit Waits 
Implicit waits are applied on driver level, they are global in nature, 
drive will be force to wait for every element, once it wait it set, 
```java
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
```
We are adding a implicit wait for 10 sec, this doesn't mean 
that driver will wait for 10 sec, driver will implement poll and wait 
mechanism, it will continue to poll for an element every 250 millisecond
asap it has element, it will come out from loop. 

