package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balBracketsContainingNonBracketChar() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balBracketsContainedInNonBracketChar(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balBracketsBeforeNonBracketChar(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void nestedBalanced(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void sequencialBalanced(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void unBalancedBracketsPreceeding(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void unBalancedBracketWithNonBracketChar(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void openBracketOnly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void nonBalancedOnly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedUnbalanced(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }

    @Test
    public void closedBracketOnly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void closedBracketWithNonbracketChar(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]"));

        }
    }


