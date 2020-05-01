package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class StepDefinitions {


    private int hours;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);

        System.out.println("step given: eat cuke " + cukes );
    }


    @When("I wait {int} hour")
    public void I_wait_few_hours(int hours) {

        System.out.println( "step two: wait " + hours + " hours");
    }


    @Then("my belly should growl")
    public void Belly_grow() {
        System.out.println("step 3");
        Assert.assertNotNull( hours );
    }


    @Given("^in the menu these items available$")
    public void intemsMenu(List<String> arg) {
        // что-то сделать
        System.out.println("Items got:");
        for (int i = 0; i < arg.size(); i++){
            System.out.println( arg.get(i) );
        }
    }

    @Then("^this text will be seen$")
    public void getText( String expectedMessage ){
        System.out.println("got message: ");
        System.out.println( expectedMessage);
    }



}
