#Author: francisco.rodriguezcordoba@uma.es
Feature: IsFull

Scenario: Check if the buffer is full
Given I create a buffer with capacity two
When I put 2 and 4 
Then output should be "true"

Scenario: Check if it is possible to put an element in a full buffer
Given I create a buffer with capacity two
When I put 2 and 4
Then output of this should throw an exception