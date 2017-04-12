# NonEmptyString
Provides a NonEmptyString type for Scala.

## Getting NonEmptyString
If you're using SBT, add the following to your build file.
```scala
libraryDependencies += "com.claireneveu" %% "nonemptystring" % "1.0.0"
```

## API Documentation
`NonEmptyString` provides the same API as `String` except certain functions like `toUpperCase` return a `NonEmptyString`.

A total `head` function and a `tail` function are also provided.
