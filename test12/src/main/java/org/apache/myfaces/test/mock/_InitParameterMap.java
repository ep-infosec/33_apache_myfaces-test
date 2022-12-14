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

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;

/**
 * ServletContext init parameters as Map.
 * 
 * @author Anton Koinov (latest modification by $Author: slessard $)
 * @version $Revision: 701829 $ $Date: 2008-10-05 19:06:02 +0200 (So, 05 Okt 2008) $
 * @since 1.0.0
 */
final class _InitParameterMap extends _AbstractAttributeMap<String>
{
    private final ServletContext _servletContext;

    _InitParameterMap(final ServletContext servletContext)
    {
        _servletContext = servletContext;
    }

    @Override
    protected String getAttribute(final String key)
    {
        return _servletContext.getInitParameter(key);
    }

    @Override
    protected void setAttribute(final String key, final String value)
    {
        throw new UnsupportedOperationException(
                "Cannot set ServletContext InitParameter");
    }

    @Override
    protected void removeAttribute(final String key)
    {
        throw new UnsupportedOperationException(
                "Cannot remove ServletContext InitParameter");
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Enumeration<String> getAttributeNames()
    {
        return _servletContext.getInitParameterNames();
    }

    @Override
    public void putAll(final Map<? extends String, ? extends String> t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear()
    {
        throw new UnsupportedOperationException();
    }
}
