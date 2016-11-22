/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package com.wso2telco.dep.mediator.entity.ussd;

import com.wso2telco.dep.mediator.entity.smsmessaging.CallbackReference;

public class Subscription {

	private String clientCorrelator;
    private String resourceURL;
    private ShortCodes[] shortCodeses;
    private CallbackReference callbackReference;

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public ShortCodes[] getShortCodeses() {
        return shortCodeses;
    }

    public void setShortCodeses(ShortCodes[] shortCodeses) {
        this.shortCodeses = shortCodeses;
    }

    public CallbackReference getCallbackReference() {
       return callbackReference;
    }

    public void setCallbackReference(CallbackReference callbackReference) {
        this.callbackReference = callbackReference;
    }
	
}
