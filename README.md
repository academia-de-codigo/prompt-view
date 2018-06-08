# Prompt View

Tiny Java library for producing interactive command line prompts 

## Examples

You can grab an integer input between 3 and 6 from the user using:

```java
// Create a new prompt attached to standard input/output
Prompt prompt = new Prompt(System.in, System.out);

// Instantiate an input scanner for integers between 3 and 6
IntegerRangeInputScanner scanner = new IntegerRangeInputScanner(3, 6);

// Grab the user in a loop until a valid input is inserted
int userInput = prompt.getUserInput(scanner);

```

Displaying a menu with a couple of options is achieved by using a different type of input scanner instance:

```java
// Define some options for the menu
String[] options = {"Deposit", "Withdraw"};

// Create a new prompt attached to standard input/output
Prompt prompt = new Prompt(System.in, System.out);

// Instantiate a menu scanner 
MenuInputScanner scanner = new MenuInputScanner(options);

// Setup the menu prompt message
scanner.setMessage("Choose an option: ");

// Grab the user in a loop until a valid input is inserted
int userInput = prompt.getUserInput(scanner);
```

Hide your password from prying eyes:

```java
// Create a new prompt attached to standard input/output
Prompt prompt = new Prompt(System.in, System.out);

// Instantiate a password input scanner 
PasswordInputScanner scanner = new PasswordInputScanner();

// Grab that password 
String password = prompt.getUserInput(scanner);
```

:exclamation: __Password Masking__  might not work and fallback to clear text on IDEs or other environments where the java virtual machine does not have a console. 

----

The examples folder contains working examples for other input scanner types.

