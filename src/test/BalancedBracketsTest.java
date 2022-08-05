package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;


public class BalancedBracketsTest {

    //TODO: add tests here
    BalancedBrackets first_bracket;
    @Before
    public void initialBracket() {
        first_bracket = new BalancedBrackets();
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(first_bracket.hasBalancedBrackets("["));
    }
    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(first_bracket.hasBalancedBrackets("]["));
    }
    @Test
    public void openOnlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(first_bracket.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void mixedWordsBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(first_bracket.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void wordBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(first_bracket.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void middleOfWordBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(first_bracket.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void beforeWordBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(first_bracket.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(first_bracket.hasBalancedBrackets(""));
    }
}
