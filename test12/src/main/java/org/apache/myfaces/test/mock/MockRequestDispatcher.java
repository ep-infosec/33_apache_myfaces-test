/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.myfaces.test.mock;

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @since 1.0.0
 * @author Jacob Hookom
 * @version $Id: MockRequestDispatcher.java 804043 2009-08-13 22:08:44Z lu4242 $
 */
public class MockRequestDispatcher implements RequestDispatcher
{

    protected final URL url;

    public MockRequestDispatcher(URL url)
    {
        this.url = url;
    }

    public void forward(ServletRequest request, ServletResponse response)
            throws ServletException, IOException
    {
        // TODO Auto-generated method stub

    }

    public void include(ServletRequest request, ServletResponse response)
            throws ServletException, IOException
    {
        // TODO Auto-generated method stub

    }

}
