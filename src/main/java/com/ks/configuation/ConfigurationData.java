package com.ks.configuation;

import lombok.Data;

import java.util.List;

@Data
public class ConfigurationData {
    private String configName;
    private List<Host> hosts;
}
