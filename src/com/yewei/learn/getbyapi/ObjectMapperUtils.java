package com.yewei.learn.getbyapi;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapperUtils{

    private final static ObjectMapper defaultJSONMapper = newObjectMapper();
    public static ObjectMapper newObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JSONModule());
//        mapper.registerModule(new Hibernate3Module());
        mapper.setDateFormat(getDefaultTimeFormatter());
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return mapper;
    }
    public static SimpleDateFormat getDefaultTimeFormatter(){
        SimpleDateFormat defaultTimeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        defaultTimeFormatter.setTimeZone(TimeZone.getTimeZone(TimeZone.getDefault().getID()));
        return defaultTimeFormatter;
    }
    
    public static ObjectMapper getDefaultJSONMapper(){
        return defaultJSONMapper;
    }

}