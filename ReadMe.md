## What is framework
Framework provides well defined structure for your application or test suite. 

## What are different kinds of frameworks
> Data Driven Framework
> Keyword Driven Framework 
> Hybrid Framework

## Data Driven Framework 
In data driven framework test execution flow is designed based on data flow in test case. 
in data driven framework your test cases and data is tightly coupled 
in most cases data is sourced from external source( file, database, excel)

## Keyword Driven Framework 
In Keyword driven framework test execution is controlled by set of keywords 
these keywords are stored in central place/file like excel. 

## Hybrid 
It is combination of data driven as well a keyword driven framework 

### Typical Structure of Framework.
 base-package <br>
 > conf
 > data-management
 > driver management ( to support multiple drivers )
 > pages
>  reports
>  utils 
>  test case management

### What is PageFactory 
Page factory is class which is used to initialize the page objects. It has method 
PageFactory.init(drive, PageClass.class)

