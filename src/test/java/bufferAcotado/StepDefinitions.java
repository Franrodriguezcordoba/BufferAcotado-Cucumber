package bufferAcotado;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	bufferAcotado<Integer> buffer;
	bufferAcotado<Integer> bufferEmpty;
	
	
	
	@Given("I create a buffer with capacity two")
	public void i_create_a_buffer_with_capacity_two() {
	    buffer = new bufferAcotado<Integer>(2);
	}
	@When("I put {int} and {int}")
	public void i_put_and(Integer int1, Integer int2) {
	    buffer.put(int1);
	    buffer.put(int2);
	}
	@Then("output should be {string}")
	public void output_should_be(String expectedValue) {
		Boolean expValue= Boolean.parseBoolean(expectedValue);
	    assertEquals(expValue,buffer.isFull());
	}
	@When("I put {int} in the buffer")
	public void i_put_in_the_buffer(Integer int1) {
	    buffer.put(1);
	}
	@Then("output of the buffer should be {string}")
	public void output_of_the_buffer_should_be(String expectedValue) {
		Boolean expValue= Boolean.parseBoolean(expectedValue);
	    assertEquals(expValue,buffer.isEmpty());
	    
	}
	@Given("I create a buffer with capacity three")
	public void i_create_a_buffer_with_capacity_three() {
	    bufferEmpty = new bufferAcotado<Integer>(3);
	   
	}

	@When("I put {int} in the new buffer")
	public void i_put_in_the_new_buffer(Integer int1) {
	    bufferEmpty.put(3);
	}
	@When("I remove the head of the buffer")
	public void i_remove_the_head_of_the_buffer() {
	    bufferEmpty.get();
	}

	@Then("new output of the buffer should be {string}")
	public void new_output_of_the_buffer_should_be(String expectedValue) {
		Boolean expValue= Boolean.parseBoolean(expectedValue);
	    assertEquals(expValue,bufferEmpty.isEmpty());
	}
	
	
	@Then("output of this should throw an exception")
	public void output_of_this_should_throw_an_exception() {
		assertThrows(IllegalStateException.class, ()-> buffer.put(9));
	}
	
	@Given("I create a buffer with capacity cero")
	public void i_create_a_buffer_with_capacity_cero() {
		bufferAcotado<Integer> bufferCero;
	}
	@Then("output should throw an IllegalArgumentException")
	public void output_should_throw_an_illegal_argument_exception() {
		assertThrows(IllegalArgumentException.class, ()-> new bufferAcotado<Integer>(0));
	}
	
	@Given("I create a buffer with a negative capacity")
	public void i_create_a_buffer_with_a_negative_capacity() {
		bufferAcotado<Integer> bufferCero;
	}
	@Then("output should throw another IllegalArgumentException")
	public void output_should_throw_another_illegal_argument_exception() {
		assertThrows(IllegalArgumentException.class, ()-> new bufferAcotado<Integer>(-1));
	}




	


	
	



}
