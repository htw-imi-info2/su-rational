package rational;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * uses Junit 5, see
 * https://junit.org/junit5/docs/current/user-guide/
 */
class RationalTest {

        /**
         * Sets up the test fixture.
         *
         * Called before every test case method.
         */
        @BeforeEach
        public void setUp()
        {
        }

        @Test
        public void shouldHaveIntegerConstructor()
        {
            Rational rational = new Rational(3);
            assertEquals("should be three",3.0,rational.getValue());
        }

        @Test
        public void shouldHaveRationalConstructor()
        {
            Rational rational = new Rational(1,2);
            assertEquals("1,2",0.5,rational.getValue());
        }

        @Test
        public void shouldHaveStringRepresentation()
        {
            Rational rational = new Rational(1,2);
            assertEquals("1,2","1/2",rational.toString());
            assertEquals("1/5","1/5",((new Rational(1,5)).toString()));
        }

        @Test
        public void addition1()
        {
            // a/b + c/d = (ad + bc) / bd

            Rational a = new Rational(1,2);
            Rational b = new Rational(2,8);
            assertEquals("1/2 + 1/3",0.75,a.add(b));

        }

        @Test
        public void addition2()
        {
            //
            assertEquals("1.0/2.0 + 1.0/3.0 + 1.0/6.0",0.999999999,1.0/2.0 + 1.0/3.0 + 1.0/6.0,0.0001);
            Rational a = new Rational(1,2);
            Rational b = new Rational(1,3);
            Rational c = new Rational(1,6);
            assertEquals("1/2 + 1/3 + 1/6",1.0,a.add(b).add(c));

        }

        @Test
        public void multiplikation(){
            // a/b * c/d = ac / bd
            fail("write a test case for multiplication!");
        }

        @Test
        public void subtraction(){
            // a/b - c/d = (ad-bc)/bd
            fail("write a test case for subtraction");
        }

        @Test
        public void division(){
            // a/b / c/d = ad / bc
            fail("write a test case for division");
        }
    }
