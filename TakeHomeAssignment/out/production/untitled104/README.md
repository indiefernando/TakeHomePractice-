FIX THE CLASSES IN THE FOLDER, CATCH ANY EXCEPTIONS IN THE CODE WHERE YOU SEE FIT.
GOOD-LUCK :)


EXTRAS...

1.) Is the following code legal?

try {

} finally {

}

A try statement does not have to have a catch block if it has a finally block.
If the code in the try statement has multiple exit points and no associated catch clauses,
the code in the finally block is executed no matter how the try block is exited.

-----------------------------------------------

2.) What exception types can be caught by the following handler?

catch (Exception e) {

}

This handler catches exceptions of type Exception;
therefore, it catches any exception.
This can be a poor implementation because you are losing valuable information about the type of
exception being thrown and making your code less efficient.

-----------------------------------------------

3.) Is there anything wrong with this exception handler as written? Will this code compile?

try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}

This first handler catches exceptions of type Exception;
therefore, it catches any exception, including ArithmeticException.
The second handler could never be reached. This code will not compile.