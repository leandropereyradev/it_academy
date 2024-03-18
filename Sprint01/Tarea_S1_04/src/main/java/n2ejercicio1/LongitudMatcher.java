package n2ejercicio1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class LongitudMatcher extends FeatureMatcher<String, Integer> {

    public LongitudMatcher(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "una cadena con longitud", "longitud");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }

    public static LongitudMatcher tieneLongitud(Matcher<? super Integer> subMatcher) {
        return new LongitudMatcher(subMatcher);
    }
}
