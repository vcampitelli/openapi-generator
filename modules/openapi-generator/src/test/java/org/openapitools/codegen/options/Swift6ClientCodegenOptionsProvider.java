/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.options;

import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.languages.Swift6ClientCodegen;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Swift6ClientCodegenOptionsProvider implements OptionsProvider {
    public static final String SORT_PARAMS_VALUE = "false";
    public static final String SORT_MODEL_PROPERTIES_VALUE = "false";
    public static final String ENSURE_UNIQUE_PARAMS_VALUE = "true";
    public static final String PROJECT_NAME_VALUE = "Swagger";
    public static final String RESPONSE_AS_VALUE = "test";
    public static final String NON_PUBLIC_API_REQUIRED_VALUE = "false";
    public static final String OBJC_COMPATIBLE_VALUE = "false";
    public static final String POD_SOURCE_VALUE = "{ :git => 'git@github.com:swagger-api/swagger-mustache.git'," +
            " :tag => 'v1.0.0-SNAPSHOT' }";
    public static final String POD_VERSION_VALUE = "v1.0.0-SNAPSHOT";
    public static final String POD_AUTHORS_VALUE = "podAuthors";
    public static final String POD_SOCIAL_MEDIA_URL_VALUE = "podSocialMediaURL";
    public static final String POD_LICENSE_VALUE = "'Apache License, Version 2.0'";
    public static final String POD_HOMEPAGE_VALUE = "podHomepage";
    public static final String POD_SUMMARY_VALUE = "podSummary";
    public static final String POD_DESCRIPTION_VALUE = "podDescription";
    public static final String POD_SCREENSHOTS_VALUE = "podScreenshots";
    public static final String POD_DOCUMENTATION_URL_VALUE = "podDocumentationURL";
    public static final String READONLY_PROPERTIES_VALUE = "false";
    public static final String SWIFT_USE_API_NAMESPACE_VALUE = "swiftUseApiNamespace";
    public static final String USE_BACKTICKS_ESCAPES_VALUE = "false";
    public static final String GENERATE_MODEL_ADDITIONAL_PROPERTIES_VALUE = "true";
    public static final String HASHABLE_MODELS_VALUE = "true";
    public static final String USE_JSON_ENCODABLE_VALUE = "true";
    public static final String ALLOW_UNICODE_IDENTIFIERS_VALUE = "false";
    public static final String STRIP_ACCENTS_VALUE = "false";
    public static final String PREPEND_FORM_OR_BODY_PARAMETERS_VALUE = "true";
    public static final String LIBRARY_VALUE = "alamofire";
    public static final String USE_SPM_FILE_STRUCTURE_VALUE = "false";
    public static final String SWIFT_PACKAGE_PATH_VALUE = "";
    public static final String ENUM_UNKNOWN_DEFAULT_CASE_VALUE = "false";
    public static final String API_STATIC_METHOD_VALUE = "true";
    public static final String COMBINE_DEFERRED_VALUE = "true";

    @Override
    public String getLanguage() {
        return "swift6";
    }

    @Override
    public Map<String, String> createOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder.put(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG, SORT_PARAMS_VALUE)
                .put(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG, SORT_MODEL_PROPERTIES_VALUE)
                .put(CodegenConstants.ENSURE_UNIQUE_PARAMS, ENSURE_UNIQUE_PARAMS_VALUE)
                .put(Swift6ClientCodegen.PROJECT_NAME, PROJECT_NAME_VALUE)
                .put(Swift6ClientCodegen.RESPONSE_AS, RESPONSE_AS_VALUE)
                .put(CodegenConstants.NON_PUBLIC_API, NON_PUBLIC_API_REQUIRED_VALUE)
                .put(Swift6ClientCodegen.OBJC_COMPATIBLE, OBJC_COMPATIBLE_VALUE)
                .put(Swift6ClientCodegen.POD_SOURCE, POD_SOURCE_VALUE)
                .put(CodegenConstants.POD_VERSION, POD_VERSION_VALUE)
                .put(Swift6ClientCodegen.POD_AUTHORS, POD_AUTHORS_VALUE)
                .put(Swift6ClientCodegen.POD_SOCIAL_MEDIA_URL, POD_SOCIAL_MEDIA_URL_VALUE)
                .put(Swift6ClientCodegen.POD_LICENSE, POD_LICENSE_VALUE)
                .put(Swift6ClientCodegen.POD_HOMEPAGE, POD_HOMEPAGE_VALUE)
                .put(Swift6ClientCodegen.POD_SUMMARY, POD_SUMMARY_VALUE)
                .put(Swift6ClientCodegen.POD_DESCRIPTION, POD_DESCRIPTION_VALUE)
                .put(Swift6ClientCodegen.POD_SCREENSHOTS, POD_SCREENSHOTS_VALUE)
                .put(Swift6ClientCodegen.POD_DOCUMENTATION_URL, POD_DOCUMENTATION_URL_VALUE)
                .put(Swift6ClientCodegen.READONLY_PROPERTIES, READONLY_PROPERTIES_VALUE)
                .put(Swift6ClientCodegen.SWIFT_USE_API_NAMESPACE, SWIFT_USE_API_NAMESPACE_VALUE)
                .put(Swift6ClientCodegen.USE_BACKTICK_ESCAPES, USE_BACKTICKS_ESCAPES_VALUE)
                .put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, "true")
                .put(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS, ALLOW_UNICODE_IDENTIFIERS_VALUE)
                .put(CodegenConstants.STRIP_ACCENTS, STRIP_ACCENTS_VALUE)
                .put(CodegenConstants.PREPEND_FORM_OR_BODY_PARAMETERS, PREPEND_FORM_OR_BODY_PARAMETERS_VALUE)
                .put(CodegenConstants.API_NAME_PREFIX, "")
                .put(CodegenConstants.LIBRARY, LIBRARY_VALUE)
                .put(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR, "true")
                .put(CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT, "true")
                .put(Swift6ClientCodegen.USE_SPM_FILE_STRUCTURE, USE_SPM_FILE_STRUCTURE_VALUE)
                .put(Swift6ClientCodegen.SWIFT_PACKAGE_PATH, SWIFT_PACKAGE_PATH_VALUE)
                .put(Swift6ClientCodegen.GENERATE_MODEL_ADDITIONAL_PROPERTIES,
                        GENERATE_MODEL_ADDITIONAL_PROPERTIES_VALUE)
                .put(Swift6ClientCodegen.HASHABLE_MODELS, HASHABLE_MODELS_VALUE)
                .put(Swift6ClientCodegen.USE_JSON_ENCODABLE, USE_JSON_ENCODABLE_VALUE)
                .put(Swift6ClientCodegen.MAP_FILE_BINARY_TO_DATA, "false")
                .put(Swift6ClientCodegen.USE_CUSTOM_DATE_WITHOUT_TIME, "false")
                .put(Swift6ClientCodegen.VALIDATABLE, "true")
                .put(Swift6ClientCodegen.ONE_OF_UNKNOWN_DEFAULT_CASE, "false")
                .put(Swift6ClientCodegen.USE_CLASSES, "false")
                .put(Swift6ClientCodegen.API_STATIC_METHOD, 
                        API_STATIC_METHOD_VALUE)
                .put(Swift6ClientCodegen.COMBINE_DEFERRED, 
                        COMBINE_DEFERRED_VALUE)
                .put(CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE, ENUM_UNKNOWN_DEFAULT_CASE_VALUE)
                .build();
    }

    @Override
    public boolean isServer() {
        return false;
    }
}
