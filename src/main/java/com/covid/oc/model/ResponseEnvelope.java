package com.covid.oc.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseEnvelope implements Serializable {
    public final Meta meta;
    public final Object data;

    public ResponseEnvelope(Meta meta, Object data) {
        this.meta = meta;
        this.data = data;
    }
}
