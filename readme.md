# J2Htmx

[![Maven Central Badge](https://img.shields.io/maven-central/v/me.kisoft/j2htmx)](https://search.maven.org/artifact/me.kisoft/j2htmx)
[![Discord](https://img.shields.io/discord/725789699527933952)](https://htmx.org/discord)

J2htmx is a set of extentions for [j2html](https://j2html.com/) to make it work better with [htmx](https://htmx.org/) attributes and
[hyperscript](https://hyperscript.org/)

## Usage

Import the latest version of the library from maven central

```xml
<dependency>
  <groupId>me.kisoft</groupId>
  <artifactId>j2htmx</artifactId>
  <version>2.0.0</version>
</dependency>
```

Afterwards, either import the htmx scripts from CDN yourself or use the ``withHtmxImports`` function on a ``ContainerTag``, which 
should ideally be your ``head`` tag


```java
html(
    withHtmxImport(
        head()
    ),
    body(/* stuff goes here */)
)

```

afterwards, you can use any of the htmx attributes using the ``hx`` static import, such as 

```java
div(
    div().withId("my-id"),
    button().withText("Click for a new Joke")
        .attr(hx.get("/my-path")
        .attr(hx.target("#my-id")
    )
)
```

All htmx attributes are supported. You can find them all [here](https://htmx.org/reference/)


### Attribute Generators

There is a convinience method, for generating attributes, allowing you to generate
attributes as a functional interface or class. This allows you to create re-usable 
attribute generators to use across components.

```java
div(
    div().withId("my-id"),
    button().withText("Click for a new Joke")
        .attr(hx.get("/my-path")
        .attr(hx.target(()->"#my-id")
    )
)
```

While they make a small difference in most cases, this allows us to more easily 
use random Ids and reusable attributes.


### Hyperscript support

You can use the ``withHyperscriptImport`` function to import hyperscript as well

```java
html(
    withHyperscriptImport(
        withHtmxImport(
            head()
        )
    ),
    body(/* stuff goes here */)
)
```

There is a ``hx.hyperscript`` method that you can use to add hyperscript to any
tag. you can find more about hyperscript [here](https://hyperscript.org/)
