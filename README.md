# legal-sentence
This java program checks to see whether or not a given string is a legal sentence. If the string is legal, then the program will return true and print that it is a legal sentence, and if the string is not legal, then the program will do the opposite and return false.

The program has three main parts to it: a parser that splits the string into an array of words separated by spaces, a method that iterates through the words, and a method that returns the case values that must match the next word in order to be a legal sentence.
First, the given string is passed into the parameter of the check method.The method parses the string into an array of the words separated by spaces. 
Then, it iterates through the array of words in a for loop, and inside the for loop, the current word is passed into the parameter of the possibleTokens function. This function takes the keyword and, using a switch case statement, returns the possible next values based on the matching token. If there are no matches, then it returns an empty array, void of any keywords.
Back in the check function, that return value is checked with the current word in the array, and if the current word does not match any word in the returned array, then it is not a legal sentence and the program returns false. If there is a match however, the for loop moves onto the next word and checks it and so on. If the for loop is able to get through all the words without returning false, then program moves on to the last part of the compiler.

The final thing is to check if the last word in the array is a p or q, using an if statement. If it is, then the program finally returns true because the sentence is a legal sentence. Otherwise, it returns false.

One major challenge I had was figuring out the logic of the program. I am new to java, so I had never written a compiler before. It was my dad who told me about the "previous token being checked with the next token" logic, and afterwards I was able to figure out how to write the program. 
