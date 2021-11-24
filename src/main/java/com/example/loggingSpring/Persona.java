package com.example.loggingSpring;

import lombok.Data;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.springframework.http.converter.json.GsonBuilderUtils;

@Data
public class Persona {

    Logger log;

    void prova()
    {
        String nombre;
        int edad;

    }


}
