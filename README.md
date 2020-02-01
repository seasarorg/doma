Doma version 1
========================================

Doma is a Database access framework for Java 6 and above. 

Doma uses [Annotation Processing Tool][apt] to generate source code and validate sql mappings at *compile time*.

Notice
--------

- This is Doma 1.
- The new version Doma 2 is developed at [domaframework/doma](https://github.com/domaframework/doma). 

Maintenance Policy
------------------

We accepts only bug fixes for Doma 1. We are going to include new features in Doma 2.

Build with Maven
----------------

To build with Maven, add the dependency listed below to your pom.xml file:

```xml
<dependency>
  <groupId>org.seasar.doma</groupId>
  <artifactId>doma</artifactId>
  <version>1.38.1</version>
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

```sh
$ git clone https://github.com/seasarorg/doma.git
$ cd doma/doma
$ ./mvnw clean install
```

Issues
------

### version 1.38.1 and above
https://github.com/seasarorg/doma/issues

### version 1.38.0 and below
https://www.seasar.org/issues/projects/DOMA/issues

License
-------

Apache License, Version 2.0

  [apt]: http://docs.oracle.com/javase/6/docs/technotes/guides/apt/index.html
