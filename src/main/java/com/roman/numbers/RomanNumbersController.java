package com.roman.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller to get roman number equivalent of a given Integer.
 *
 * Input: Integer, requires a query parameter of type Integer between 1-3999
 * Returns String
 *
 * Ex: http://localhost:8080/romannumeral?query=1
 */
@RestController
public class RomanNumbersController {

    Logger log = LoggerFactory.getLogger(RomanNumbersController.class);

    RomanNumbersService romanNumbersService;

    public RomanNumbersController(RomanNumbersService romanNumbersService) {
        this.romanNumbersService = romanNumbersService;
    }

    @RequestMapping(value = "/romannumeral", method = RequestMethod.GET)
    public Object getRomanNumber(@RequestParam(value="query") Integer number) {
        log.info("Processing request to convert integer to roman number " + number);
        return romanNumbersService.getRomanNumber(number);
    }

}
