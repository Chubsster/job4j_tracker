package ru.job4j.tracker.inheritance;

import org.junit.jupiter.api.Test;
import ru.job4j.inheritance.TextReport;

import static org.assertj.core.api.Assertions.assertThat;

public class TextReportTest {

    @Test
    public void whenTestGenerateMethod() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"Report's name\"," + ln
                + "\t\"body\" : \"Report's body\"" + ln
                + "}";
        String name = "Report's name";
        String body = "Report's body";
        String result = new TextReport.JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNameIsDavidBodyIsNameSong() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"David Gilmour\"," + ln
                + "\t\"body\" : \"Shine On You Crazy Diamond\"" + ln
                + "}";
        String name = "David Gilmour";
        String body = "Shine On You Crazy Diamond";
        String result = new TextReport.JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }
}