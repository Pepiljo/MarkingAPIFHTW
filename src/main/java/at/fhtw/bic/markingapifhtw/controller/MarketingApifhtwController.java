package at.fhtw.bic.markingapifhtw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingApifhtwController {
    @GetMapping("/mark")
    public double calculateMark (@RequestParam double percentage){
        if (percentage>=88 && percentage<=100)
            return 1;
        else if (percentage>=75 && percentage<88)
            return 2;
        else if (percentage>=63 && percentage<75)
            return 3;
        else if (percentage>=50 && percentage<63)
            return 4;
        else if (percentage<50 && percentage>=0)
            return 5;
        else return 0; //im Fall von falscher Eingabe
    }
}
