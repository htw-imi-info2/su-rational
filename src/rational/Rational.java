package rational;

/**
 * Represents a Rational number.
 * Inspired by Eric S. Roberts: The Art and Science of Java.
 * https://cs.stanford.edu/people/eroberts/books/TheArtAndScienceOfJava/index.html
 * https://mitpress.mit.edu/sites/default/files/sicp/full-text/book/book-Z-H-14.html#%_sec_2.1.1
 * @author Barne Kleinen
 */
public class Rational {

    long numerator,denominator;

    public Rational(long number) {
        this(number, 1);
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational add(Rational other) {
        return new Rational(this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator);
    }

    public double getValue() {
        return (double) numerator / denominator;
    }
    @Override
    public String toString(){
        return String.format("%d/%d",numerator,denominator);

    }

}
