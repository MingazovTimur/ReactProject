package ru.mingazov.task20;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown = true)

@JsonAutoDetect
public class JsonJoke {

    private String setup;

    private String punchline;

    public JsonJoke() {
    }

    public JsonJoke(String setup, String punchline) {
        this.setup = setup;
        this.punchline = punchline;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return
                "Сетап: " + setup + '\n' +
                        "." + '\n' +
                        "." + '\n' +
                        "." + '\n' +
                        "." + '\n' +
                        "." + '\n' +
                        "." + '\n' +
                "Панчлайн: " + punchline ;
    }

    public static void getOne(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            URL url = new URL("https://official-joke-api.appspot.com/random_joke");
            {
                JsonJoke joke = objectMapper.readValue(url, JsonJoke.class);
                System.out.println(joke);
            }

        } catch (IOException e) {
            System.out.println("Ошибка входа-выхода");

        }
    }

}
