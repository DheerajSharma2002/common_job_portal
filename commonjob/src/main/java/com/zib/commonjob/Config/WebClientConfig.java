package com.zib.commonjob.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    public WebClient.Builder webClient() {
        return WebClient.builder();
    }
}
