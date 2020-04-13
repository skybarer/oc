package com.covid.oc.model;

import java.io.Serializable;

public final class Meta implements Serializable {
    public final Double code;
    public final String description;
    public final String timestamp;

    public Meta(Double code, String description, String timestamp) {
        this.code = code;
        this.description = description;
        this.timestamp = timestamp;
    }
}
