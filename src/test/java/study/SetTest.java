package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
         numbers = new HashSet<>();
         numbers.add(1);
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(5);
    }

    @Test
    int getSize(){
        return numbers.size();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void containsElements_ShouldReturnTrueForElementsInSet(int input){
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:true"}, delimiter = ':')
    void containsElements_ShouldGenerateTheExpectedResults(int input, boolean expected) {
        boolean contains = numbers.contains(input);
        assertThat(contains).isEqualTo(expected);
    }
}
