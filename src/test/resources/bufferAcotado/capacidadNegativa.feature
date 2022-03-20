#Author: francisco.rodriguezcordoba@uma.es
Feature: Capacity

Scenario: Cero capacity
Given I create a buffer with capacity cero
Then output should throw an IllegalArgumentException

Scenario: Negative capacity
Given I create a buffer with a negative capacity
Then output should throw another IllegalArgumentException
