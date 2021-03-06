/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.fabric8.funktion.model.steps;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.fabric8.funktion.model.StepKinds;

/**
 * Splits the payload into multiple messages
 */
@JsonPropertyOrder({"expression", "steps"})
public class Split extends ChildSteps<Split> {
    private String expression;

    public Split() {
        super(StepKinds.SPLIT);
    }

    public Split(String expression) {
        this();
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Split: " + expression;
    }

    public String getKind() {
        return StepKinds.SPLIT;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
