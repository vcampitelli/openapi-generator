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

import com.google.common.collect.ImmutableMap;
import org.openapitools.codegen.CodegenConstants;

import java.util.Map;

public class XojoClientOptionsProvider implements OptionsProvider {
    public static final String NON_PUBLIC_API_VALUE = "false";
    public static final String PREPEND_FORM_OR_BODY_PARAMETERS_VALUE = "false";
    public static final String ENUM_UNKNOWN_DEFAULT_CASE_VALUE = "false";
    public static final String LIBRARY_VALUE = "httpsocket";
    public static final String SERIALIZATION_LIBRARY_VALUE = "xoson";
    public static final String PROJECT_NAME_VALUE = "OpenAPIClient";
    public static final String SUPPORTS_ASYNC_VALUE = "true";
    public static final String API_PACKAGE_VALUE = "APIs";
    public static final String MODEL_PACKAGE_VALUE = "Models";

    @Override
    public String getLanguage() {
        return "swift5";
    }

    @Override
    public Map<String, String> createOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder.put(CodegenConstants.NON_PUBLIC_API, NON_PUBLIC_API_VALUE)
                .put(CodegenConstants.PREPEND_FORM_OR_BODY_PARAMETERS, PREPEND_FORM_OR_BODY_PARAMETERS_VALUE)
                .put(CodegenConstants.LIBRARY, LIBRARY_VALUE)
                .put(CodegenConstants.SERIALIZATION_LIBRARY, SERIALIZATION_LIBRARY_VALUE)
                .put(CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE, ENUM_UNKNOWN_DEFAULT_CASE_VALUE)
                .put(CodegenConstants.SUPPORTS_ASYNC, SUPPORTS_ASYNC_VALUE)
                .put(CodegenConstants.API_PACKAGE, API_PACKAGE_VALUE)
                .put(CodegenConstants.MODEL_PACKAGE, MODEL_PACKAGE_VALUE)
                .put(CodegenConstants.API_NAME_PREFIX, "")
                .put(CodegenConstants.PROJECT_NAME, PROJECT_NAME_VALUE)
                .put(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR, "true")
                .put(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG, "true")
                .put(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG, "true")
                .put(CodegenConstants.ENSURE_UNIQUE_PARAMS, "true")
                .put(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS, "false")
                .put(CodegenConstants.STRIP_ACCENTS, "false")
                .put(CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT, "false")
                .build();
    }

    @Override
    public boolean isServer() {
        return false;
    }
}
