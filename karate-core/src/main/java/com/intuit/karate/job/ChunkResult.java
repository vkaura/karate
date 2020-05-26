/*
 * The MIT License
 *
 * Copyright 2019 Intuit Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intuit.karate.job;

import com.intuit.karate.core.Scenario;
import com.intuit.karate.core.ScenarioResult;

/**
 *
 * @author pthomas3
 */
public class ChunkResult {

    public final FeatureScenarios parent;
    public final Scenario scenario;
    private String chunkId;
    protected ScenarioResult result;
    private long startTime;

    public ChunkResult(FeatureScenarios parent, Scenario scenario) {
        this.parent = parent;
        this.scenario = scenario;
    }

    public String getChunkId() {
        return chunkId;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public ScenarioResult getResult() {
        return result;
    }

    public void setResult(ScenarioResult result) {
        this.result = result;
    }

}
