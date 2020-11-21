Doma version 1
========================================

Doma is a Database access framework for Java 6 and above. 

Doma uses [Annotation Processing Tool][apt] to generate source code and validate sql mappings at *compile time*.

[![CI](https://github.com/seasarorg/doma/workflows/CI/badge.svg)](https://github.com/seasarorg/doma/actions?query=workflow%3ACI)
[![Google group : doma-user](https://img.shields.io/badge/Google%20Group-doma--user-orange.svg)](https://groups.google.com/g/doma-user)
[![project chat](https://img.shields.io/badge/zulip-join_chat-green.svg)](https://domaframework.zulipchat.com)

Notice
--------

- This is Doma 1.
- The new version Doma 2 is developed at [domaframework/doma](https://github.com/domaframework/doma). 

Maintenance Policy
------------------

We accept only bug fixes for Doma 1. We are going to include new features in Doma 2.

Documentation
-------------

http://doma.seasar.org/

Google Group
------------

https://groups.google.com/g/doma-user

Chatroom
---------------------

https://domaframework.zulipchat.com

Build with Maven
----------------

To build with Maven, add the dependency listed below to your pom.xml file:

```xml
<dependency>
  <groupId>org.seasar.doma</groupId>
  <artifactId>doma</artifactId>
  <version>1.38.2</version>
</dependency>
```

In addition, if you use Doma 1.38.0 and below, add the repository listed below to your pom.xml file:

```xml
<repositories>
  <repository>
    <id>maven.seasar.org</id>
    <name>The Seasar Foundation Maven2 Repository</name>
    <url>http://maven.seasar.org/maven2</url>
  </repository>
</repositories>
```

Build Doma 1 from Source
------------------------

Install JDK 8.

Clone the repository and Run the maven command as follows:

```sh
$ git clone https://github.com/seasarorg/doma.git
$ cd doma/doma
$ ./mvnw clean install
```

Issues
------

### version 1.37.0 and above
https://github.com/seasarorg/doma/issues

### version 1.36.0 and below
https://www.seasar.org/issues/projects/DOMA/issues

License
-------

Apache License, Version 2.0

  [apt]: http://docs.oracle.com/javase/6/docs/technotes/guides/apt/index.html
