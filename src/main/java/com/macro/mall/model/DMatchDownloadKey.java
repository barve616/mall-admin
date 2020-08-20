package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchDownloadKey implements Serializable {
    private String matchKey;

    private static final long serialVersionUID = 1L;

    public String getMatchKey() {
        return matchKey;
    }

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchKey=").append(matchKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}