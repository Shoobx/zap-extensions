/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2022 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.addon.paramminer;

public class ParamMinerConfig {
    private String url;
    private boolean addFcbzCacheBuster;
    private boolean useBasicWordlists;
    private boolean useCustomWordlists;
    private boolean skipBoringHeaders;
    private int threadPoolSize;
    private String context;

    public ParamMinerConfig() {
        this.url = "";
        this.addFcbzCacheBuster = false;
        this.useBasicWordlists = true;
        this.useCustomWordlists = false;
        this.skipBoringHeaders = false;
        this.threadPoolSize = 4;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getAddFcbzCacheBuster() {
        return addFcbzCacheBuster;
    }

    public void setAddFcbzCacheBuster(boolean addFcbzCacheBuster) {
        this.addFcbzCacheBuster = addFcbzCacheBuster;
    }

    public boolean getUseBasicWordlists() {
        return useBasicWordlists;
    }

    public void setUseBasicWordlists(boolean useBasicWordlists) {
        this.useBasicWordlists = useBasicWordlists;
    }

    public boolean getUseCustomWordlists() {
        return useCustomWordlists;
    }

    public void setUseCustomWordlists(boolean useCustomWordlists) {
        this.useCustomWordlists = useCustomWordlists;
    }

    public boolean getSkipBoringHeaders() {
        return skipBoringHeaders;
    }

    public void setSkipBoringHeaders(boolean skipBoringHeaders) {
        this.skipBoringHeaders = skipBoringHeaders;
    }

    public int getThreadpoolSize() {
        return threadPoolSize;
    }

    public void setThreadpoolSize(String string) {
        threadPoolSize = Integer.parseInt(string);
    }

    public String getContext() {
        return this.context;
    }

    public void setContext(String stringValue) {
        this.context = stringValue;
    }
}
