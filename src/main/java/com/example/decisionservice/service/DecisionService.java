package com.example.decisionservice.service;

import com.example.decisionservice.dao.DecisionDao;
import com.example.decisionservice.model.Decision;
import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    public final DecisionDao decisionDao;

    public DecisionService(final DecisionDao decisionDao){
        this.decisionDao = decisionDao;
    }

    public Decision getDecisionStatus(
            final String value
    ){
        return decisionDao.getDecisionStatus(value);
    }
}
