package com.google.api.services.sheets.v4;

import com.google.api.services.sheets.v4.model.*;
import java.io.*;
import com.google.api.client.http.*;
import com.google.api.client.googleapis.services.json.*;
import com.google.api.client.googleapis.services.*;
import com.google.api.client.util.*;

public class Get extends SheetsRequest<ValueRange>
{
    private static final String REST_PATH = "v4/spreadsheets/{spreadsheetId}/values/{range}";
    @Key
    private String spreadsheetId;
    @Key
    private String range;
    @Key
    private String valueRenderOption;
    @Key
    private String dateTimeRenderOption;
    @Key
    private String majorDimension;
    final /* synthetic */ Values this$2;
    
    protected Get(final Values this$2, final String a1, final String a2) {
        this.this$2 = this$2;
        super(this$2.this$1.this$0, "GET", "v4/spreadsheets/{spreadsheetId}/values/{range}", (Object)null, ValueRange.class);
        this.spreadsheetId = Preconditions.checkNotNull(a1, (Object)"Required parameter spreadsheetId must be specified.");
        this.range = Preconditions.checkNotNull(a2, (Object)"Required parameter range must be specified.");
    }
    
    public HttpResponse executeUsingHead() throws IOException {
        return super.executeUsingHead();
    }
    
    public HttpRequest buildHttpRequestUsingHead() throws IOException {
        return super.buildHttpRequestUsingHead();
    }
    
    @Override
    public Get set$Xgafv(final String s) {
        return (Get)super.set$Xgafv(s);
    }
    
    @Override
    public Get setAccessToken(final String accessToken) {
        return (Get)super.setAccessToken(accessToken);
    }
    
    @Override
    public Get setAlt(final String alt) {
        return (Get)super.setAlt(alt);
    }
    
    @Override
    public Get setCallback(final String callback) {
        return (Get)super.setCallback(callback);
    }
    
    @Override
    public Get setFields(final String fields) {
        return (Get)super.setFields(fields);
    }
    
    @Override
    public Get setKey(final String key) {
        return (Get)super.setKey(key);
    }
    
    @Override
    public Get setOauthToken(final String oauthToken) {
        return (Get)super.setOauthToken(oauthToken);
    }
    
    @Override
    public Get setPrettyPrint(final Boolean prettyPrint) {
        return (Get)super.setPrettyPrint(prettyPrint);
    }
    
    @Override
    public Get setQuotaUser(final String quotaUser) {
        return (Get)super.setQuotaUser(quotaUser);
    }
    
    @Override
    public Get setUploadType(final String uploadType) {
        return (Get)super.setUploadType(uploadType);
    }
    
    @Override
    public Get setUploadProtocol(final String uploadProtocol) {
        return (Get)super.setUploadProtocol(uploadProtocol);
    }
    
    public String getSpreadsheetId() {
        return this.spreadsheetId;
    }
    
    public Get setSpreadsheetId(final String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
    public String getRange() {
        return this.range;
    }
    
    public Get setRange(final String range) {
        this.range = range;
        return this;
    }
    
    public String getValueRenderOption() {
        return this.valueRenderOption;
    }
    
    public Get setValueRenderOption(final String valueRenderOption) {
        this.valueRenderOption = valueRenderOption;
        return this;
    }
    
    public String getDateTimeRenderOption() {
        return this.dateTimeRenderOption;
    }
    
    public Get setDateTimeRenderOption(final String dateTimeRenderOption) {
        this.dateTimeRenderOption = dateTimeRenderOption;
        return this;
    }
    
    public String getMajorDimension() {
        return this.majorDimension;
    }
    
    public Get setMajorDimension(final String majorDimension) {
        this.majorDimension = majorDimension;
        return this;
    }
    
    @Override
    public Get set(final String s, final Object o) {
        return (Get)super.set(s, o);
    }
    
    @Override
    public /* bridge */ SheetsRequest set(final String s, final Object o) {
        return this.set(s, o);
    }
    
    @Override
    public /* bridge */ SheetsRequest setUploadProtocol(final String uploadProtocol) {
        return this.setUploadProtocol(uploadProtocol);
    }
    
    @Override
    public /* bridge */ SheetsRequest setUploadType(final String uploadType) {
        return this.setUploadType(uploadType);
    }
    
    @Override
    public /* bridge */ SheetsRequest setQuotaUser(final String quotaUser) {
        return this.setQuotaUser(quotaUser);
    }
    
    @Override
    public /* bridge */ SheetsRequest setPrettyPrint(final Boolean prettyPrint) {
        return this.setPrettyPrint(prettyPrint);
    }
    
    @Override
    public /* bridge */ SheetsRequest setOauthToken(final String oauthToken) {
        return this.setOauthToken(oauthToken);
    }
    
    @Override
    public /* bridge */ SheetsRequest setKey(final String key) {
        return this.setKey(key);
    }
    
    @Override
    public /* bridge */ SheetsRequest setFields(final String fields) {
        return this.setFields(fields);
    }
    
    @Override
    public /* bridge */ SheetsRequest setCallback(final String callback) {
        return this.setCallback(callback);
    }
    
    @Override
    public /* bridge */ SheetsRequest setAlt(final String alt) {
        return this.setAlt(alt);
    }
    
    @Override
    public /* bridge */ SheetsRequest setAccessToken(final String accessToken) {
        return this.setAccessToken(accessToken);
    }
    
    @Override
    public /* bridge */ SheetsRequest set$Xgafv(final String s) {
        return this.set$Xgafv(s);
    }
    
    @Override
    public /* bridge */ AbstractGoogleJsonClientRequest set(final String s, final Object o) {
        return this.set(s, o);
    }
    
    @Override
    public /* bridge */ AbstractGoogleClientRequest set(final String s, final Object o) {
        return this.set(s, o);
    }
    
    @Override
    public /* bridge */ GenericData set(final String s, final Object o) {
        return this.set(s, o);
    }
}
