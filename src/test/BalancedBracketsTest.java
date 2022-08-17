package test;

import main.BalancedBrackets;
import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    //The string may contain non-bracket characters as well
    public void stringMayContainNonBrackets() {
        String str = "[testWord]";
        assertEquals(hasBalancedBrackets(str),  true);
    }


    @Test
    //The string may contain non-bracket characters as well
    public void oneBracketShouldFail() {
        String str = "[testWord";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void oneCloseBracketShouldFail(){
        String str = "testWord]";
        assertEquals(hasBalancedBrackets(str),  false);
    }
    @Test
    //The string may contain non-bracket characters as well
    public void noBrackets() {
        String str = "testWord";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void reversedBracketShouldFail(){
        String str = "]testWord[";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void stringWithReverseBracketsShouldFail(){
        String str = "test]Word[";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void stringWithCorrectBracketsShouldPass(){
        String str = "test[Word]";
        assertEquals(hasBalancedBrackets(str),  true);
    }

    @Test
    public void stringWithTwoClosedBracketsShouldFail(){
        String str = "]]";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void TwoClosedBracketsShouldFail(){
        String str = "]]";
        assertEquals(hasBalancedBrackets(str),  false);
    }


    @Test
    public void StringWithTwoClosedBracketsShouldFail(){
        String str = "test]Word]";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void ReverseBracketsShouldFail(){
        String str = "][";
        assertEquals(hasBalancedBrackets(str),  false);
    }

    @Test
    public void EmptyStringShouldFail(){
        String str = " ";
        assertEquals(hasBalancedBrackets(str),  false);
    }
}
