package com.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ SpringCoreBeanDefinition.class,SpringCoreBeanAutoScanConfiguration.class })
public class SpringCoreImportConfiguration {}
