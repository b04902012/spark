# Spark Shell
## Basic Syntax

var: define a variable

val: define an immutable variable

sc.textFile('filePath'): Creates an RDD whose content is the lines of the file.

## Transformations
### ```map(func)```
    
Return a new distributed dataset formed by passing each element of the source through a function ```func```.

    val dataDouble=data.map(_*2)

### ```filter(func)```

Return a new dataset formed by selecting those elements of the source on which func returns true.

    val dataLong=data.map(_.length()>100)
    
*```func``` must return Boolean*

### 
