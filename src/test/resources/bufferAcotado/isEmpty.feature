#Author: francisco.rodriguezcordoba@uma.es
Feature: IsEmpty

Scenario: Check if the buffer is Empty
Given I create a buffer with capacity two
When I put 1 in the buffer
Then output of the buffer should be "false"


Scenario: Check if the new buffer is Empty
Given I create a buffer with capacity three
When I put 2 in the new buffer
When I remove the head of the buffer
Then new output of the buffer should be "true"

