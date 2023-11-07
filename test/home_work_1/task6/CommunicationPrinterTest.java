package home_work_1.task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunicationPrinterTest {

    @ParameterizedTest
    @DisplayName("Проверка приветствия Васи")
    @MethodSource("greetingProvide")
    public void welcomeVasya(ICommunicationPrinter greeting) {
        assertEquals("Привет!\n Я тебя так долго ждал", greeting.welcom("Вася"));
    }

    @ParameterizedTest
    @DisplayName("Проверка приветствия Анастасии")
    @MethodSource("greetingProvide")
    public void welcomeAnastasii(ICommunicationPrinter greeting) {
        assertEquals("Я тебя так долго ждал", greeting.welcom("Анастасия"));
    }

    @ParameterizedTest
    @DisplayName("Проверка приветствия другого человека")
    @MethodSource("greetingProvide")
    public void welcomeAnotherPerson(ICommunicationPrinter greeting) {
        assertEquals("Добрый день, а вы кто?", greeting.welcom("Татьяна"));
        assertEquals("Добрый день, а вы кто?", greeting.welcom("34;%мапиа"));
        assertEquals("Добрый день, а вы кто?", greeting.welcom("null"));
    }

    private static Stream<Arguments> greetingProvide() {
        return Stream.of(
                Arguments.of(new GreetingIfElseIf()),
                Arguments.of(new GreetingIfElse()),
                Arguments.of(new GreetingSwitch())
        );
    }
}
