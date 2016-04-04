#ATOMIKOS_DEMO
---

A sample project to demonstrate how a web app can be built using a Spring and atomikos to make JTA work in tomcat.

####Environment
1.apache-tomcat-7.0.61
2.PostgreSQL 9.3
3.jre 7

####Installation
1.go to folder /Library/PostgreSQL/9.3/
2.change /Library/PostgreSQL/9.3/data Sharing & Permissions for 'everyone' to Privilege 'Read & Write'
3.change /Library/PostgreSQL/9.3/data/postgresql.conf Sharing & Permissions for 'everyone' to Privilege 'Read & Write'
4.update max_prepared_transactions = 100 in postgresql.conf
5.change /Library/PostgreSQL/9.3/data/postgresql.conf Sharing & Permissions for 'everyone' to Privilege 'Read'
6.change /Library/PostgreSQL/9.3/data Sharing & Permissions for 'everyone' to Privilege 'No Access'
7.restart service or restart computer

####Reference
- [Spring Security and Angular JS](https://spring.io/guides/tutorials/spring-security-and-angular-js/)
- [angular-rest-springsecurity](https://github.com/philipsorst/angular-rest-springsecurity)


