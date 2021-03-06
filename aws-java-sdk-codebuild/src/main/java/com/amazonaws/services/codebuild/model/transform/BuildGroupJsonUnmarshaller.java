/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BuildGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildGroupJsonUnmarshaller implements Unmarshaller<BuildGroup, JsonUnmarshallerContext> {

    public BuildGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuildGroup buildGroup = new BuildGroup();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("identifier", targetDepth)) {
                    context.nextToken();
                    buildGroup.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    context.nextToken();
                    buildGroup.setDependsOn(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ignoreFailure", targetDepth)) {
                    context.nextToken();
                    buildGroup.setIgnoreFailure(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("currentBuildSummary", targetDepth)) {
                    context.nextToken();
                    buildGroup.setCurrentBuildSummary(BuildSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("priorBuildSummaryList", targetDepth)) {
                    context.nextToken();
                    buildGroup.setPriorBuildSummaryList(new ListUnmarshaller<BuildSummary>(BuildSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return buildGroup;
    }

    private static BuildGroupJsonUnmarshaller instance;

    public static BuildGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildGroupJsonUnmarshaller();
        return instance;
    }
}
