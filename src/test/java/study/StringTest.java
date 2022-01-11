package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        // test1
        String input = "12";
        String[] answer = new String[]{"1","2"};
        String[] actual = input.split("");
        for(String ans: answer){
            assertThat(actual).contains(ans);
        }

        // test2
        input = "1";
        answer = new String[]{"1"};
        actual = input.split("");
        assertThat(actual).containsExactly(answer);
    }

    @Test
    String trim(){
        String input = "(1,2)";
        return input.substring(1,input.length()-1);
    }

    @Test
    void search(){
         String input = "abc";
         int[] indices = new int[]{1,3};
         for(int index: indices){
             if(index>=input.length()){
                 shouldThrowOutOfBoundsException(index, input.length());
             }
             System.out.printf("character at index %d = %c", index, input.charAt(index));
             System.out.println();
         }
    }
}
