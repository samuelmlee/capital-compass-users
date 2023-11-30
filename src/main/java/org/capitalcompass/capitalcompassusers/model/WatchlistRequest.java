package org.capitalcompass.capitalcompassusers.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class WatchlistRequest {
    @NotNull
    private String name;
    private List<String> tickers;
}
