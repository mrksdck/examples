Rectangles
==========

About this code in short : subclasses should yield same results in tests as there parent ones.

Code as exercise/example of [LSP](https://en.wikipedia.org/wiki/Liskov_substitution_principle) as an invitation for discussion about [SOLID](https://en.wikipedia.org/wiki/SOLID)

* The example in [com.example.setter](src/main/java/com/example/setter) uses setters to pass values into classes, therefore a square is not treated as a special rectangle.

* The example in [com.example.constructor](src/main/java/com/example/constructor) one uses constructors for passing values, which makes the square just a convenience class for a special rectangle.

The calculation of area value is implemented in each class with its specialty in mind, so then the outcome is different and shows some weaknesses ... .

Problem here is also a different violation of SOLID principles, since each class calculates its area value, it has to much responsibility.
