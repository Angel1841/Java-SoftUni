package Telephony;

import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        return urls.stream().
                map(url -> url.matches(".*\\d+.*") ? "Invalid URL!" : "Browsing: " + url + "!").
                collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String call() {
         return numbers.stream().
                 map(number -> number.matches(".*\\D+.*") ? "Invalid number!" : "Calling... " + number).
                 collect(Collectors.joining(System.lineSeparator()));
    }
}
