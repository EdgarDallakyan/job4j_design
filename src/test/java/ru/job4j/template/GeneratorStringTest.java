package ru.job4j.template;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

@Disabled("Тесты отключены.")
class GeneratorStringTest {
    @Test
    public void whenGeneratorGetTemplate() {
        Generator generatorString = new GeneratorString();
        Map<String, String> map = new HashMap<>();
        map.put("name", "Petr");
        map.put("subject", "you");
        String result = "I am a Petr Arsentev, Who are you?";
        assertThat(result).isEqualTo(generatorString.produce("I am a ${name}, Who are ${subject}?", map));
    }
    @Test
    public void whenGeneratorNotKeysThenGetException() {
        Generator generatorString = new GeneratorString();
        Map<String, String> map = new HashMap<>();
        map.put("name", "Boris");
        assertThatThrownBy(() -> generatorString.produce("I am a ${name} ${surname}", map))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    public void whenGeneratorNotMoreKeysThenGetException() {
        Generator generatorString = new GeneratorString();
        Map<String, String> map = new HashMap<>();
        map.put("name", "Boris");
        map.put("surname", "Smolov");
        map.put("age", "30");
        assertThatThrownBy(() -> generatorString.produce("I am a ${name} ${surname}", map))
                .isInstanceOf(IllegalArgumentException.class);
    }
}