package com.example.decisionservice.dao;

import com.example.decisionservice.model.Decision;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class DecisionDao {
    Pattern pattern = Pattern.compile("^([5-9][0-9][0-9]|1000)$");

    public Decision getDecisionStatus(
            final String value
    ){
        Matcher matcher  = pattern.matcher(value) ;
        return matcher.find()   ? new Decision("accepted") : new Decision("rejected");
    }
}
