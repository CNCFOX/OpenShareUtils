package com.cfox.openshare.http;

import java.util.Map;

/**
 * <br/>************************************************
 * <br/>PROJECT_NAME : OpenShare
 * <br/>PACKAGE_NAME : com.cfox.openshare.http
 * <br/>AUTHOR : CFOX
 * <br/>MSG :
 * <br/>************************************************
 */
public class ReqBuild {

    public static final String GET = "get";
    public static final String POST = "post";

    public String reqType;
    public String reqUrl;
    public Map<String, String> params;
}
