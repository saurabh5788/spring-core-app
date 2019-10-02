package com.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.beans"})
public class SpringCoreBeanAutoScanDefinition {}
