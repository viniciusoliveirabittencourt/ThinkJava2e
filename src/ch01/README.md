# Chapter 1
## What is a computer ?
On our days, its more common we refer a desktops or notebooks when we talk about computers, but we have a more generalist definition:
_A computer is any device that store and processes data._ That means a computer can storage data, made calculus and logic operators and display the results.

In a generalist way, electronic computers are basically two components, a processor, how made the calculus and logic, and a memory (or RAM), how storage temporarily the data.

## What is programming?
A program is a sequence of instructions that specifies how a hardware will perform.
Some basic instructions appears in most programming languages, they are:
- **input:** Get Data
- **output:** Display Data
- **math:** Perform basic mathematical
- **decision:** Check for certain condition and execute the appropriate code
- **repetition:** Perform an action repeatedly

## The Hello World Program
The Hello World program, you can check on file [HelloWorld](HelloWorld.java), have a:
- **statement:** _System.out.println("Hello World!");_ A statement is a line of code that performs a basic action, this line is a print statement or output code.
- **method:** _public static void main(String[] args)_ A method is a sequence of statements, this one is called _main_ and is a especial method, every java program starts and ends in _main_
- **class:** _public class HelloWorld_ A class is a sequence of methods. One not mandatory rule is the class need to start with a capital letter, like HelloWorld, not helloWorld, is not mandatory but are a good practices. One rule on Java, is the file name and the class, need to have the same name, so, with you will construct a class called MyClass, the file name will need to be MyClass.java too.

In java, we use curly braces to group things, so a method inside a class will need to be in curly braces _MyClass { main {} }_