package com.example.decisionservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;
import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Decision {
    private final String outcome;

    public Decision(final String outcome) {
        this.outcome = outcome;
    }

    public String getOutcome() {
        return outcome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decision decision = (Decision) o;
        return Objects.equals(outcome, decision.outcome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outcome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Decision.class.getSimpleName() + "[", "]")
                .add("outcome='" + outcome + "'")
                .toString();
    }
}
