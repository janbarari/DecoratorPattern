# Decorator: Wrapper of an object
Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.

[![](https://img.shields.io/badge/Extensibility-blue.svg?style=flat)](https://github.com/janbarari/decoratorpattern)
[![](https://img.shields.io/badge/Structural-green.svg?style=flat)](https://github.com/janbarari/decoratorpattern)

#### ⬇️ Let me describe with an example:
Imagine you have a restaurant and want to create a menu for customers.
Let's explain it by pizza menu, There are five different pizza which is on the menu.
If we do not use a decorator-pattern to create an order, We have to create five different pizza classes and use that for getting customer orders. It works and you can get some orders from the customers,
But imagine someone wants to change the order a little bit. 
For example, adding some extra sauce, add some vegetables, and mix some different cheese.
You can't do it, because in run-time you can't add those items to your program.
If you want to create this order you need to create the new pizza item in the menu, which is not usable for other customers.

Let's use the decorator pattern in the program and see how it will work.
Instead of creating static pizza item's, you will create them dynamically at runtime.

For example, a normal pizza contains dough, some cheese, some sauce, vegetables, beef, tomato, and pepperoni 
Whenever a customer wants to create a specific one, You can easily do it like below
  
1- add a dough  
2- add vegetables  
3- add tomato  
4- add beef  
5- add french sauce  
6- add extra cheese  
  
Then you will create the order easily at runtime without creating a new item in your menu.