package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "19051e35151d80735b85af3e723efaf874ed5253e8732813cf16a4194970ab97";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPutToken(endPoint, idUser, TOKEN, name, email);
    }

    public static void validatePutResponse(Integer statusCode, String name, String email) {
        RestInteractions.validatecode(statusCode);
        String pathName = "name";
        String pathEmail = "email";
        RestInteractions.validateDataResponse(name, email, pathName, pathEmail);
    }
}
