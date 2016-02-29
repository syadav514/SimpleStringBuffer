# SimpleStringBuffer
Implementation of append() and toString() methods

StringBuffer Project version 1.0 29/02/2016

Description
======================
StringBuffer class has append method ,whose functionality is to append the strings ,
so here I have provided my own implementation of Append method of StringBuffer Class.

Algorithm
===============
take one array of char and two int variables.</br>
write one default constructor of class with default capacity of 16.</br>
write one parameterized constructor initializing the size and array length.</br>
write append method with string as parameterized,</br>
  i)check if string is null return "null" string,</br>
  ii)if length of array is greater than the capacity then take whichever is max (2*capacity,length) and assign the size of array with that length,
     a>traverse the old array and put characters in new array,
     b>now the old array will point to new array and capacity would be new array capacity,</br>
  iii)else traverse the string and put the character of string to the old array	starting from lengthofold array +i ,
     a>now new length would be length+string length;</br>
	 
write toString method for string.

output and input
================
so if we provide any string to append method it should append the string with previous string and return the new string.
